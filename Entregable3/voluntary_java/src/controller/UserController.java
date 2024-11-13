package controller;

import entity.User;
import helper.Role;
import model.UserModel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class UserController {

    public static void getAll(){
        UserModel objMode = new UserModel();
        String listUsers = "USER LIST \n";

        for(Object iterator: objMode.findAll()){
            User objUser = (User) iterator;
            listUsers += objUser.toString() + "\n";
        }

        JOptionPane.showMessageDialog(null, listUsers);
    }

    public static String getAllString(){
        UserModel objMode = new UserModel();
        String listUsers = "USER LIST \n";

        for(Object iterator: objMode.findAll()){
            User objUser = (User) iterator;
            listUsers += objUser.toString() + "\n";
        }
        return listUsers;
    }

    public static List<User> getAllUser(){
        UserModel objMode = new UserModel();
        List<User> listUsers = new ArrayList<>();
        for(Object iterator: objMode.findAll()){
            User objUser = (User) iterator;
            listUsers.add(objUser);
        }
        return  listUsers;
    }

    public static void create(){
        //Use the model
        UserModel objUserModel = new UserModel();

        //Ask data to the coder
        String name = JOptionPane.showInputDialog(("Insert name"));
        String email = JOptionPane.showInputDialog("Insert email");
        String password = JOptionPane.showInputDialog("Insert password");
        Role role = Role.valueOf(JOptionPane.showInputDialog("Insert Role(VOLUNTARIO-PUBLICANTE)"));

        User objUser = new User(name, email, password, role);

        //Call the method of insertion y save the object that returns in user
        objUser = (User) objUserModel.insert(objUser);

        JOptionPane.showMessageDialog(null, objUser.toString());
    }

    public static void update(){
        //1. use the model
        UserModel objUserModel = new UserModel();

        String listUsers = getAllString();

        int idUpdate = Integer.parseInt(JOptionPane.showInputDialog(listUsers + "\n Enter the Id of the coder to edit: "));

        //Obtain a cuser for the entered id
        User objUser = objUserModel.findById(idUpdate);

        //check that coders exits
        if(objUser == null){
            JOptionPane.showMessageDialog(null, "User not found");
        }else{

            String name = JOptionPane.showInputDialog(null, "Enter new name: " , objUser.getName());
            String email = JOptionPane.showInputDialog(null, "Enter new email" , objUser.getEmail());
            String password = JOptionPane.showInputDialog(null, "Enter the password", objUser.getPassword());
            String role = JOptionPane.showInputDialog(null, "Enter the Role(VOLUNTARIO-PUBLICANTE)", objUser.getRole().name());

            objUser.setName(name);
            objUser.setEmail(email);
            objUser.setPassword(password);
            objUser.setRole(Role.valueOf(role));

            objUserModel.update(objUser);
        }
    }

    public static void delete(){
        UserModel objUserModel = new UserModel();
        String listUsers = getAllString();

        int idDelete = Integer.parseInt(JOptionPane.showInputDialog(listUsers + "\n Enter the Id the User to delete:"));

        User objUser = objUserModel.findById(idDelete);
        int confirm = 1;

        if(objUser == null){
            JOptionPane.showMessageDialog(null, "User not found");
        }else{
            confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the user? \n " +objUser.toString());

            if(confirm == 0) objUserModel.delete(objUser);
        }
    }


}
