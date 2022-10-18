package basics;

public class CozaLozaWoza {
    public static void main(String[] args) {
        final int max = 110;

        for(int cont = 1; cont <= max; cont++){
            if((cont % 3) == 0){
                System.out.print("Coza");
            } 
            if((cont % 5) == 0){
                System.out.print("Loza");
            }
            if((cont % 7) == 0){
                System.out.print("Woza");
            }
            if(((cont % 3) != 0) && ((cont % 5) != 0) && ((cont % 7) != 0)){
                System.out.print(cont);
            }

            if((cont % 11) == 0){
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}
