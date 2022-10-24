package methods;

import java.util.Arrays;
import java.util.Scanner;

public class CopyOf {
    public static void main(String[] args) {
        int[] array1;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu arrayaren luzera: ");
        array1 = new int[in.nextInt()];

        System.out.print("Sartu arrayaren balioak espazioekin banatuta: ");

        for(int i = 0; i < array1.length; i++){
            array1[i] = in.nextInt();
        }

        System.out.println("Kopiaren balioa, " + Arrays.toString(copyOf(array1)) + " da.");

        in.close();

    }

    public static int[] copyOf(int[] array1){

        int[] array2 = array1;

        return array2;
    }
}
