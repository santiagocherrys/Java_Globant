import java.util.Scanner;

public class Ejercicio19 {
        //ejercicio 19
        static final int TAM_ARRAY = 5;
        static final String[] productos = new String[TAM_ARRAY];
        static final int[] precios = new int[TAM_ARRAY];

        public static void main(String[] args){

            boolean ciclo = true;
            int cont = 0;
            Scanner scanner = new Scanner(System.in);

            while(ciclo) {
                switch (menu()) {
                    case "1":
                        //Ingresar productos
                        System.out.println("Ingrese producto");
                        productos[cont] = scanner.next();
                        System.out.println("Ingrese precio");
                        precios[cont] = scanner.nextInt();

                        System.out.println("El producto ingresado es: " + productos[cont] + " precio: " + precios[cont]);
                        if(cont > TAM_ARRAY){
                            System.out.println("Ya no puede agregar mas productos");
                        }else{
                            cont++;
                        }
                        break;
                    case "2":
                        //Actualizar cantidades
                        showInventario(cont);
                        break;
                    case "3":
                        //Salir
                        System.out.println("Se sale del programa ");
                        ciclo =  false;
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }

        }

        public static String menu(){
            System.out.println("--------------------------------------");
            System.out.println("|                 MENU               |");
            System.out.println("|1. Ingresar productos               |");
            System.out.println("|2. Mostrar productos                |");
            System.out.println("|3. Salir                            |");
            System.out.println("--------------------------------------");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Entry option");
            return scanner.nextLine();

        }

        public static void showInventario(int cant){
            for(int i=0; i < cant; i++){
                System.out.println(productos[i] + ": con precio: " + precios[i]);
            }
        }

}
