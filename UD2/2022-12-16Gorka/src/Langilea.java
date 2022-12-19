
import java.util.ArrayList;

public class Langilea {

    private String izena;
    private String abizena;
    private String emaila;
    private double soldata;

    /**
     * Konstruktore honek Langilea objetu bat sortuko du jasotako parametroak
     * kontuan izanda.
     */
    public Langilea(String izena, String abizena, String emaila, double soldata) {
        this.izena = izena;
        this.abizena = abizena;
        this.emaila = emaila;
        this.soldata = soldata;
    }

    /**
     * Konstruktore honek automatikoki kalkulatuko du emaila patroi hau jarraituz:
     * abizena.izena@bertsozale.eus
     * email guztiak minuskulaz.
     * Lehenetsitako soldata esleituko zaio gainera langileari; 1200 euroko soldata.
     * 
     * @param izena
     * @param abizena
     */
    public Langilea(String izena, String abizena) {

       //OSATU METODO HAU
        this.izena = izena;
        this.abizena = abizena;
        this.emaila = this.abizena.toLowerCase() + "." + this.izena.toLowerCase() + "@bertsozale.eus";
        this.soldata = 1200;

    }

    public String getIzena() {
        return izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public String getEmaila() {
        return emaila;
    }

    public double getSoldata() {
        return soldata;
    }
    public void setIzena(String izena) {
        this.izena = izena;
    }
    public void setAbizena(String abizena) {
        this.abizena = abizena;
    }
    public void setSoldata(Double soldata) {
        this.soldata = soldata;
    }
    public void setEmaila(String emaila) {
        this.emaila = emaila;
    }

    /**
     * Langilearen soldata aldatzeko erabiliko da metodo hau.
     * Atributoa aldatzeaz gain, soltata berria bueltatuko du metodoak.
     * 
     * @param portzentaia Igoeraren portzentaia. Adibidez,
     *                    10 balioak, %10eko igoera adierazten du
     *                    50 balioa pasa beharko genuke soldataren erdia igo nahiko
     *                    bagenu.
     * @return soldataBerria
     */
    public double soldataIgo(int portzentaia) {
        //OSATU METODO HAU
        this.soldata = this.soldata + (this.soldata*((double)portzentaia/100));
        return this.soldata;
    }

    /**
     * Langilearen datuak String formatuan itzultzen ditu;
     * zehazki, klasearen izenaren ostean eta kortxete artean atributo guztien
     * balioak komaz bananduta.
     * 
     */
    @Override
    public String toString() {
        //OSATU METODO HAU
        return "Langilea [" + this.izena + ", " + this.abizena + ", " + this.emaila + ", " + this.soldata + "]";
    }

    /**
     * EZ IKUTU METODO HAU
     * Metodo honi langileen zerrenda bat behar duenak deituko dio. *
     * 
     * @return Hiru langileren datuak dauzkan arraylista bueltatzen du.
     */
    public static ArrayList<Langilea> getLangileenZerrenda() {
        ArrayList<Langilea> langileak = new ArrayList<>();
        langileak.add(new Langilea("Alaia", "Martin"));
        langileak.add(new Langilea("Nerea", "Ibarzabal"));
        langileak.add(new Langilea("Maialen", "Lujanbio", "lujanbio.maialen@bertsozale.eus", 2000));

        return langileak;
    }

    /**
     * Itxura honetako taula bat inprimatuko du:
     *
     * Langileen Zerrenda (LangileKopurua)
     * ==========================================
     * Lehen langilearen datuak
     * Bigarren langilearen datuak
     * Hirugarren langilearen datuak
     * ...
     * 
     * @param Inprimatu nahi den zerrenda
     */
    public static void langileakInprimatu(ArrayList<Langilea> lk) {
        //OSATU METODO HAU
        System.out.println("Langileen Zerrenda (" + lk.size() + ")");
        System.out.println("==========================================");
        for (int i = 0; i < lk.size(); i++) {
            System.out.println(lk.get(i));
        }
    }

    /**
     * Metodo honek uneko objektuaren emaila egokia den, hau da, zerrendan
     * existitzen den egiaztatzen du.
     * 
     * @param lk Egiaztatu beharreko zerrenda
     * @return Zerrendan email helbide hori dagoeneko baldin badaukagu, false
     *         bueltatzen du
     */

    public boolean emailEgokia(ArrayList<Langilea> lk) {
        //OSATU METODO HAU
        boolean ondo = true;
        for (int i = 0; i < lk.size(); i++) {
            if (lk.get(i).getEmaila() == this.getEmaila()){
                ondo = false;
                break;
            }
        }
        return ondo;
    }

    /** Langile honen email originalari zenbakitxo bat gehitzen dio @ ikurraren aurretik.
     * Adibidez:
     * perez.juan@uni.eus => perez.juan2@uni.eus     
     * 
     */
    public void emailaDoitu() {
        //OSATU METODO HAU
        int arroba = this.getEmaila().indexOf("@");
        String aurrekoa = this.getEmaila().substring(0, arroba);
        String atzekoa = this.getEmaila().substring(arroba, this.getEmaila().length());
        this.setEmaila(aurrekoa + "2" + atzekoa);
    }
}
