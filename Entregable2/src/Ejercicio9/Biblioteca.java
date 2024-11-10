package Ejercicio9;

public class Biblioteca {

    public Biblioteca(){

    }

    public Libro9 prestar(Libro9 libro){
        if(libro.isDisponible()){
            System.out.println("Se prestar el libro");
            libro.setDisponible(false);
            return libro;
        }else{
            System.out.println("No se puede prestar libro, ya está prestado");
            return null;
        }
    }

    public Libro9 devolver(Libro9 libro){
        if(!libro.isDisponible()){
            System.out.println("Se devuelve libro");
            libro.setDisponible(true);
            return libro;
        }else{
            System.out.println("No se puede devolver libro, ya está disponible");
            return null;
        }
    }
}
