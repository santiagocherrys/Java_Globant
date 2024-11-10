package Ejercicio14;

public class PagoTarjeta extends Pago{

    @Override
    public void procesarPago() {
        System.out.println("El pago se está haciendo por tarjeta");
    }
}
