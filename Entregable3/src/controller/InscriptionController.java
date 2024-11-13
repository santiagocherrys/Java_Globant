package controller;

import entity.Inscription;
import entity.Project;
import model.InscriptionModel;
import model.ProjectModel;

import javax.swing.*;
import java.time.LocalDate;

public class InscriptionController {

    public static void create(int user_id){
        InscriptionModel inscriptionModel = new InscriptionModel();

        //Show projects
        JOptionPane.showMessageDialog(null, "these are the projects you can  get in: \n" + ProjectController.getAllString());
        int project_id = Integer.parseInt(JOptionPane.showInputDialog("Insert id of project"));

        Inscription inscription = new Inscription(user_id,project_id);

        //insert to database
        inscription= inscriptionModel.insert(inscription);
        JOptionPane.showMessageDialog(null, inscription);
    }

    public static void projectsForVoluntary(int userId){
        InscriptionModel inscriptionModel = new InscriptionModel();
        String listProjects = "PROJECT LIST by user \n";

        for (Project project : inscriptionModel.findProjectsByVoluntary(userId)) {
            listProjects += project.toStringCreated() + "\n";
        }

        JOptionPane.showMessageDialog(null, listProjects);
    }


}
