package methods;
import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        int[] array;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu arrayaren luzera: ");
        array = new int[in.nextInt()];

        System.out.print("Sartu arrayaren balioak espazioekin banatuta: ");

        for(int i = 0; i < array.length; i++){
            array[i] = in.nextInt();
        }

        in.close();

        print(array);

    }

    public static void print(int[] array){

        System.out.print("[");
        int i;
        for(i = 0; i < array.length - 1; i++){
            System.out.print(array[i] + ", ");
        }
        i = array.length - 1;
        System.out.print(array[i] + "]");
    }
}
