package model;

import database.ConfigDB;
import entity.Project;
import entity.User;
import helper.Role;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProjectModel{

    public Project insert(Project project){

        Connection objConnection = ConfigDB.openConnection();

        try{
            String sql = "INSERT INTO projects(title, description, start_date, end_date, created_by) VALUES (?, ?, ?, ?, ?);";

            PreparedStatement objPrepare = objConnection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            objPrepare.setString(1, project.getTitle());
            objPrepare.setString(2, project.getDescription());
            objPrepare.setString(3, project.getStart_date().toString());
            objPrepare.setString(4, project.getEnd_date().toString());
            objPrepare.setInt(5, project.getCreated_by());


            objPrepare.execute();

            ResultSet objRest = objPrepare.getGeneratedKeys();

            while(objRest.next()){
                project.setId(objRest.getInt(1));
            }

            JOptionPane.showMessageDialog(null, "Project insertion was successful.");

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        ConfigDB.closeConnection();
        return project;
    }

    public List<Project> findByUser(int created_by){

        List<Project> listProjects = new ArrayList<>();

        Connection objConnection = ConfigDB.openConnection();

        try{


            String sql = "SELECT * FROM  projects WHERE created_by = ?;";

            PreparedStatement objPrepare = objConnection.prepareStatement(sql);

            objPrepare.setInt(1, created_by);


            ResultSet objResult = objPrepare.executeQuery();

            while(objResult.next()){

                Project project = new Project();

                project.setId(objResult.getInt("id"));
                project.setTitle(objResult.getString("title"));
                project.setDescription(objResult.getString("description"));
                project.setStart_date(LocalDate.parse(objResult.getString("start_date")));
                project.setEnd_date(LocalDate.parse(objResult.getString("end_date")));
                project.setCreated_by(objResult.getInt("created_by"));


                listProjects.add(project);
            }

        }catch (SQLException error){
            JOptionPane.showMessageDialog(null, error.getMessage());
        }

        ConfigDB.closeConnection();
        return listProjects;

    }

    public List<Project> findAll() {


        List<Project> listProjects = new ArrayList<>();

        Connection objConnection = ConfigDB.openConnection();

        try{

            String sql = "SELECT * FROM  projects;";

            PreparedStatement objPrepare =  objConnection.prepareStatement(sql);

            ResultSet objResult = objPrepare.executeQuery();

            while(objResult.next()){

                Project project = new Project();

                project.setId(objResult.getInt("id"));
                project.setTitle(objResult.getString("title"));
                project.setDescription(objResult.getString("description"));
                project.setStart_date(LocalDate.parse(objResult.getString("start_date")));
                project.setEnd_date(LocalDate.parse(objResult.getString("end_date")));
                project.setCreated_by(objResult.getInt("created_by"));

                listProjects.add(project);
            }

        }catch (SQLException error){
            JOptionPane.showMessageDialog(null, error.getMessage());
        }

        ConfigDB.closeConnection();
        return listProjects;
    }

    public List<Project> findAllVoluntary() {


        List<Project> listProjects = new ArrayList<>();

        Connection objConnection = ConfigDB.openConnection();

        try{

            String sql = "SELECT * FROM projects INNER JOIN users ON users.id = projects.created_by WHERE users.role = 'PUBLICANTE'";

            PreparedStatement objPrepare =  objConnection.prepareStatement(sql);

            ResultSet objResult = objPrepare.executeQuery();

            while(objResult.next()){

                Project project = new Project();

                project.setId(objResult.getInt("id"));
                project.setTitle(objResult.getString("title"));
                project.setDescription(objResult.getString("description"));
                project.setStart_date(LocalDate.parse(objResult.getString("start_date")));
                project.setEnd_date(LocalDate.parse(objResult.getString("end_date")));
                project.setCreated_by(objResult.getInt("created_by"));
                project.setName(objResult.getString("name"));

                listProjects.add(project);
            }

        }catch (SQLException error){
            JOptionPane.showMessageDialog(null, error.getMessage());
        }

        ConfigDB.closeConnection();
        return listProjects;
    }

    private List<User> showVoluntaryByProject(int project_id){
        List<User> listVoluntaries = new ArrayList<>();

        Connection objConnection = ConfigDB.openConnection();

        try{

            String sql = "SELECT * FROM inscriptions INNER JOIN users ON inscriptions.user_id = users.id\n" +
                    "WHERE inscriptions.project_id = ?;";

            PreparedStatement objPrepare = objConnection.prepareStatement(sql);

            objPrepare.setInt(1, project_id);

            ResultSet objResult = objPrepare.executeQuery();

            while(objResult.next()){

                User user = new User();

                user.setId(objResult.getInt("id"));
                user.setName(objResult.getString("name"));
                user.setEmail(objResult.getString("email"));
                user.setPassword(objResult.getString("password"));
                user.setRole(Role.valueOf(objResult.getString("role")));


                listVoluntaries.add(user);
            }

        }catch (SQLException error){
            JOptionPane.showMessageDialog(null, error.getMessage());
        }

        ConfigDB.closeConnection();
        return listVoluntaries;
    }

    public void showVoluntaryByProjects(int created_by){
        List<Project> listProjects = new ArrayList<>();
        String listVoluntaries = "";

        Connection objConnection = ConfigDB.openConnection();

        try{

            String sql = "SELECT * FROM projects WHERE created_by = ?;";

            PreparedStatement objPrepare = objConnection.prepareStatement(sql);

            objPrepare.setInt(1, created_by);

            ResultSet objResult = objPrepare.executeQuery();

            while(objResult.next()){

                Project project = new Project();

                project.setId(objResult.getInt("id"));
                project.setTitle(objResult.getString("title"));
                project.setDescription(objResult.getString("description"));
                project.setStart_date(LocalDate.parse(objResult.getString("start_date")));
                project.setEnd_date(LocalDate.parse(objResult.getString("end_date")));
                project.setCreated_by(objResult.getInt("created_by"));
                listProjects.add(project);

                listVoluntaries = "LIST VOLUNTARIES \n";
                for(User user :showVoluntaryByProject(project.getId())){
                    listVoluntaries += user.showVoluntaries() + "\n";
                }

                JOptionPane.showMessageDialog(null, project.showProject() + "\n" + listVoluntaries);
            }

        }catch (SQLException error){
            JOptionPane.showMessageDialog(null, error.getMessage());
        }

        //paso 7
        ConfigDB.closeConnection();
    }


}
