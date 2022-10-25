package methods;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int[] array;
        int key;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu arrayaren luzera: ");
        array = new int[in.nextInt()];

        System.out.print("Sartu arrayaren balioak espazioekin banatuta: ");

        for(int i = 0; i < array.length; i++){
            array[i] = in.nextInt();
        }

        System.out.print("Esan topatu nahi duzun zenbakia: ");
        key = in.nextInt();

        System.out.println(search(array, key));

        in.close();
    }

    public static int search(int[] array, int key){

        int index = -1;

        for(int i = 0; i < array.length; i++){
            if(array[i] == key){
                index = i;
            }
        }

        return index;
        
    }
}
