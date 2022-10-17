package stringChar;
import java.util.Scanner;

public class CaesarsCode {
    public static void main(String[] args) {

        String word;
        int wordLen;
        int index = 0;
        char momchar;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu kodifikatzea nahi duzun hitza: ");
        word = in.next().toUpperCase();
        wordLen = word.length();
        in.close();

        while(index < wordLen){

            momchar = word.charAt(index) ; 

            if((momchar >= 65) && (momchar <= 87)){
                momchar += 3;                               
            } else if(momchar == 88 || momchar == 89 || momchar == 90) {
                momchar -= 23;
            } else {
                System.out.print(" (Sartutako karaktera bat gaizki dago) ");
            }
            index++;
            System.out.print(momchar);
        }

        

    }
}
