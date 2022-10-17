package stringChar;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        String inStr;
        int inStrLen;
        int cont = 1;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu nahi duzun hitza: ");
        inStr = in.next();
        inStrLen = inStr.length();
        in.close();
        int index = inStrLen - 1;

        System.out.print("Sartu duzun hitzaren alderantzizkoa hau da: ");
        do {
            System.out.print(inStr.charAt(index));
            --index;
            ++cont;
        } while(cont <= inStrLen);

    }
}
