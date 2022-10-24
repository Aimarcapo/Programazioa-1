package methods;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int[] array;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu arrayaren luzera: ");
        array = new int[in.nextInt()];

        System.out.print("Sartu arrayaren balioak espazioekin banatuta: ");

        for(int i = 0; i < array.length; i++){
            array[i] = in.nextInt();
        }
        
        reverse(array);
        in.close();
    }

    public static void reverse(int[] array){

        int [] array2;
        array2 = new int[array.length];

        for(int i = array.length-1, x = 0; i >= 0; i--, x++){
            array2[x] = array[i];
        }

        System.out.println("The reversed array is " + Arrays.toString(array2));
    }
}
