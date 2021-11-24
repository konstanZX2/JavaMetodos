import java.util.Scanner;

public class Ejercicio7 {
    public static boolean trianguloSePuede(int lado1, int lado2, int lado3) {
        boolean comprobacion = true;
        if (lado1 > (lado2 + lado3)) {
            comprobacion = false;
        } else if (lado2 > (lado1 + lado3)) ;
        {
            comprobacion = false;
        } if (lado3 > (lado1 + lado2)) ;
        {
           comprobacion = false;
        }

        return comprobacion;


    }




    public static void main(String[] args) {
        Scanner escaneado = new Scanner(System.in);
        System.out.println("Introduzca el primer lado");
        int lado1 = escaneado.nextInt();
        System.out.println("Introduzca el segundo lado");
        int lado2 = escaneado.nextInt();
        System.out.println("Introduzca el tercer lado");
        int lado3 = escaneado.nextInt();
        trianguloSePuede(lado1, lado2, lado3);
    }
}
