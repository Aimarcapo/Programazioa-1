package testak;

import java.util.Arrays;
import java.util.Scanner;

import model.Zatikia;

public class TestZatikiakOrdenatu {
    public static void main(String[] args) {
        Zatikia[] array = new Zatikia[3];

        Scanner in = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.print("Esan arrayaren " + (i+1) + ". posizioa: ");
            array[i] = new Zatikia(in.next());
        }
        
        in.close();
        
        Zatikia.zatikiakOrdenatu(array);
        System.out.println(Arrays.toString(array));

        System.out.println();
    }
}
