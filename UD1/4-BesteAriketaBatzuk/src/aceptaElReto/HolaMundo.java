package aceptaElReto;

public class HolaMundo {
    public static void main(String[] args) {
        int kop;

        java.util.Scanner in = new java.util.Scanner(System.in);
        kop = in.nextInt();
        in.close();

        if((kop >= 0) && (kop <= 5)){
            for(int i = 0; i < kop; i++){
                System.out.println("Hola mundo.");
            }            
        }        
    }
}
