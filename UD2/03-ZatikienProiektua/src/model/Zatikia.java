package model;
public class Zatikia {

    /*ALDAGAI PRIBATUAK SORTU*/
    private int zenbakitzailea;
    private int izendatzailea;

    /*KONSTRUKTOREAK*/
    public Zatikia (int zenba, int izenda){
        zenbakitzailea = zenba;
        izendatzailea = izenda;
    }
    public Zatikia(){
        zenbakitzailea = (int)(Math.random()*10+1);
        izendatzailea = (int)(Math.random()*10+1);
    }

    /**Metodo honek, sartutako String-a zatiki bezala hartuko du. KONSTRUKTOREA*/
    public Zatikia(String zatIdatzia) {

        int barra = zatIdatzia.indexOf("/");
        int strLen = zatIdatzia.length();

        String strGoikoa = zatIdatzia.substring(0, barra);
        String strBehekoa = zatIdatzia.substring(barra + 1, strLen);

        int zenbakitzailea = Integer.parseInt(strGoikoa);

        int izendatzailea = Integer.parseInt(strBehekoa);

        // Integer.toString(strGoikoa);
        this.izendatzailea = izendatzailea;
        this.zenbakitzailea = zenbakitzailea;
    }

    /*GETTER-ak*/
    public int getZenbakitzailea(){
        return zenbakitzailea;
    }
    public int getIzendatzailea(){
        return izendatzailea;
    }

    /*SETTER-ak*/
    public void setZenbakitzailea(int zenba){
        zenbakitzailea = zenba;
    }
    public void setIzendatzailea(int izenda){
        izendatzailea = izenda;
    }

    /*toString */
    public String toString(){
        return "[" + zenbakitzailea + "/" + izendatzailea + "]";
    }

    /*BESTELAKO METODOAK */
    /**Metodo honek, bi zatikien arteko biderketaren emaitza bueltatzen du*/
    public static Zatikia biderkatu(Zatikia zat1, Zatikia zat2){
        Zatikia emaitza = new Zatikia((zat1.getZenbakitzailea()*zat2.getZenbakitzailea()), (zat1.getIzendatzailea()*zat2.getIzendatzailea()));
        return emaitza;
    }
    /**Metodo honek, bi zatikien arteko batuketaren emaitza bueltatzen du*/
    public static Zatikia batu(Zatikia zat1, Zatikia zat2){
        Zatikia emaitza = new Zatikia(((zat1.getZenbakitzailea()*zat2.getIzendatzailea())+(zat2.getZenbakitzailea()*zat1.getIzendatzailea())), (zat1.getIzendatzailea()*zat2.getIzendatzailea()));
        return emaitza;
    }
    /**Metodo honek, zatiki bat gehitzen dio erabilitako zatikiari*/
    public void batu(Zatikia besteZatBat){
        this.setZenbakitzailea((this.getZenbakitzailea()*besteZatBat.getIzendatzailea())+(besteZatBat.getZenbakitzailea()*this.getIzendatzailea()));
        this.setIzendatzailea(this.getIzendatzailea()*besteZatBat.getIzendatzailea());
    }
    /**Metodo honek, zatiki baten hamartar baliokidea bueltatzen du */
    public double hamartarBaliokidea(){
        double hamartarra;
        hamartarra = (double)this.getZenbakitzailea()/(double)this.getIzendatzailea();
        return hamartarra;
    }
    /**Metodo honek, bi zatikien arteko konparazioa (handia/txikiagoa) 
    egiten du eta boolean baten bidez bueltatzen du */
    public boolean isBiggerThan(Zatikia besteZatikiBat){
        boolean bigger;

        if(this.hamartarBaliokidea() > besteZatikiBat.hamartarBaliokidea()){
            bigger = true;
        }else{
            bigger = false;
        }

        return bigger;
    }
    /**Metodo honek, zatikien array baten zatikiak ordenatzen ditu. */
    public static void zatikiakOrdenatu(Zatikia[] zatikiak){
        for (int a = 0; a < zatikiak.length; a++) {
            for (int i = 0; i < zatikiak.length-1; i++) {
                if(zatikiak[i].hamartarBaliokidea() > zatikiak[i+1].hamartarBaliokidea()){
                    Zatikia kopia = zatikiak[i];
                    zatikiak[i]=zatikiak[i+1];
                    zatikiak[i+1]=kopia; 
                }
            }
        }
    }
    /**Metodo honek, esaten du, erabiltzen ari den zatikia, bestearekiko baliokidea den ala ez */
    public boolean isBaliokidea(Zatikia besteZatikiBat){

        boolean baliokidea;

        if(this.hamartarBaliokidea() == besteZatikiBat.hamartarBaliokidea()){
            baliokidea = true;
        } else{
            baliokidea = false;
        }

        return baliokidea;
    }
    /**Metodo honek, zenbaki bat faktorizatzen du array batean*/
    public static int[] faktorizatu(int n){
        int cont = 0;
        int temp = n;
        while(temp > 1){
            for(int i = 2; i<=temp; i++){
                if(temp%i == 0){
                    temp /= i;
                    cont++;
                    break;
                }
            }
        }

        int[] emaitza = new int[cont];
        for(int a = 0; n > 1; a++){
            for(int i = 2; i<=n; i++){
                if(n%i == 0){
                    n /= i;
                    emaitza[a] = i;
                    break;
                }
            }
        }

        return emaitza;
    }
    /**Metodo honek, bi zenbakien mkt-a lortzen du */
    public static int mkt(int n1, int n2){
        int mkt=1;
        int[] fakt1 = Zatikia.faktorizatu(n1);
        int[] fakt2 = Zatikia.faktorizatu(n2);

        for(int i = 0; i < fakt1.length; i++){
            mkt *= fakt1[i];
        }
        for(int i = 0; i < fakt1.length; i++){
            for(int a = 0; a < fakt2.length; a++){
                if(fakt1[i] == fakt2[a]){
                    fakt2[a] = 1;
                    break;
                }
            }
        }
        for(int i = 0; i < fakt2.length; i++){
            mkt *= fakt2[i];
        }

        return mkt;
    }
    /**Metodo honek, bi zenbakien zkh-a lortzen du */
    public static int zkh(int n1, int n2){
        int zkh = 2;
        int txikiena;

        if(n1<n2){
            txikiena = n1;
        } else {
            txikiena = n2;
        }

        while(zkh<=txikiena){
            if(n1%zkh==0 && n2%zkh==0){
                break;
            }else{
                zkh++;
            }
        }
        return zkh;
    }
    /**Metodo honek, zatiki bat ahalik eta gehien sinplifikatzen du */
    public Zatikia sinplifikatu(){
        int[] faktGoi = Zatikia.faktorizatu(this.getZenbakitzailea());
        int[] faktBehe = Zatikia.faktorizatu(this.getIzendatzailea());

        for(int i = 0; i < faktGoi.length; i++){
            for(int a = 0; a < faktBehe.length; a++){
                if(faktGoi[i] == faktBehe[a]){
                    faktBehe[a] = 1;
                    faktGoi[i] = 1;
                    break;
                }
            }
        }
        Zatikia emaitza;
        int totala = 1;
        emaitza = new Zatikia(1, 1);

        for (int i = 0; i < faktGoi.length; i++) {
            totala *= faktGoi[i];
        }
        emaitza.setZenbakitzailea(totala);

        totala = 1;

        for (int i = 0; i < faktBehe.length; i++) {
            totala *= faktBehe[i];
        }
        emaitza.setIzendatzailea(totala);

        return emaitza;
    }
}
