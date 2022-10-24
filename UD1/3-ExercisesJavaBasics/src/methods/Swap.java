package methods;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int[] array1, array2;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu lehenengo arrayaren luzera: ");
        array1 = new int[in.nextInt()];

        System.out.print("Sartu lehenengo arrayaren balioak espazioekin banatuta: ");

        for(int i = 0; i < array1.length; i++){
            array1[i] = in.nextInt();
        }

        System.out.print("Sartu bigarren arrayaren luzera: ");
        array2 = new int[in.nextInt()];

        System.out.print("Sartu bigarren arrayaren balioak espazioekin banatuta: ");

        for(int i = 0; i < array2.length; i++){
            array2[i] = in.nextInt();
        }

        if(swap(array1, array2)){
            System.out.println("Sartutako bi arrayak luzera berdina dute. Baloreak aldatu egin dira: ");
            System.out.println("Lehenengo arraya: " + Arrays.toString(array2));
            System.out.println("Lehenengo arraya: " + Arrays.toString(array1));
        } else {
            System.out.println("Sartutako arrayak ez dute luzera berdina, berez, ezinezkoa da baloreak aldatzea.");
        }

        in.close();
    }

    public static boolean swap(int[] array1, int[] array2){
        boolean swap = false;

        if(array1.length == array2.length){
            int [] copy = array1;

            array1 = array2;
            array2 = copy;

            swap = true;
        }

        return swap;
    }
}
