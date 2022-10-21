package methods;

import java.util.Scanner;

public class Contains {
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

        if(contains(array, key)){
            System.out.println("Esandako zenbakia BAI da arrayaren balio bat.");
        } else {
            System.out.println("Esandako zenbakia EZ da arrayaren balio bat.");
        }

        in.close();
    }

    public static boolean contains(int[] array, int key){

        boolean contains = false;

        for(int i = 0; i < array.length; i++){
            if(array[i] == key){
                contains = true;
            }
        }

        return contains;
    }
}
