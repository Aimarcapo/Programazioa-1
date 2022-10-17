package basics;
public class PrintNumberInWord {   
   public static void main(String[] args) {
      
    //ALDAGAIA DEFINITU
    int number = 2;  
       
      //NESTED-IF, KASU BAKOITZERAKO (HOBETO SWITCH-CASE-DEFAULT)
      if (number == 1) {   
         System.out.println( "ONE" );
      } else if ( number == 2 ) {
        System.out.println( "TWO" );
      } else if ( number == 3 ) {
        System.out.println( "THRE" ); 
    } else if ( number == 4 ) {
        System.out.println( "FOUR" );
      } else {
        System.out.println( "OTHER" );
      }

   }
}

