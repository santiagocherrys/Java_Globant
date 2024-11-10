import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    static ArrayList<String[]> inventario = new ArrayList<>();
    public static void main(String[] args){
        //Ejercicio 4


        boolean ciclo = true;
        int cont = 0;
        Scanner scanner = new Scanner(System.in);

        while(ciclo){
            switch(menu()){
                case "1":
                    //add new product
                    String[] producto = {"producto","cantidad"};
                    System.out.println("Ingrese el producto a añadir");
                    producto[0] = scanner.nextLine();
                    System.out.println("Ingrese la cantidad del producto");
                    producto[1] = scanner.nextLine();
                    inventario.add(producto);
                    break;
                case "2":
                    //delete product out of stock
                    mostrarInventario(inventario, 1);
                    System.out.println("Ingrese el nombre del producto a eliminar \n si no aparece nada  no puede eliminar producto");
                    System.out.println("solo se puede eliminar productos fuera de stock");
                    String productosolo = scanner.nextLine();
                    productoEliminar(productosolo);


                    break;
                case "3":
                    //update quantity of a product
                    String[] producto1 = {"producto","cantidad"};
                    mostrarInventario(inventario,0);
                    System.out.println("Ingrese el nombre del producto a actualizar");
                    producto1[0] = scanner.nextLine();
                    System.out.println("Ingrese la nueva cantidad");
                    producto1[1] = scanner.nextLine();
                    productoActualizar(producto1);

                    break;
                case "4":
                    //show all products
                    mostrarInventario(inventario, 0);
                    break;
                case "5":
                    ciclo= false;
                    break;
                default:
                    System.out.println("opcion no válida");
            }
            System.out.println(" ");
        }
    }

    public static String menu(){
        System.out.println("--------------------------------------");
        System.out.println("|                 MENU               |");
        System.out.println("|1. Add new product                  |");
        System.out.println("|2. Delete product out of stock      |");
        System.out.println("|3. Update quantity of a product     |");
        System.out.println("|4. Show all products                |");
        System.out.println("|5. Exit                             |");
        System.out.println("--------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entry option");
        return scanner.nextLine();
    }

    public static void mostrarInventario(ArrayList<String[]> inventario, int flag){
        //flag = 0 muestra todo el inventario
        // flag = 1 muestra solo inventario en cero
        if (flag == 0) {
            for(String[] producto : inventario){
                System.out.println("P: " + producto[0] +" Cant: " +producto[1]);
            }
        }else{
            for(String[] producto : inventario){
                if(producto[1].equals("0")){
                    System.out.println("P: " + producto[0] +" Cant: " +producto[1]);
                }
            }
        }

    }

    public static void productoEliminar(String producto) {
        for (String[] productoEli : inventario) {
            if (productoEli[0].equals(producto) && productoEli[1].equals("0")) {
                inventario.remove(productoEli);
                System.out.println("producto eliminado correctamente");
            }
        }
    }

        public static void productoActualizar(String[] producto){
            for(String[] productoAct: inventario){
                if(productoAct[0].equals(producto[0])){
                    inventario.set(inventario.indexOf(productoAct),producto );
                    System.out.println("producto actualizado correctamente");
                }
        }
    }
}
