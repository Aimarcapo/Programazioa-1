import java.util.Scanner;

public class StringToCharArray {
    public static void main(String[] args) {
        char[] karaktereak;
        Scanner in = new Scanner(System.in);

        System.out.println("Sartu String bat karakteretan deskonposatzeko:");
        String string = in.next();

        karaktereak = string.toCharArray();

        for (int i = 0; i < karaktereak.length; i++) {
            System.out.println(karaktereak[i]);
        }

        in.close();
    }
    
}
