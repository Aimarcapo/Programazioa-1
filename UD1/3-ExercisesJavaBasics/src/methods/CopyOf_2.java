package methods;

import java.util.Arrays;
import java.util.Scanner;

public class CopyOf_2 {
    public static void main(String[] args) {
        int[] array1;
        int newLength;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu arrayaren luzera: ");
        array1 = new int[in.nextInt()];

        System.out.print("Sartu arrayaren balioak espazioekin banatuta: ");

        for(int i = 0; i < array1.length; i++){
            array1[i] = in.nextInt();
        }

        System.out.print("Sartu kopiaren tamaina berria: ");
        newLength = in.nextInt();

        System.out.println("Kopiaren balioa, " + Arrays.toString(copyOf_newLength(array1, newLength)) + " da.");

        in.close();

    }

    public static int[] copyOf_newLength(int[] array1, int newLength){

        int[] array2 = array1;

        array2 = new int[newLength];

        for (int i = 0; i < newLength; i++){

            if(i < array1.length){                 
                array2[i] = array1[i];
            } else {                
                array2[i] = 0;
            }
        }

        return array2;
    }
}
