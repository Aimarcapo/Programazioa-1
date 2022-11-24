package random;

public class Prog1 {
    public static void main(String[] args) {
        System.out.printf("%26s %10s %10s %10s\n", "Math.random()", "Bitarra", "Txanpona", "Dadoa");
        System.out.println("=========================================================================");
        
        for(int i = 1; i <= 10; i++){
            double ausazkoa = Math.random();

            System.out.printf("%2d) %.20f", i, ausazkoa);

            if(ausazkoa >= 0.5){
                System.out.printf("%10d %12s", 1, "Gurutzea");
            } else{
                System.out.printf("%10d %12s", 0, "Aurpegia");
            }
            
            System.out.printf("%10d\n", (int)(ausazkoa * 6 + 1));
        }

    }
}
