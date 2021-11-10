import java.util.Scanner;


public class Ejercicio6 {
    public static boolean esDivisible(double n,double m){
        boolean si=false;
        if ((n/m)>0){
            si = true;
       }
        return si;
    }
    public static void main(String[] args) {
        Scanner escaneado= new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        double n=escaneado.nextInt();
        System.out.println("Introduzca el segundo numero");
        double m=escaneado.nextInt();
        esDivisible(n,m);

    }
}
