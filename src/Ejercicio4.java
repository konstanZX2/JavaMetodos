import java.util.Scanner;

public class Ejercicio4 {
    public static void numerosPositivos(int numero,int positivos){
        Scanner escaneado = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca numeros separados por la tecla intro");
            numero = escaneado.nextInt();

            if (numero >= 0) {
            System.out.println(positivos = positivos + 1);
            System.out.println("Total positivos");
            System.out.println(numero + " " + "ESTE ES POSITIVO");
        } else {
            System.out.println(numero + " " + "ESTE ES NEGATIVO");
        }
    }}
    public static void main(String[] args) {
            int numero = 0;
            int positivos = 0;
            numerosPositivos(numero,positivos);
        }

    
}
