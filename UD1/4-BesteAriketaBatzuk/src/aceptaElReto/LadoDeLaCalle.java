package aceptaElReto;
import java.util.Scanner;
public class LadoDeLaCalle {
    public static void main(String[] args) {
        int kont = 0;
        String[] emaitza;
        emaitza = new String[1000];

        Scanner in = new Scanner(System.in);
        int zenb;
        do{
            zenb = in.nextInt();
            if(zenb%2 == 0){
                emaitza[kont] = "DERECHA";
            } else {
                emaitza[kont] = "IZQUIERDA";
            }
            kont++;

        }while(zenb != 0);

        for (int i = 0; i < emaitza.length; i++) {
            if(emaitza[i] != null){
                System.out.println(emaitza[i]);
            }
        }
        in.close();
    }
}
