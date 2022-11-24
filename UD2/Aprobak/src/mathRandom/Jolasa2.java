package mathRandom;

import java.util.Scanner;

public class Jolasa2 {
    public static void main(String[] args) {
        final int MAX = 100;
        int respuesta, aleatorio = 0;
        int modo;
        String seguir = "";
        int total = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Este juego consiste en lo siqguiente, tú dices un numero ");
        System.out.println("y yo te digo otro en un margen de los 10 números siguientes al tuyo, después tú,");
        System.out.println("y así consecutivamente, hasta que alguien diga 100 y pierda.");
        System.out.println("");
        System.out.println("");

        do {
            System.out.println("ELIGE EN QUE MODO QUIERES JUGAR:");
            System.out.println("1.- Ganable");
            System.out.println("2.- Invencible");
            System.out.print("¿Que modo eliges? ");

            do {
                modo = in.nextInt();
                if (modo != 1 && modo != 2) {
                    System.out.println("El modo que has elegido no es válido. Prueba otra vez.");
                }
            } while (modo != 1 && modo != 2);

            while (total <= 100) {

                respuesta = 0;
                do {
                    System.out.println("Dime tu número:");
                    respuesta = in.nextInt();
                    if (respuesta > 10) {
                        System.out.println("El número que metas tiene que ser menor o igual a 10");
                    }
                } while (respuesta > 10);

                total += respuesta;
                System.out.println("Cuenta total: " + total);

                if (total >= 100) {
                    System.out.println("HAS PERDIDO.");
                    break;
                }

                System.out.println("Déjame pensar...");

                if (modo == 1) {
                    aleatorio = modo1(aleatorio, total);
                } else if(modo == 2) {
                    aleatorio = modo2(aleatorio, respuesta, MAX, total);
                }

                System.out.println("Yo sumo " + aleatorio);

                total += aleatorio;
                System.out.println("Cuenta total: " + total);
                System.out.println("");

                if (total == 100) {
                    System.out.println("ME HAS GANADO.");
                    break;
                }
            }

            System.out.println("¿Quieres jugar otra vez?");
            seguir = in.next();

        } while (seguir.equals("SI")|| seguir.equals("Si") || seguir.equals("si"));

        in.close();
    }

    /** Decide un numero aleatorio que cumple las condiciones requeridas. */
    public static int modo1(int aleatorio, int total) {

        aleatorio = (int) (Math.random() * 10 + 1);

        while (total + aleatorio > 100) {
            aleatorio--;
        }

        return aleatorio;
    }

    /** Decide cual es el numero mas adecuado para ganar la partida */
    public static int modo2(int aleatorio, int respuesta, int MAX, int total) {
        int kopia = total;

        aleatorio = (int) (Math.random() * 10 + 1);

        if (total < 66 && total > 55) {
            aleatorio = 0;
            do {
                aleatorio++;
                total++;
            } while (total != 66);
        }

        if (total < 77 && total > 66) {
            aleatorio = 0;
            do {
                aleatorio++;
                total++;
            } while (total != 77);
        }

        if (total < 88 && total > 77) {
            aleatorio = 0;
            do {
                aleatorio++;
                total++;
            } while (total != 88);
        }

        if (total < 99 && total > 88) {
            aleatorio = 0;
            do {
                aleatorio++;
                total++;
            } while (total != 99);
        }

        while (kopia + aleatorio > 100) {
            aleatorio--;
        }

        return aleatorio;
    }
}