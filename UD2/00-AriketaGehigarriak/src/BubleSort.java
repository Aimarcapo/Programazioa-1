import java.util.Scanner;
 // 10 9 20 15 4 8 41 11 1 5
public class BubleSort {
    
    public static void main(String[] args) {
        int[] array;
        array = new int[10];

        System.out.println("Sartu baloreak ordenean: ");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i]=in.nextInt();
        }
        in.close();

        ordenatu(array);
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    /**Bubble sort modura hainbat zenbaki ordenatzeko */
    public static void ordenatu(int[] array){
        
        for (int a = 0; a < array.length; a++) {
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    int kopia = array[i];
                    array[i]=array[i+1];
                    array[i+1]=kopia; 
                }
            }
        }
    }
}
