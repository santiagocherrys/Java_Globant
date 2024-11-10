package Ejercicio10;

public class Empleado {
    private String nombre;
    private float salarioBase;
    private int aniosExperiencia;

    public Empleado(String nombre, float salarioBase, int aniosExperiencia) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salarioBase=" + salarioBase +
                ", aniosExperiencia=" + aniosExperiencia +
                '}';
    }

    public void reclamarBono(){
        System.out.println("El bono a reclamar del empleado: " + this.nombre + " es: " + ((this.salarioBase*0.05)*this.aniosExperiencia));
    }
}
