package basics;
public class ExtractDigits {
        public static void main(String[] args) {

            //ALDAGAIA DEFINITU
            int n = 564846;
            
            //FOR-AREN ORDENA: ALDAGAIA SORTU -> BALDINTZA KONPROBATU -> EGIN BEHARREKOA EGIN -> BUKAERAKO ARIKETA EGIN
            for(int digit = n % 10; n > 0; n = n / 10) {
                System.out.print(digit + " ");
                digit = n/10 % 10;
            }

    }
}
