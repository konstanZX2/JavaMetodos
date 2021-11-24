import java.util.Scanner;

public class Elejercicioesedelaspiedraslospapelesylastijerasquenosehacerporquemefaltan30ejerciciosporhaceraunsad {

    /*return jugadas[(int)(Math.random()*jugadas.lenght)]

                1 0.5*3=1,5
                2 0.7*3=2,1
                0 0,2*3=0,6

                5 turnos.
        Array de 10.
        De posicion 0 a posicion 9.

        el primer va a ser la persona(escaner), y la segunda la Ia(jugada Ia). Asi hasta el 9 del array.
                1ero usuario(escaner), 2ndo Ia(jugada ia), 3ero usuario, 4to Ia.

        calculaResultado(resultados[0],resultados[1])

        Despues hacer otro array para calcular cuantas veces se ha hecho las cosas.

        Y haces un for hasta el 5 porque son par de jugadas. cada partida es un bucle.
        Impares jugador, pares Ia o al reves como quieras.

        public static String jugadaIA(){
            return "Papel";



            public static int calculaGanador(String jugadaUsuario, String jugadaIA){
                return AI;
                return "Empate";
                return "jugador";



                public static void muestraEstadisticas(String[] jugadas){
                    int cantidadPiedras= 0;
                    int cantidadTijeras=0;
                    int cantidadPapel=0;
                    int partidasGanadasUsuario=0;
                   ....
                    for (int i=0; i<5; i+=2){
                        jugadas[i]=convierteANombreCompleto(escaneado.next());
                        jugadas[i+1]=jugada IA();
                        if(calculaGanador(jugadas[i], jugadas[i+1]== "IA");}
                    partidasGanadasIA++;





                    public static String convierteANombreCompleto(String [] jugada){
                        if (jugada equals("p"))
                        return "Papel";
                        if(jugada equals(Pi)
                        return "Piedra";
                   ...





                        public static void main
                        String[] jugadas = new String[10];
                        Scanner escaneado = new Scanner System in
                        for (int i=0; i<5; i+=2){
                            jugadas[i]=convierteANombreCompleto(escaneado.next());
                            jugadas[i+1]=jugada IA();
                            Sout(calculaGanador(jugadas[i], jugadas[i+1]));}


                        muestraEstadisticas(jugadas);



           */


    /*    public static void main(String[] args) {
            String[] jugadas;
            Scanner escaneado = new Scanner(System.in);
            jugadas = new String[10];

            String jugador;
            String IA;
            String jugadorturno1 = escaneado.nextLine();
            String jugadorturno2 = escaneado.nextLine();
            String jugadorturno3 = escaneado.nextLine();
            String jugadorturno4 = escaneado.nextLine();
            String jugadorturno5 = escaneado.nextLine();
            double IAturno1 = Math.random();
            String IAturno2 = "IAturno2";
            String IAturno3 = "IAturno3";
            String IAturno4 = "IAturno4";
            String IAturno5 = "IAturno5";
            jugadas[0] = jugadorturno1;
            jugadas[1] = String.valueOf(IAturno1);
            jugadas[2] = jugadorturno2;
            jugadas[3] = IAturno2;
            jugadas[4] = jugadorturno3;
            jugadas[5] = IAturno3;
            jugadas[6] = jugadorturno4;
            jugadas[7] = IAturno4;
            jugadas[8] = jugadorturno5;
            jugadas[9] = IAturno5;

            for (String i : jugadas) {
                System.out.println(i);

            }

        }*/
    public enum Jugada {
        PIEDRA,
        PAPEL,
        TIJERA,
    }

    public enum Resultado {
        IA,
        USUARIO,
        EMPATE
    }



    public static Jugada jugadaIA() {
        Jugada[] jugadas = new Jugada[]{Jugada.PAPEL, Jugada.PIEDRA, Jugada.TIJERA};
        return jugadas[(int) (Math.random() * jugadas.length)];
    }

    public static Resultado calculaGanador(String jugadaUsuario, String jugadaIA) {
        if (jugadaUsuario == Jugada.PAPEL && jugadaIA == Jugada.PIEDRA)
            return Resultado.USUARIO;
        if (jugadaUsuario == Jugada.PIEDRA && jugadaIA == Jugada.TIJERA)
            return Resultado.USUARIO;
        if (jugadaUsuario == Jugada.TIJERA && jugadaIA == Jugada.PAPEL)
            return Resultado.USUARIO;
        if (jugadaUsuario == Jugada.PAPEL && jugadaIA == Jugada.TIJERA)
            return Resultado.IA;
        if (jugadaUsuario == Jugada.PIEDRA && jugadaIA == Jugada.PAPEL)
            return Resultado.IA;
        if (jugadaUsuario == Jugada.TIJERA && jugadaIA == Jugada.PIEDRA)
            return Resultado.IA;
        if (jugadaUsuario == Jugada.PAPEL && jugadaIA == Jugada.PAPEL)
            return Resultado.EMPATE;
        if (jugadaUsuario == Jugada.PIEDRA && jugadaIA == Jugada.PIEDRA)
            return Resultado.EMPATE;
        if (jugadaUsuario == Jugada.TIJERA && jugadaIA == Jugada.TIJERA)
            return Resultado.EMPATE;

    }


    public static void main(String[] args) {
        Scanner escaneado = new Scanner(System.in);
        int jugadas[] = new int[10];
        for (int i = 0; i < 10; i += 2) {
            jugadas[i] = Jugada.valueOf(escaneado.next().toUpperCase());
            jugadas[i + 1] = jugadaIA();
            System.out.println(calculaGanador(jugadas[i], jugadas[i + 1]));
        }


    }
}