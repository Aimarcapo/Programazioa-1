package stringChar;
import java.util.Scanner;

public class ExchangeCipher {
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

            if(momchar == 65){
                    momchar = 90;
            } else if(momchar == 90){
                    momchar = 65;
            } else if(momchar == 66){
                momchar = 89;
            } else if(momchar == 89){
                momchar = 66;
            } else if(momchar == 67){
                momchar = 88;
            } else if(momchar == 88){
                momchar = 67;
            }

            System.out.print(momchar);
            index++;
        }
    }
}