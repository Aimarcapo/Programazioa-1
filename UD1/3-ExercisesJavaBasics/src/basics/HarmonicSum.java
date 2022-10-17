package basics;
public class HarmonicSum {
    public static void main(String[] args) {

        //ALDAGAIAK DEFINITU
        int zatitzaile_max = 50000;
        int zatitzaile_min = 1;
        double L2R = 0.0;
        double R2L = 0.0;
        double difference;

        //SUMA HARMONIKOA EZKERRETIK ESKUMARA 
        for(double zatitzaile_1 = 1; zatitzaile_1 <= zatitzaile_max; ++zatitzaile_1) {
            L2R += 1/zatitzaile_1;
        }
        System.out.println("Suma harmonikoa ezkerretik eskumara " + L2R + " da.");

        //SUMA HARMONIKOA ESKUMATIK EZKERRERA
        for(double zatitzaile_2 = 50000; zatitzaile_2 >= zatitzaile_min; --zatitzaile_2) {
            R2L += 1/zatitzaile_2; 
        }
        System.out.println("Suma harmonikoa eskumatik ezkerrera " + R2L + " da.");

        //DESBERDINTASUNA KALKULATU (HANDIENA TOPATU, EMAITZA EZ IZATEKO NEGATIBOA)
        if(L2R>R2L){
            difference = L2R - R2L;
        } else {
            difference = R2L - L2R;
        }
        System.out.println("Diferentzia absolutua " + difference + " da.");
    }
}
