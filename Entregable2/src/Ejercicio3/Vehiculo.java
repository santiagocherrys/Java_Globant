package Ejercicio3;

public class Vehiculo {

    private String marca;
    private String modelo;
    private int velocidadMaxima;
    private int velocidadActual;

    public Vehiculo(String marca, String modelo, int velocidadMaxima, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidadMaxima=" + velocidadMaxima +
                ", velocidadActual=" + velocidadActual +
                '}';
    }

    public void acelerar(int vel){
        if(vel > 0){
            if((this.velocidadActual + vel) > this.velocidadMaxima){
                System.out.println("No se puede acelerar porque se pasa de la velocidad máxima");
            }else{
                this.velocidadActual += vel;
                System.out.println("Su velocidad actual es: " + this.velocidadActual);
            }
        }else{
            System.out.println("No se permite velocidad negativa");
        }
    }

    public void frenar(){
        if((this.velocidadActual -2) < 0){
            System.out.println("No se puede frenar porque da velocidad negativa");
        }else{
            this.velocidadActual -= 2;
            System.out.println("Su velocidad actual es: " + this.velocidadActual);
        }
    }
}
