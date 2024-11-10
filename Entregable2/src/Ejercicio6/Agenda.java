package Ejercicio6;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos;

    public Agenda(){
        this.contactos = new ArrayList<>();
    }

    public void agregar(Contacto contacto){
        this.contactos.add(contacto);
        System.out.println("El contacto agregado es: " + contacto.toString());
    }

    public void eliminar(String nombre){
        for(Contacto contacto: this.contactos){
            if(contacto.getNombre().equals(nombre)){
                System.out.println("Entro a contacto");
                this.contactos.remove(contacto);
                System.out.println("El contacto eliminado es: " + contacto.toString());
                break;
            }
        }

    }

    public Contacto buscarPorNombre(String nombre){
        for(Contacto contacto: this.contactos){
            if(contacto.getNombre().equals(nombre)){
                return contacto;
            }
        }
        return null;
    }

    public void mostrarAgenda(){
        for(Contacto contacto: this.contactos){
            System.out.println("Esto es contacto: " + contacto.toString());
        }
    }
}
