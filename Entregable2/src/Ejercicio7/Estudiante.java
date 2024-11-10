package Ejercicio7;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private ArrayList<String[]> listaNotas;

    public Estudiante(String nombre){
        this.nombre = nombre;
        this.listaNotas = new ArrayList<>();
    }

    public void agregarNota(String materia, float nota){
        String[] registro ={materia, String.valueOf(nota)};
        System.out.println("La materia agregada es: " + materia + " con nota: " + nota);
        this.listaNotas.add(registro);
    }

    public void mostrarNotas(){
        System.out.println("Las notas del estudiante son: ");
        for(String[] nota: this.listaNotas){
            System.out.println("Materia: " + nota[0] + " Nota: " + nota[1]);
        }
    }

    public void checkAprueba(){
        float promedio = 0;
        int acumulador = 0;
        for(String[] nota: this.listaNotas){
            promedio += Float.parseFloat(nota[1]);
            acumulador++;
        }
        System.out.println("el promedio del estudiante " + this.nombre + " es: " + promedio/acumulador);

        if((promedio/acumulador) >= 60){
            System.out.println("El estudiante aprueba");
        }else{
            System.out.println("El estudiante no aprueba");
        }

    }
}
