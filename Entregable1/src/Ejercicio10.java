import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        //Ejercicio 10
        int[] calificacion = new int[10];
        int cont5 = 0;
        int acumulador = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i < 10; i++){
            System.out.println("Ingrese su calificación de 1 a 5 del servicio prestado");
            calificacion[i] = scanner.nextInt();
        }

        //Todo se puede calcular en el otro for pero por el ejercicio se va a realizar asi
        //Calcular promedio y cuantos cliente dijeron que si al final
        for(int j=0; j < 10; j++){
            if(calificacion[j] == 5){
                cont5++;
            }
            acumulador += calificacion[j];
        }

        System.out.println("El promedio de la calificación fue: " + ((float)acumulador)/10.0 + " y la cantidad de personas que votaron en 5 son: " + cont5);


    }
}
