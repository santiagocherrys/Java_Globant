import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] arg){
        //Ejercicio 13
        String[] candidatos = {"Laura","Adriana","Camila"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este es un programa que sirve para mirar quien es el candidato elegido por los ciudadanos");
        int cand1 = 0, cand2 = 0, cand3 = 0;
        for(int i =0; i < 10; i++ ){
            System.out.println("Ingrese: 1. " + candidatos[0] + " 2. " + candidatos[1] + " 3." + candidatos[2]);
            int voto = scanner.nextInt();
            if(voto == 1){
                cand1 += 1;
            }else if(voto == 2){
                cand2 += 1;
            }else if(voto == 3){
                cand3 += 1;
            }
        }

        if(cand1 > cand2 && cand1 > cand3){
            System.out.println("El ganador es: " + candidatos[0]);
        }else if(cand2 > cand1 && cand2 > cand3){
            System.out.println("El ganador es: " + candidatos[1]);
        }else{
            System.out.println("El ganador es: " + candidatos[2]);
        }
    }
}
