package Ejercicio12;

public class Guerrero extends Personaje{
    public Guerrero(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(" Guerrero");
    }

    @Override
    public void defender() {
        super.defender();
        System.out.println(" Guerrero");
    }
}
