import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args){
        //Ejercicio16
        System.out.println("Hola Mundo");
        float[] gastosMes = new float[12];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa registra el gasto mensual y le muestra su gasto total en todo el año y cual fue el promedio");
        float total = 0;
        for(int i=0; i < 12; i++){
            System.out.println("Ingrese el gasto del mes: " + (i+1));
            total += scanner.nextFloat();
        }
        System.out.println("Su gasto total en todo el año es: " + total + " y su promedio es: " + total/12.0);
    }
}
