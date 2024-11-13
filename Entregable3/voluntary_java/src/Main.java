import controller.InscriptionController;
import controller.ProjectController;
import controller.UserController;
import entity.User;
import helper.Role;

import javax.swing.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String email = "";
        String password = "";
        String name = "";
        Role role;
        User userlogin = new User();
        boolean exit = false;



        do{

            switch(menu()){
                case "1":
                    //login
                    email = JOptionPane.showInputDialog("Email please");
                    password = JOptionPane.showInputDialog("Password please");
                    List<User> listUsers = UserController.getAllUser();

                    boolean flagUser = false;
                    for(User user: listUsers){
                        if(user.getEmail().equals(email) && user.getPassword().equals(password)){
                            JOptionPane.showMessageDialog(null, "Log in as " + user.getRole().name());
                            flagUser = true;
                            userlogin = user;
                            break;
                        }
                    }
                    if(!flagUser){
                        JOptionPane.showMessageDialog(null, "UserNotFound");
                    }


                    while(flagUser){
                        if(userlogin.getRole().name().equals("PUBLICANTE")){
                            //PUBLICANTE
                            switch (menuPublisher()){
                                case "1":
                                    //Create a project
                                    ProjectController.create(userlogin.getId());
                                    break;
                                case "2":
                                    //List all project that has created
                                    ProjectController.getAllByUser(userlogin.getId());
                                    break;
                                case "3":
                                    // List voluntaries that belongs to your projects
                                    ProjectController.showVoluntaryByProjects(userlogin.getId());
                                    break;
                                case "4":
                                    //logout
                                    flagUser = false;
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Option not valid");
                            }


                        }else{
                            //VOLUNTARIO
                            switch(menuVoluntary()){
                                case "1":
                                    //List of project availables
                                    JOptionPane.showMessageDialog(null, ProjectController.getAllString());
                                    break;
                                case "2":
                                    //Join to a project
                                    InscriptionController.create(userlogin.getId());

                                    break;
                                case "3":
                                    // List project you belongs to
                                    InscriptionController.projectsForVoluntary(userlogin.getId());
                                    break;
                                case "4":
                                    //logout
                                    flagUser = false;
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Option not valid");
                            }

                        }
                    }


                    break;
                case "2":
                    //Sign UP
                    UserController.create();

                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Have a good day");
                    exit = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Option not valid");

            }

        }while(!exit);

    }

    public static String menu(){

        return JOptionPane.showInputDialog("""
                    1. log in
                    2. Sign UP
                    3. exit
                    
                    Choose an option:
                    """);
    }

    public static String menuVoluntary(){
        return JOptionPane.showInputDialog("""
                    1. List of project avalaible
                    2. Joing to a project
                    3. List project you belongs to
                    4. Logout
                    
                    Choose an option:
                    """);
    }

    public static String menuPublisher(){
        return JOptionPane.showInputDialog("""
                    1. Create a project
                    2. List all project that has created
                    3. List voluntaries that belongs to your projects
                    4. Logout
                    
                    Choose an option:
                    """);
    }
}