package Ejercicio18;

public class ControlDeHoras {

    public ControlDeHoras() {
    }

    public float calcularPago(int numeroHorasTrabajadas, float precioHora){
        //Esta funcion calcula cuanto se le tiene que pagar a un trabajador en la semana de acuerdo a las horas trabajadas
        //En Colombia se debe trabajar máximo 46 horas a la semana

        float salarioSemanal = 0;

        //Nota para esta versión se asumió que la hora normal como las horas extras se pagan igual
        /*if(numeroHorasTrabajadas >= 46){
            salarioSemanal = numeroHorasTrabajadas*precioHora;
        }else{
            salarioSemanal = (46 + (numeroHorasTrabajadas -46))*precioHora;
        }*/
        salarioSemanal = numeroHorasTrabajadas*precioHora;
        return salarioSemanal;
    }
}
