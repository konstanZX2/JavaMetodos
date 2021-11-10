import java.util.Scanner;

public class Ejercicio2 {
    public static void ordenAscendente(int primerNumero, int segundoNumero){
        if(primerNumero<segundoNumero){
            System.out.println(primerNumero);
            System.out.println(segundoNumero);}
        else if (segundoNumero<primerNumero){
            System.out.println(segundoNumero);
            System.out.println(primerNumero);}
        else if (primerNumero==segundoNumero){
            System.out.println("Los dos numeros son iguales KEKW");}
    }
    public static void main(String[] args) {
        System.out.println("Introduzca el primer numero");
        Scanner escaneado = new Scanner(System.in);
        int primerNumero;int segundoNumero;
        primerNumero = escaneado.nextInt();
        System.out.println("Introduzca el segundo numero");
        segundoNumero = escaneado.nextInt();
        ordenAscendente(primerNumero,segundoNumero);
    }
}
