package stringChar;
import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        String word;
        int index = 0;
        int wordLength;

        Scanner in = new Scanner(System.in);
        System.out.print("Sasrtu deskodifikatu nahi duzun hitza: ");
        word = in.next().toUpperCase();
        wordLength = word.length();
        in.close();

        while(index < wordLength){
            char momchar = word.charAt(index);

            if((momchar >= 65) && (momchar <= 67)){
                momchar += 23;
            } else if((momchar >= 68 ) && (momchar <= 90)){
                momchar -= 3;
            } else {
                System.out.print(" (Karaktere hau ez da ulertzen) ");
            }

            System.out.print(momchar);
            index++;
        }
    }
}
