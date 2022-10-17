package basics;
public class PrintDayInWord {
    public static void main(String[] args) {
        
      //ALDAGAIA DEFINITU
      int day = 5;  
       
        //NESTED-IF, KASU BAKOITZERAKO (HOBETO SWITCH-CASE-DEFAULT)
        if (day == 1) {   
           System.out.println( "ASTELEHENA" );
        } else if ( day == 2 ) {
          System.out.println( "ASTEARTEA" );
        } else if ( day == 3 ) {
          System.out.println( "ASTEAZKENA" ); 
        } else if ( day == 4 ) {
          System.out.println( "OSTEGUNA" );
        } else if ( day == 5 ) {
            System.out.println( "OSTIRALA" );
          } else if ( day == 6 ) {
            System.out.println( "LARUNBATA" ); 
        } else if ( day == 7 ) {
            System.out.println( "IGANDEA" );
        } else {
          System.out.println( "NOT VALID DAY" );
        }
  
     }
  }

