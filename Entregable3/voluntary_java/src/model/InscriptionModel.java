package model;

import database.ConfigDB;
import entity.Inscription;
import entity.Project;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class InscriptionModel {

    public Inscription insert(Inscription inscription){

        Connection objConnection = ConfigDB.openConnection();

        try{
            String sql = "INSERT INTO inscriptions(user_id, project_id) VALUES (?, ?);";

            PreparedStatement objPrepare = objConnection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);


            objPrepare.setInt(1, inscription.getUser_id());
            objPrepare.setInt(2, inscription.getProject_id());

            objPrepare.execute();
            //set the Date cause i can not retreive that value
            inscription.setDate(LocalDateTime.now());

            ResultSet objRest = objPrepare.getGeneratedKeys();

            while(objRest.next()){
                inscription.setId(objRest.getInt(1));

            }


            JOptionPane.showMessageDialog(null, "Project insertion was successful.");

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        ConfigDB.closeConnection();
        return inscription;
    }

    public List<Project> findProjectsByVoluntary(int userId){

        List<Project> listProjects = new ArrayList<>();

        Connection objConnection = ConfigDB.openConnection();

        try{


            String sql = "SELECT * FROM inscriptions INNER JOIN projects ON inscriptions.project_id = projects.id\n" +
                    "WHERE inscriptions.user_id = ?;";

            PreparedStatement objPrepare = objConnection.prepareStatement(sql);

            objPrepare.setInt(1, userId);


            ResultSet objResult = objPrepare.executeQuery();

            while(objResult.next()){

                Project project = new Project();

                project.setId(objResult.getInt("projects.id"));
                project.setTitle(objResult.getString("title"));
                project.setDescription(objResult.getString("description"));
                project.setStart_date(LocalDate.parse(objResult.getString("start_date")));
                project.setEnd_date(LocalDate.parse(objResult.getString("end_date")));

                listProjects.add(project);
            }

        }catch (SQLException error){
            JOptionPane.showMessageDialog(null, error.getMessage());
        }

        //paso 7
        ConfigDB.closeConnection();
        return listProjects;
    }
}
