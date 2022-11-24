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

    //MARRAZTEKO
    /**Metodo honek laukia beteta marrazten du. */
    public void marraztuHutsik(){
        
        for(int y = 1; y <= this.getAltuera(); y++){
            if(y==1 || y==this.getAltuera()){
                for(int x = 1; x <= this.getZabalera(); x++){
                    System.out.print("* ");
                }
            } else {
                for (int x = 1; x <= this.getZabalera(); x++) {
                    if(x==1 || x==this.getZabalera()){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            
            System.out.println("");
        }
    }

    /**Metodo honek laukia hutsik marrazten du. */
    public void marraztuBeteta(){
        
        for(int y = 0; y < this.getAltuera(); y++){
            for (int x = 0; x < this.getZabalera(); x++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    /**Karaktere berezi batekin laukia marrazteko */
    public void marraztuBeteta(char ikurra){
        for(int y = 0; y < this.getAltuera(); y++){
            for (int x = 0; x < this.getZabalera(); x++) {
                System.out.print(ikurra + " ");
            }
            System.out.println("");
        }
    }

    /**Karaktere berezi batekin lauki marraztuaren String-a bueltatzeko */
    public String laukiBetea(){
        String emaitza = "";

        for(int y = 0; y < this.getAltuera(); y++){
            for (int x = 0; x < this.getZabalera(); x++) {
                emaitza += "* ";
            }
            emaitza += "\n";
        }        

        return emaitza;
    }

    

    //HANDIENA TOPATZEKO METODOAK
    /**2 lauki konparatzeko metodoa */
    public  boolean isBiggerThan(Laukia l) {

        boolean handiago = false;

        if (this.getAzalera() > l.getAzalera()) {
            handiago = true;
        }

        return handiago;

    }
    /**Array baten lauki handiena topatzeko metodoa */
    public static Laukia getTheBiggest(Laukia[] lk) {
        
        Laukia max = lk[0];

        for (int i = 1; i < lk.length && lk[i] != null; i++) {
            if (lk[i].isBiggerThan(max)) {
                max = lk[i];
            }
        }

        return max;
    }

    //ARIKETA GEHIGARRIAK

    /**Lauki array bat txikienetik handieneta ordenatzeko BubleSort ariketan oinarrituta */
    public static void ordenatu(Laukia[] laukiak){
        
        for (int a = 0; a < laukiak.length; a++) {
            for (int i = 0; i < laukiak.length-1; i++) {
                if(laukiak[i].getAzalera() > laukiak[i+1].getAzalera()){
                    Laukia kopia = laukiak[i];
                    laukiak[i]=laukiak[i+1];
                    laukiak[i+1]=kopia; 
                }
            }
        }
    }

    /**Lauki bat proportzionalki handitzeko */
    public static void handitu(Laukia l, int tamaina){
        l.setAltuera(l.getAltuera()*tamaina);
        l.setZabalera(l.getZabalera()*tamaina);
    }

}
