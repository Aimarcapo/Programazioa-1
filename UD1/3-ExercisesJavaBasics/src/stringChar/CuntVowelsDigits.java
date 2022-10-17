package stringChar;
import java.util.Scanner;

public class CuntVowelsDigits {
    public static void main(String[] args) {

        String inStr;
        int digits = 0;
        int vowels = 0;
        int index = 0;
        double inStrLen;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu nahi duzun karaktere katea: ");
        inStr = in.next().toLowerCase();
        inStrLen = inStr.length();
        in.close();

        while(index < inStrLen){
            if((inStr.charAt(index)>= 48) && (inStr.charAt(index)<= 57)) {
                ++digits;
            } else if((inStr.charAt(index) == 97) || (inStr.charAt(index) == 101) || (inStr.charAt(index) == 105) || (inStr.charAt(index) == 111) || (inStr.charAt(index) == 117)){
                ++vowels;
            }
            ++index;
        } 
        System.out.print("Number of vowels: " + vowels + "  ");  
        System.out.printf("%.2f%% %n", (vowels / inStrLen) * 100); 

        System.out.print("Number of digits: " + digits + "  ");  
        System.out.printf("%.2f%% %n", (digits / inStrLen) * 100);
    }
}
