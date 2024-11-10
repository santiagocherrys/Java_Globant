package Ejercicio12;

public class Mago extends Personaje{

    public Mago(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(" Mago");
    }

    @Override
    public void defender() {
        super.defender();
        System.out.println(" Mago");
    }
}
