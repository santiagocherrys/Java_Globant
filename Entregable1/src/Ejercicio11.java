import java.util.Scanner;

public class Ejercicio11 {

    static final int TAM_ARRAY = 100;
    static final String[] productos = new String[TAM_ARRAY];
    static final int[] cantidades = new int[TAM_ARRAY];

    public static void main(String[] args){
        //Ejercicio 11

        boolean ciclo = true;
        int cont = 0;
        Scanner scanner = new Scanner(System.in);

        while(ciclo) {
            switch (menu()) {
                case "1":
                    //Ingresar productos
                    System.out.println("Ingrese producto");
                    productos[cont] = scanner.next();
                    System.out.println("Ingrese cantidad");
                    cantidades[cont] = scanner.nextInt();

                    System.out.println("El producto ingresado es: " + productos[cont] + " cantidad: " + cantidades[cont]);
                    if(cont > TAM_ARRAY){
                        System.out.println("Ya no puede agregar mas productos");
                    }else{
                        cont++;
                    }


                    break;
                case "2":
                    //Actualizar cantidades
                    System.out.println("Ingrese el nombre del producto a actualizar");
                    String prod = scanner.next();
                    int indexCant = buscar(prod,cont);
                    if(indexCant !=-1){
                        System.out.println("Ingrese la cantidad del producto");
                        cantidades[indexCant] = scanner.nextInt();
                        System.out.println("El producto actualizado es: " + productos[cont] + " cantidad: " + cantidades[cont]);
                    }



                    break;
                case "3":
                    //mostrar todo el inventario
                    showInventario(cont);
                    break;
                case "4":
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
        System.out.println("|2. Actualizar cantidades            |");
        System.out.println("|3. Mostrar cantidades               |" );
        System.out.println("|4. Salir                            |");
        System.out.println("--------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entry option");
        return scanner.nextLine();

    }

    public static void showInventario(int cant){
        for(int i=0; i < cant; i++){
            System.out.println(productos[i] + ": " + cantidades[i]);
        }
    }

    public static int buscar(String prod, int cont){
        boolean flag = false;
        for(int i=0; i < cont; i++){
            if(productos[i].equals(prod)){
                flag = true;
                return i;
            }
        }

            System.out.println("Producto no encontrado. Tiene que escribirlo tal cual");
            return -1;

    }
}
