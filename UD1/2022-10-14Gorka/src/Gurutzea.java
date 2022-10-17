import java.util.Scanner;

/* Programa honek, emandako tamainarekin, "0"-z osatutako gurutze bat osatzen du
asteriskoekin osatutako karratu batean. */
public class Gurutzea {
    public static void main(String[] args) {
        int tamaina;

        do{
            Scanner in = new Scanner(System.in);
            System.out.print("Zein neurritako gurutzea marraztu nahi duzu (zenbaki bakoitia sartu)? ");
            tamaina = in.nextInt();
            in.close();
        } while((tamaina % 2) == 0);

        for(int x = 0; x < tamaina; x++){

            if(tamaina/2 == x){
                
                for(int y = 0; y < tamaina; y++){
                    System.out.print("0 ");
                }

            } else{
                
                for(int y = 0; y < tamaina; y++){
                    
                    if((tamaina/2) == y){
                        System.out.print("0 ");
                    } else {
                        System.out.print("* ");
                    }

                }
            
            }
            System.out.println("");            
        }        
    }
}