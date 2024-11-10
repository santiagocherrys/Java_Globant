import Ejercicio1.Producto;
import Ejercicio10.Empleado;
import Ejercicio11.Auto;
import Ejercicio11.Moto;
import Ejercicio12.Guerrero;
import Ejercicio12.Mago;
import Ejercicio13.Gato;
import Ejercicio13.Pajaro;
import Ejercicio13.Perro;
import Ejercicio14.PagoEfectivo;
import Ejercicio14.PagoTarjeta;
import Ejercicio15.Flota;
import Ejercicio16.Inventario16;
import Ejercicio17.Cliente;
import Ejercicio17.Pedido;
import Ejercicio19.Reserva;
import Ejercicio19.SistemaReservas;
import Ejercicio19.Vuelo;
import Ejercicio2.Libro;
import Ejercicio20.Banco;
import Ejercicio3.Vehiculo;
import Ejercicio4.Persona;
import Ejercicio5.CuentaBancaria;
import Ejercicio6.Agenda;
import Ejercicio6.Contacto;
import Ejercicio7.Estudiante;
import Ejercicio8.Inventario;
import Ejercicio8.Producto8;
import Ejercicio9.Biblioteca;
import Ejercicio9.Libro9;

import java.sql.SQLOutput;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;

public class Main {
    public static void main(String[] args){

        //Ejercicio 1
        System.out.println("Ejercicio 1");
        Producto producto1 = new Producto("papa", 1200, 20);
        Producto producto2 = new Producto("arepa", 1500, 50);
        Producto producto3 = new Producto("arequipe", 3000, 10);

        producto1.aumentarStock(25);
        producto2.disminuirStock(50);
        producto3.aumentarStock(30);

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);

        //mostrar cantidad stock
        System.out.println("Este es el stock de productos");
        for(Producto producto: productos){
            System.out.println("PRODUCTO: " + producto.getNombre() + " CANTIDAD: " + producto.getCantidadEnStock());
        }
        System.out.println("\n");

        //Ejercicio2
        System.out.println("Ejercicio 2");
        Libro libro1 = new Libro("100 años de soledad", "Gabriel Garcia Marquez" , 351);
        Libro libro2 = new Libro("Harry Potter", "Hermaine", 230);

        System.out.println(libro1.toString());
        libro1.determinarMayor300();
        libro1.imprimirResumen();
        System.out.println("");
        System.out.println(libro2.toString());
        libro2.determinarMayor300();
        libro2.imprimirResumen();
        System.out.println("\n");

        //Ejercicio 3
        System.out.println("Ejercicio 3");
        Vehiculo vehiculo1 = new Vehiculo("Chevrolet","spark",80,20);
        Vehiculo vehiculo2 = new Vehiculo("Renault","Sandero", 90,0);

        System.out.println("Vehiculo 1");
        System.out.println(vehiculo1.toString());
        vehiculo1.acelerar(30);
        vehiculo1.acelerar(50);
        vehiculo1.frenar();

        System.out.println("Vehiculo 2");
        System.out.println(vehiculo1.toString());
        vehiculo2.frenar();
        vehiculo2.acelerar(30);
        vehiculo2.frenar();
        System.out.println("\n");

        //Ejercicio4
        System.out.println("Ejercicio 4");
        Persona persona1 = new Persona("Santiago", 30, "Masculino");
        Persona persona2 = new Persona("Adriana", 28, "Femenino");
        Persona persona3 = new Persona("Andrea", 18, "Femenino");

        System.out.println(" persona 1: " + persona1);
        System.out.println(" persona 2: " + persona2);
        System.out.println(" persona 3: " + persona3);

        persona1.compararEdad(persona2);
        persona1.compararEdad(persona3);
        persona2.compararEdad(persona3);
        persona2.compararEdad(persona1);
        System.out.println("\n");

        //Ejercicio 5
        System.out.println("Ejercicio 5");

        CuentaBancaria cuenta1 = new CuentaBancaria(12343256789L,"Santiago Echeverry", 100);
        cuenta1.depositar(124);
        cuenta1.depositar(130);
        cuenta1.retirar(50);
        cuenta1.retirar(100);

        //mostrar historial
        cuenta1.showHistorial();
        System.out.println("\n");

        //Ejercicio 6
        System.out.println("Ejercicio 6");
        Contacto contacto1 = new Contacto();
        contacto1.setNombre("Camila");
        contacto1.setEmail("Camila@gmail.com");
        contacto1.setTelefono("123456789");
        System.out.println(contacto1.toString());

        Contacto contacto2 = new Contacto();
        contacto2.setNombre("Andrea");
        contacto2.setEmail("Milider@gmail.com");
        contacto2.setTelefono("123458976");
        System.out.println(contacto1.toString());

        Contacto contacto3 = new Contacto();
        contacto3.setNombre("Ubiter");
        contacto3.setEmail("Ubita@gmail.com");
        contacto3.setTelefono("44444445");
        System.out.println(contacto1.toString());

        Agenda agenda = new Agenda();
        agenda.agregar(contacto1);
        agenda.agregar(contacto2);
        agenda.agregar(contacto3);
        agenda.mostrarAgenda();
        System.out.println("El contacto buscado es " + agenda.buscarPorNombre("Ubiter"));
        System.out.println("El contacto buscado es " + agenda.buscarPorNombre("asdfasdf"));
        agenda.eliminar("Ubiter");
        agenda.eliminar("asdfasd");
        agenda.mostrarAgenda();
        System.out.println("\n");

        //Ejercicio 7
        System.out.println("Ejercicio 7");
        Estudiante estudiante = new Estudiante("Pedro");
        estudiante.agregarNota("matematicas", 60);
        estudiante.agregarNota("español", 95);
        estudiante.agregarNota("filosofia", 80);
        estudiante.mostrarNotas();

        estudiante.checkAprueba();
        System.out.println("\n");

        //Ejercicio 8
        System.out.println("Ejercicio 8");
        Producto8 producto8_1 = new Producto8("papa", 1200,"tuberculos", 50);
        Producto8 producto8_2 = new Producto8("arroz",700,"arroces",100);
        Producto8 producto8_3 = new Producto8("Atun", 6900, "enlatados", 50);
        Producto8 producto8_4 = new Producto8("Sardinas", 8900, "enlatados", 100);

        Inventario inventarioTienda = new Inventario();
        inventarioTienda.agregarProducto(producto8_1);
        inventarioTienda.agregarProducto(producto8_2);
        inventarioTienda.agregarProducto(producto8_3);
        inventarioTienda.agregarProducto(producto8_4);

        inventarioTienda.mostrarInventario();
        inventarioTienda.mostrarInventarioFiltrado(inventarioTienda.buscarCategoria("enlatados"));
        System.out.println("");
        inventarioTienda.mostrarInventarioFiltrado(inventarioTienda.buscarCategoria("frijoles"));
        System.out.println("\n");

        //Ejercicio 9
        System.out.println("Ejercicio 9");

        Libro9 libro9_1 = new Libro9("100 años de soledad","Gabriel garcia marquez",true);
        Libro9 libro9_2 = new Libro9("La culpa es de la vaca","Autor1",false);

        //Prestar libro
        Biblioteca biblioteca = new Biblioteca();
        libro9_1 = biblioteca.prestar(libro9_1);
        System.out.println("Estado libro: " + libro9_1);

        libro9_2 = biblioteca.devolver(libro9_2);
        System.out.println("Estado libro: " + libro9_2);
        System.out.println("\n");

        //Ejercicio 10
        System.out.println("Ejercicio 10");
        Empleado empleado = new Empleado("Santiago Echeverry", 1000, 6);
        empleado.reclamarBono();
        System.out.println("\n");

        //Ejercicio 11
        System.out.println("Ejercicio 11");
        Auto auto = new Auto("chevrolet", "spark", 80, 50, 5);
        System.out.println(auto.toString());

        Moto moto = new Moto("auteco", "boxer",90,50,"deportivo");
        System.out.println(moto.toString());
        System.out.println("\n");

        //Ejercicio 12
        System.out.println("Ejercicio 12");
        Guerrero guerrero = new Guerrero("Mario Bross", 50);
        guerrero.atacar();
        guerrero.defender();
        System.out.println("");

        Mago mago = new Mago("Merlin", 60);
        mago.atacar();
        mago.defender();
        System.out.println("\n");

        //Ejercicio 13
        System.out.println("Ejercicio 13");
        Perro perro = new Perro();
        System.out.println("el perro hace");
        perro.hacerSonido();

        Gato gato = new Gato();
        System.out.println("el gato hace");
        gato.hacerSonido();

        Pajaro pajaro = new Pajaro();
        System.out.println("el pajaro hace");
        pajaro.hacerSonido();
        System.out.println("\n");

        //Ejercicio14
        System.out.println("Ejercicio 14");
        PagoTarjeta pagoTarjeta = new PagoTarjeta();
        pagoTarjeta.procesarPago();

        PagoEfectivo pagoEfectivo = new PagoEfectivo();
        pagoEfectivo.procesarPago();
        System.out.println("\n");

        //Ejercicio15
        System.out.println("Ejercicio 15");
        Ejercicio15.Vehiculo vehiculo15_1 = new Ejercicio15.Vehiculo("chevrolet","onix",1300);
        Ejercicio15.Vehiculo vehiculo15_2 = new Ejercicio15.Vehiculo("renault","stepway", 8950);
        Ejercicio15.Vehiculo vehiculo15_3 = new Ejercicio15.Vehiculo("mazda","mazda 2", 20000);

        ArrayList<Ejercicio15.Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(vehiculo15_1);
        vehiculos.add(vehiculo15_2);
        vehiculos.add(vehiculo15_3);

        Flota flota = new Flota(vehiculos);

        flota.hacermantenimiento();
        System.out.println("\n");

        //Ejercicio16
        System.out.println("Ejercicio 16");
        Producto8 producto16_1 = new Producto8("papa",2000, "tuberculo", 100);
        Producto8 producto16_2 = new Producto8("yuca",3300, "tuberculo",50);
        Producto8 producto16_3 = new Producto8("Arroz", 2000, "granos", 150);
        Producto8 producto16_4 = new Producto8("atun", 6900,"enlatados", 40);
        Inventario16 inventario16 = new Inventario16();

        inventario16.agregarProducto(producto16_1);
        inventario16.agregarProducto(producto16_2);
        inventario16.agregarProducto(producto16_3);
        inventario16.agregarProducto(producto16_4);

        inventario16.buscarPorNombre("yuca");
        inventario16.buscarCategoria("tuberculo");
        inventario16.mostrarInventario();
        inventario16.vender("papa", 50);
        inventario16.vender("yuca", 1);
        System.out.println("Mostrar inventario actual");
        inventario16.mostrarInventario();
        System.out.println("\n");

        //Ejercicio17
        System.out.println("Ejercicio 17");

        Cliente cliente1 = new Cliente("Cliente1", "1234566", "211435");
        Ejercicio17.Producto producto17_1 = new Ejercicio17.Producto("papa",1500, 10);
        Ejercicio17.Producto producto17_2 = new Ejercicio17.Producto("arroz", 2000, 30);
        Ejercicio17.Producto producto17_3 = new Ejercicio17.Producto("huevo", 2000, 200);

        Pedido pedido = new Pedido();
        pedido.addPedido(producto17_1);
        pedido.addPedido(producto17_2);
        pedido.addPedido(producto17_3);

        pedido.showPedido();

        cliente1.setPedido(pedido);

        System.out.println("esta es la compra del cliente: " + cliente1);



        //Ejercicio18
        System.out.println("Ejercicio 18");
        Ejercicio18.Empleado empleado18_1 = new Ejercicio18.Empleado("Susana", "123456789", 9000, 57);
        Ejercicio18.Empleado empleado18_2 = new Ejercicio18.Empleado("Arley","123214321", 10000,46);

        System.out.println("trabajador 1:");
        System.out.println(empleado18_1);
        empleado18_1.calcularHorasSemana();

        System.out.println("trabajaodor 2:");
        System.out.println(empleado18_2);
        empleado18_2.calcularHorasSemana();
        System.out.println("\n");

        //Ejercicio19
        /*System.out.println("Ejercicio 19");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.NOVEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Vuelo vuelo1 = new Vuelo("FX12","Medellín","Zaragoza",calendar.getTime(), Time.valueOf("14:30:00"));;
        Vuelo vuelo2 = new Vuelo("FX100","Zaragoza", "Medellín", calendar.getTime(), Time.valueOf("23:30:00"));

        Reserva reserva1 = new Reserva(vuelo1);
        Reserva reserva2 = new Reserva(vuelo2);

        ArrayList<Reserva> reservas = new ArrayList<>();
        reservas.add(reserva1);
        reservas.add(reserva2);

        SistemaReservas sistemaReservas = new SistemaReservas(reservas);
        //System.out.println("Reserva nula");
        //sistemaReservas.reservar("Hola");

        System.out.println("Reserva normal");
        sistemaReservas.reservar("FX12");
        sistemaReservas.reservar("FX12");

        sistemaReservas.reservar("FX100");

        System.out.println("esto es el sistema de reservas " + sistemaReservas.toString());
        sistemaReservas.cancelar("FX12");
        System.out.println("");
        System.out.println("Esto es el sistema de reservas " + sistemaReservas.toString());
        System.out.println("\n");*/

        //Ejercicio 20
        System.out.println("Ejercicio 20");

        Ejercicio20.CuentaBancaria cuentaBancaria1 = new Ejercicio20.CuentaBancaria("Luis","1234","0x1234", 5000);
        Ejercicio20.CuentaBancaria cuentaBancaria2 = new Ejercicio20.CuentaBancaria("Sandra","4321", "0x4321", 3000);
        Ejercicio20.CuentaBancaria cuentaBancaria3 = new Ejercicio20.CuentaBancaria("Camilo","12345", "0x12345", 3400);

        ArrayList<Ejercicio20.CuentaBancaria> cuentas = new ArrayList<>();
        cuentas.add(cuentaBancaria1);
        cuentas.add(cuentaBancaria2);
        cuentas.add(cuentaBancaria3);

        System.out.println("Cuenta bancaria 1");
        System.out.println(cuentaBancaria1);

        System.out.println("Cuenta bancaria 2");
        System.out.println(cuentaBancaria2);

        System.out.println("Cuenta bancaria 3");
        System.out.println(cuentaBancaria3);

        Banco banco = new Banco(cuentas);

        Ejercicio20.CuentaBancaria cuentaBancariaAux = new Ejercicio20.CuentaBancaria();
        cuentaBancariaAux = cuentaBancaria1;
        cuentaBancaria1.transferir(cuentaBancaria2);

        System.out.println("Cuenta bancaria 1");
        System.out.println(cuentaBancaria1);
        cuentaBancaria1.showTransferencias();
        System.out.println("Cuenta bancaria 2");
        System.out.println(cuentaBancaria2);


        System.out.println("Estas son las cuentas bancarias del banco: " + cuentas);
        System.out.println("\n");

    }
}
