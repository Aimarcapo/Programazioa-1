public class ExtractDigits {
        public static void main(String[] args) {

            int n = 564846;
            
            for(int digit = n % 10; n > 0; n = n / 10) {
                System.out.print(digit + " ");
                digit = n/10 % 10;
            }

    }
}
