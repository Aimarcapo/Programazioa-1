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
    /**Metodo honek, bi zenbakien mkt ateratzen du */
    public static int mkt(int n1, int n2){
        
        return mkt;
    }  
    /**Metodo honek, bi zenbakien zkh ateratzen du */
    public static int zkh(int n1, int n2){
        
        return zkh;
    }    
    /**Metodo honek, zatiki bat ahalik eta gehien sinplifikatzen du */
    public void sinplifikatu(){
        int txikiena;

        if((this.getZenbakitzailea()) > (this.getIzendatzailea())){
            txikiena = this.getIzendatzailea();
        } else {
            txikiena = this.getZenbakitzailea();
        }
        System.out.println(txikiena);
        for (int i = 2; i <= txikiena; i++) {
            if(this.getZenbakitzailea() % i == 0 && this.getIzendatzailea() % i !=0){
                this.setIzendatzailea(this.getIzendatzailea() / i);
                this.setZenbakitzailea(this.getZenbakitzailea() / i);
            }
        }
    }
}
