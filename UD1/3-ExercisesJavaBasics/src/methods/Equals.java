package methods;

import java.util.Scanner;

public class Equals {
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

        if(equals(array1, array2)){
            System.out.println("Sartutako bi arrayak, berdin berdinak dira.");
        } else if(!equals(array1, array2)) {
            System.out.println("Sartutako arrayak ez dira berdinak.");
        }

        in.close();
    }

    public static boolean equals(int[] array1, int[] array2){

        boolean equals = true;

        for(int i = 0; i < array1.length; i++){
            if((array1[i] != array2[i]) || (array1.length != array2.length)) {
                equals = false;
            }
        }

        return equals;
    }
}
