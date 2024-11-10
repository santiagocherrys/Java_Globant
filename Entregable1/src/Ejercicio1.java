import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Ejercicio1
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program tells you if an user is allowed to enter to a program");
        System.out.println("Please enter the age of the user ");

        int userAge = scanner.nextInt();

        if(userAge < 18){
            System.out.println("Access denied");
        }else{
            System.out.println("Access Allowed");
        }

    }
}