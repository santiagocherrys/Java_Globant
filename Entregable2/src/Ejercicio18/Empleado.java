package Ejercicio18;

public class Empleado {
    private String nombre;
    private String cedula;
    private float precioHora;
    private int horasTotalesTrabajadas;
    private ControlDeHoras controlDeHoras;

    public Empleado(String nombre, String cedula, float precioHora, int horasTotalesTrabajadas) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.precioHora = precioHora;
        this.horasTotalesTrabajadas = horasTotalesTrabajadas;
        this.controlDeHoras = new ControlDeHoras();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public float getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(float precioHora) {
        this.precioHora = precioHora;
    }

    public int getHorasTotalesTrabajadas() {
        return horasTotalesTrabajadas;
    }

    public void setHorasTotalesTrabajadas(int horasTotalesTrabajadas) {
        this.horasTotalesTrabajadas = horasTotalesTrabajadas;
    }

    public void calcularHorasSemana(){
        System.out.println(this.toString());
        System.out.print(" El valor total a pagar en la semana es:");
        System.out.println(this.controlDeHoras.calcularPago(this.horasTotalesTrabajadas, this.precioHora));
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", precioHora=" + precioHora +
                ", horasTotalesTrabajadas=" + horasTotalesTrabajadas +
                '}';
    }
}
