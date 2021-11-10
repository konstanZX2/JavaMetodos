import java.util.Scanner;

public class Ejercicio3 {
    public static void evaluacionExamen(int notaDelExamen) {
        if (notaDelExamen < 3 && notaDelExamen >= 0) {
            System.out.println("Muy Deficiente");
        } else if (notaDelExamen >= 3 && notaDelExamen < 5) {
            System.out.println("Insuficiente");
        } else if (notaDelExamen >= 5 && notaDelExamen < 6) {
            System.out.println("Suficiente");
        } else if (notaDelExamen >= 6 && notaDelExamen < 7) {
            System.out.println("Bien");
        } else if (notaDelExamen >= 7 && notaDelExamen < 9) {
            System.out.println("Notable");
        } else if (notaDelExamen >= 9 && notaDelExamen <= 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("La nota que has introducido no es parte del sistema");
        }
    }

    public static void main(String[] args) {
        System.out.println("Introduzca la nota del examen");
        int notaDelExamen;
        Scanner escaneado = new Scanner(System.in);
        notaDelExamen = escaneado.nextInt();
        evaluacionExamen(notaDelExamen);

    }
}
