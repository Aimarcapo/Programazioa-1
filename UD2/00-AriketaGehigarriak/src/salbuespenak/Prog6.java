package salbuespenak;

public class Prog6 {

    public static void main(String[] args) {
        int[] zenbakiak = {1, 15, 2};
        try{
            metodoArriskutsua(zenbakiak); //unreported exception Exception;   must be caught or declared to be thrown
        } catch (Exception ex) {
            System.out.println("Salbuespena gertatu da.");
            System.out.println(ex.getMessage());
        }
        
    }
    public static void metodoArriskutsua(int[] z) throws Exception {
        
        System.out.println(z[5]);
        
    }
}

