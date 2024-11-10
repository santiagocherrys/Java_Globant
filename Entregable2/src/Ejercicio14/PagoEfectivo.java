package Ejercicio14;

public class PagoEfectivo extends Pago {
    @Override
    public void procesarPago() {
        System.out.println("El pago se está haciendo por efectivo");
    }
}
