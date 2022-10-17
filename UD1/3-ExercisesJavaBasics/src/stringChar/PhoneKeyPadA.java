package stringChar;
import java.util.Scanner;

public class PhoneKeyPadA {
    public static void main(String[] args) {

        String inChar;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu karaktere bat: ");
        inChar = in.next() .toLowerCase();
        in.close();

        if((inChar.charAt(0) >= 97) && (inChar.charAt(0) <=99)){
            System.out.println("2");
        } else if((inChar.charAt(0) >= 100) && (inChar.charAt(0) <=102)){
            System.out.println("3");
        } else if((inChar.charAt(0) >= 103) && (inChar.charAt(0) <=105)){
            System.out.println("4");
        } else if((inChar.charAt(0) >= 106) && (inChar.charAt(0) <=108)){
            System.out.println("5");
        } else if((inChar.charAt(0) >= 109) && (inChar.charAt(0) <=111)){
            System.out.println("6");
        } else if((inChar.charAt(0) >= 112) && (inChar.charAt(0) <=115)){
            System.out.println("7");
        } else if((inChar.charAt(0) >= 116) && (inChar.charAt(0) <=118)){
            System.out.println("8");
        } else if((inChar.charAt(0) >= 119) && (inChar.charAt(0) <=122)){
            System.out.println("9");
        } 
    }
}
