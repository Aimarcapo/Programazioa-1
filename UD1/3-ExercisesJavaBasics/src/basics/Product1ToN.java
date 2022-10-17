package basics;
public class Product1ToN {
    public static void main(String[] args) {
        
        //ALDAGAIAK DEFINITU (FINAL = EZ DIRA ALDATZEN)
        int product = 1;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 10;
       
        //BUKLEA NOIZARTE EGITEN DEN DEFINITU
        for(int cont = LOWERBOUND; cont < UPPERBOUND; cont ++) {
            product *= cont;    
        }

        //EMAITZA ESAN
        System.out.println("The product is " + product);
    }
}