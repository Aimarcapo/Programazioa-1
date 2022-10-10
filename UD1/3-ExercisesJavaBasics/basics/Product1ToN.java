public class Product1ToN {
    public static void main(String[] args) {
        int product = 1;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 10;
        
        for(int cont = LOWERBOUND; cont < UPPERBOUND; cont ++) {
            product *= cont;    
        }
        System.out.println("The product is " + product);
    }
}