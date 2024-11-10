import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] arg) {
        //Ejercicio 12
        int[] facturas = {0, 0, 0};
        //facturas[0] = electricidad
        //facturas[1] = agua
        //factura[2] =  internet
        Scanner scanner = new Scanner(System.in);
        int totalPagar = 0;

        System.out.println("ingrese el precio de la electricidad");
        int electricidad = scanner.nextInt();
        System.out.println("ingrese el precio del agua");
        int agua = scanner.nextInt();
        System.out.println("Ingrese la factura del internet");
        int internet = scanner.nextInt();


        totalPagar = electricidad + agua + internet;

        System.out.println("El total a pagar es: " + totalPagar);

        System.out.println("Ahora va a pagar individualmente y se va a descontar");
        System.out.println("Paga electricidad: " + electricidad + " queda debiendo: " + (totalPagar - electricidad));
        totalPagar -= electricidad;

        System.out.println("Paga agua: " + agua + " queda debiendo: " + (totalPagar - agua));
        totalPagar -= agua;

        System.out.println("Paga internet: " + internet + " queda debiendo: " + (totalPagar - internet));
    }
}
