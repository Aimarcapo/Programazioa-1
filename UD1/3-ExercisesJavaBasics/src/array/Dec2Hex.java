package array;
import java.util.Scanner;

public class Dec2Hex {
   public static void main(String[] args) {

      int dec;         
      String hexStr = "";  
      int radix = 16;    
      final char[] HEX_CHARS =   
         {'0','1','2','3', '4','5','6','7', '8','9','A','B', 'C','D','E','F'};
   
      Scanner in = new Scanner(System.in);
      System.out.print("Sartu zenbaki dezimala: ");
      dec = in.nextInt();
      in.close();
   
      while (dec > 0) {
         int hexDigit = dec % radix;   
         hexStr = HEX_CHARS[hexDigit] + hexStr;
         dec = dec / radix;
      }
      System.out.println("Zenbaki hexadezimal ekibalentea: " + hexStr);
   }
}