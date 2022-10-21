package methods;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayToString {
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

        System.out.println(arrayToString(array));

    }

    public static String arrayToString(int[] array){

        String emaitza = (Arrays.toString(array));
        return emaitza;
    }
}
