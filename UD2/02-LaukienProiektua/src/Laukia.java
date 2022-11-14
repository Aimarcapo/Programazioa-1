public class Laukia {
    
    //ALDAGAI PRIBATUAK SORTU
    private int zabalera;
    private int altuera;

    //KONSTRUCTOREAK
    /**Ezer ere ez bada sartzen, default baloreak hartuko du. */
    public Laukia(){
        zabalera = 5;
        altuera = 5;
    }

    /**Altuera eta zabalera eskuz sartzeko konstruktorea. */
    public Laukia(int zab, int alt){
        zabalera = zab;
        altuera = alt;
    }

    //METODO PUBLIKOAK

    //GETTER METODOAK ALDAGAI PRIBATUAK ERAKUSTEKO
    /**Metodo honek karratuaren zabalera erakutsiko du. */
    public int getZabalera(){
        return zabalera;
    }
    /**Metodo honek karratuaren altuera erakutsiko du. */
    public int getAltuera(){
        return altuera;
    }
    /**Metodo honek karratuaren azalera erakutsiko du. */
    public int getAzalera(){
        return zabalera*altuera;
    }
    /**Metodo honek karratuaren perimetroa erakutsiko du. */
    public int getPerimetroa(){
        return altuera*2 + zabalera*2;
    }
    /**Metodo honek karratu mota erakutsiko du. */
    public String getMota(){
        if(altuera == zabalera){
            return "karratua";
        } else if(altuera > zabalera){
            return "bertikala";
        } else {
            return "horizontala";
        }
    }

    //SETTER METODOAK ALDAGAI PRIBATUAK ALDATZEKO
    /**Metodo honek karratuaren zabalera aldatzea ahalbidetzen du. */
    public void setZabalera(int zabaleraBerria){
        zabalera = zabaleraBerria;
    }
    /**Metodo honek karratuaren altuera aldatzea ahalbidetzen du. */
    public void setAltuera(int altueraBerria){
        altuera = altueraBerria;
    }

    //TOSTRING METODOA
    /** Atributu guztiak String bezala idazteko, eta gure objektua String bezala tratatu ahal izateko.*/
    public String toString(){
        return "Laukia[" + zabalera + "x" + altuera + "]";
    }

    //HANDIENA TOPATZEKO METODOAK
    /**2 lauki konparatzeko metodoa */
    public  boolean isBiggerThan(Laukia l1) {

        boolean handiago = false;

        if (this.getAzalera() > l1.getAzalera()) {
            handiago = true;
        }

        return handiago;

    }

    public static Laukia getTheBiggest(Laukia[] laukiak) {
        
        Laukia max = laukiak[0];

        for (int i = 1; i < laukiak.length && laukiak[i] != null; i++) {
            if (laukiak[i].isBiggerThan(max)) {
                max = laukiak[i];
            }
        }

        return max;
    }
}
