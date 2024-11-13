package controller;

import entity.Project;
import model.ProjectModel;

import javax.swing.*;
import java.time.LocalDate;

public class ProjectController {

    public static void create(int created_by){
        ProjectModel projectModel = new ProjectModel();

        //ask data to user
        String title = JOptionPane.showInputDialog("Insert title of project");
        String description =  JOptionPane.showInputDialog("Insert description of the project");
        LocalDate start_date =  LocalDate.parse(JOptionPane.showInputDialog("Insert date of begining of project format: 2024-09-30"));
        LocalDate end_date =  LocalDate.parse(JOptionPane.showInputDialog("Insert date of end of project format: 2024-09-30"));

        Project project = new Project(title, description, start_date, end_date, created_by);

        //insert to database
        project = projectModel.insert(project);
        JOptionPane.showMessageDialog(null, project.toString());
    }

    public static void getAllByUser(int created_by){
        ProjectModel projectModel = new ProjectModel();
        String listProjects = "PROJECT LIST \n";

        for(Project project: projectModel.findByUser(created_by)){
            listProjects += project.toString() + "\n";
        }

        JOptionPane.showMessageDialog(null, listProjects);
    }

    public static String getAllString(){
        ProjectModel projectModel = new ProjectModel();
        String listProjects = "PROJECT LIST \n";

        for(Project project: projectModel.findAll()){
            listProjects += project.toString() + "\n";
        }
        return listProjects;
    }

    public static void getAllStringVoluntary() {
        ProjectModel projectModel = new ProjectModel();
        String listProjects = "PROJECT LIST \n";

        for (Project project : projectModel.findAllVoluntary()) {
            listProjects += project.toStringCreated() + "\n";
        }

        JOptionPane.showMessageDialog(null, listProjects);
    }

    public static void showVoluntaryByProjects(int id){
        ProjectModel projectModel = new ProjectModel();
        projectModel.showVoluntaryByProjects(id);
    }
}
