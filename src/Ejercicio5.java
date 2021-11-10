import java.util.Scanner;

public class Ejercicio5 {
    public static void elMayorDeTres(int primerValor,int segundoValor,int tercerValor){
        if( primerValor>segundoValor && primerValor>tercerValor){
            System.out.println("El mayor valor es el "+ primerValor);}
        if(segundoValor>primerValor && segundoValor>tercerValor){
            System.out.println("El mayor valor es el "+ segundoValor);}
        if(tercerValor>primerValor && tercerValor>segundoValor){
            System.out.println("EL mayor valor es el "+ tercerValor);
    }
}
    public static void main(String[] args) {
        System.out.println("Introduzca el primer valor");
        int primerValor; int segundoValor; int tercerValor;
        Scanner escaneado = new Scanner(System.in);
        primerValor = escaneado.nextInt();
        System.out.println("Introduzca el segundo valor");
        segundoValor = escaneado.nextInt();
        System.out.println("Introduzca el tercer valor");
        tercerValor = escaneado.nextInt();
        elMayorDeTres(primerValor,segundoValor,tercerValor);

    }
}
