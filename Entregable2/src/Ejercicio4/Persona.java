package Ejercicio4;

public class Persona {
    private String nombre;
    private int edad;
    private String sexo;

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    public void compararEdad(Persona persona){
        if(this.edad > persona.getEdad()){
            System.out.println("La persona con nombre: " + this.nombre + " es mayor que: " + persona.getNombre());
        }else if(this.edad < persona.getEdad()){
            System.out.println("La persona con nombre: " + this.nombre + " es menor que: " + persona.getNombre());
        }else{
            System.out.println("La persona con nombre: " + this.nombre + " tiene la misma edad que: " + persona.getNombre());
        }
    }
}
