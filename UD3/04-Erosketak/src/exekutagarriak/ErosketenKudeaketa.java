package exekutagarriak;

import java.util.ArrayList;
import java.util.Scanner;

import model.Bezeroa;
import model.Enpresa;
import model.EpekakoErosketa;
import model.Erosketa;
import model.Pertsona;
import model.Produktua;

public class ErosketenKudeaketa {
    private static Scanner in = new Scanner(System.in);
    private static ArrayList<Erosketa> erosketak = new ArrayList<>();
    public static void main(String[] args) {
        int erantzuna;
        hasierakoErosketakSortu();
        do{
            System.out.println("");

            System.out.println("*************************************************");
            System.out.println("EROSKETEN KUDEAKETA");
            System.out.println("------------------------------------------------");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("20. Irten");
            System.out.println("------------------------------------------------");

            System.out.print("Aukeratu zenbaki bat: ");
            erantzuna = in.nextInt();
            
            System.out.println("");
            switch(erantzuna){
                case 1:
                    create();
                    break;
                case 2:
                    readMenua();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 20:
                    break;
                default:
                    System.out.println("Sartutako erantzuna ez da egokia.");
            }
        }while(erantzuna != 20);

        System.out.println("Eskerrik asko! Agur!");
    }

    public static void hasierakoErosketakSortu(){
        //EROSKETAK SORTU
        //LEHENENGO EROSKETA SORTU
        ArrayList<Produktua> produktuak1 = new ArrayList<>();
        ArrayList<Integer> unitateak1 = new ArrayList<>();
        produktuak1.add(new Produktua("C01", "Toshiba Satellite Pro", 450));
        unitateak1.add(4);
        produktuak1.add(new Produktua("C02", "HP Pavilion", 600));
        unitateak1.add(2);
        produktuak1.add(new Produktua("T01", "Samsung Galaxy", 210));
        unitateak1.add(3);
        erosketak.add(new Erosketa("E18-01", "2018-09-25", new Pertsona(2, "Mirakontxa z/g. DONOSTIA.", "Martin", "Berasategi", "mbera@donostia.eus"), produktuak1, unitateak1, 3630));
        //BIGARREN EROSKETA SORTU
        ArrayList<Produktua> produktuak2 = new ArrayList<>();
        ArrayList<Integer> unitateak2 = new ArrayList<>();
        produktuak2.add(new Produktua("C01", "Toshiba Satellite Pro", 450));
        unitateak2.add(15);
        erosketak.add(new Erosketa("E18-02", "2018-10-24", new Pertsona(1, "Hondartza Pasialekua z/g. ZARAUTZ", "Karlos", "Arguiñano", "kargi@zarautz.eus"), produktuak2, unitateak2, 6750));
        //HIRUGARREN EROSKETA SORTU
        ArrayList<Produktua> produktuak3 = new ArrayList<>();
        ArrayList<Integer> unitateak3 = new ArrayList<>();
        produktuak3.add(new Produktua("C01", "Toshiba Satellite Pro", 450));
        unitateak3.add(1);
        produktuak3.add(new Produktua("T01", "Samsung Galaxy", 210));
        unitateak3.add(1);
        erosketak.add(new Erosketa("E19-01", "2019-01-09", new Pertsona(1, "Hondartza Pasialekua z/g. ZARAUTZ", "Karlos", "Arguiñano", "kargi@zarautz.eus"), produktuak3, unitateak3, 660));
        //LAUGARREN EROSKETA SORTU
        ArrayList<Produktua> produktuak4 = new ArrayList<>();
        ArrayList<Integer> unitateak4 = new ArrayList<>();
        produktuak4.add(new Produktua("C01", "Toshiba Satellite Pro", 450));
        unitateak4.add(3);
        produktuak4.add(new Produktua("C02", "HP Pavilion", 600));
        unitateak4.add(1);
        produktuak4.add(new Produktua("T02", "iPhone XX", 1300));
        unitateak4.add(1);
        erosketak.add(new EpekakoErosketa("E19-02", "2019-02-09", new Pertsona(1, "Hondartza Pasialekua z/g. ZARAUTZ", "Karlos", "Arguiñano", "kargi@zarautz.eus"), produktuak4, unitateak4, 3250, 12, false, 300));
        //BOSTGARREN EROSKETA SORTU
        ArrayList<Produktua> produktuak5 = new ArrayList<>();
        ArrayList<Integer> unitateak5 = new ArrayList<>();
        produktuak5.add(new Produktua("C02", "HP Pavilion", 600));
        unitateak5.add(25);
        String[] kontaktoenEmailak;
        kontaktoenEmailak = new String[2];
        kontaktoenEmailak[0] = "kontakto1@gmail.com";
        kontaktoenEmailak[1] = "kontakto2@gmail.com";
        erosketak.add(new Erosketa("E21-01", "2020-01-17", new Enpresa(3, "Otaola Etorbidea 29. EIBAR.", "Uni Eibar-Ermua", "UNI", kontaktoenEmailak), produktuak5, unitateak5, 15000));
    }
    
    public static void create(){
        //NOTA: STRING BATZUK HARTZERAKOA (HITZ BAT BAINO GEHIAGO IZAN AHAL BADU) SCANNER BERRIA SORTU BEHAR DA, ETA EZIN DA ITXI. GAINERA IN.NEXTLINE ERABILI BEHAR DA IN.NEXT ERABILI BEHARREAN
        //OINARRIZKO ALDAGAIAK SORTU
        String erosketaKodea;
        String data;
        ArrayList<Produktua> produktuak = new ArrayList<>();
        ArrayList<Integer> unitateak = new ArrayList<>();
        char besteProd;
        String bezeroMota;
        Bezeroa bezeroa;
        double guztira;
        char erantzunaMota;
        boolean epekakoa;

        //ALDAGAIAK ESKATU ETA GORDE
        System.out.println("EROSKETA BERRIA");
        System.out.println("------------------------------------------------");
        System.out.print("Sartu erosketa kodea: ");
        erosketaKodea = in.next();
        System.out.print("Sartu erosketaren data (uuuu-hh-ee): ");
        data = in.next();
        System.out.println("Erositako produktua/k:");
        //PRODUKTUAK ARRAYLISTA BETE PRODUKTUAK SORTUZ
        do{
            String produktuKode;
            String produktuIzena;
            double prezioa;

            System.out.print("\tKodea: ");
            produktuKode = in.next();
            Scanner sc = new Scanner(System.in);
            System.out.print("\tIzena: ");
            produktuIzena = sc.nextLine();
            System.out.print("\tPrezioa: ");
            prezioa = in.nextDouble();

            produktuak.add(new Produktua(produktuKode, produktuIzena, prezioa));

            System.out.print("\tBeste produktu bat gorde nahi duzu? (B/E) ");
            besteProd = in.next().charAt(0);
        }while(besteProd != 'E');
        //UNITATEAK ARRAYLISTA BETE
        System.out.println("Erositako produktuen unitateak");
        for (int i = 0; i < produktuak.size(); i++) {
            System.out.print("\t" + (i+1) + ". " + produktuak.get(i).getIzena() + ": ");
            unitateak.add(in.nextInt());
        }
        //BEZEROA GORDE
        //ZEIN BEZERO MOTA DEN JAKIN
        System.out.print("Zein bezero mota da? (Pertsona/Enpresa) ");
        bezeroMota = in.next().toLowerCase();
        //BEZEROAREN PARAMETROAK BETE
        if(bezeroMota.equals("pertsona")){
            //ALDAGAIAK SORTU
            int bezeroKode;
            String helbidea;
            String bezeroIzena;
            String abizena;
            String emaila;

            //ALDAGAIAK ESKATU
            System.out.print("\tKodea: ");
            bezeroKode = in.nextInt();
            Scanner sc1 = new Scanner(System.in);
            System.out.print("\tHelbidea: ");
            helbidea = sc1.nextLine();
            Scanner sc2 = new Scanner(System.in);
            System.out.print("\tIzena: ");
            bezeroIzena = sc2.nextLine();
            Scanner sc3 = new Scanner(System.in);
            System.out.print("\tAbizena: ");
            abizena = sc3.nextLine();
            System.out.print("\tEmaila: ");
            emaila = in.next();

            //BEZEROA SORTU
            bezeroa = new Pertsona(bezeroKode, helbidea, bezeroIzena, abizena, emaila);
        } else if(bezeroMota.equals("enpresa")){
            //ALDAGAIAK SORTU
            int bezeroKode;
            String helbidea;
            String izenJuridikoa;
            String izenKomertziala;
            String[] kontaktoenEmailak;

            //ALDAGAIAK ESKATU
            System.out.print("\tKodea: ");
            bezeroKode = in.nextInt();
            Scanner sc1 = new Scanner(System.in);
            System.out.print("\tHelbidea: ");
            helbidea = sc1.nextLine();
            Scanner sc2 = new Scanner(System.in);
            System.out.print("\tIzen juridikoa: ");
            izenJuridikoa = sc2.nextLine();
            Scanner sc3 = new Scanner(System.in);
            System.out.print("\tIzen komertziala: ");
            izenKomertziala = sc3.nextLine();
            System.out.print("\tKontakturako email kopurua: ");
            kontaktoenEmailak = new String[in.nextInt()];
            for (int i = 0; i < kontaktoenEmailak.length; i++) {
                System.out.print("\t\t" + (i+1) + ". Emaila: ");
                kontaktoenEmailak[i] = in.next();
            }

            //BEZEROA SORTU
            bezeroa = new Enpresa(bezeroKode, helbidea, izenJuridikoa, izenKomertziala, kontaktoenEmailak);
        } else {
            System.out.println("\tSartutako erantzuna ez da egokia.");
            System.out.println("\tNULL balioak jarriko ditugu.");
            bezeroa = new Pertsona(0, null, null, null, null);
        }
        System.out.print("Guztira ordaindu beharrekoa: ");
        guztira = in.nextDouble();
        //EROSKETA MOTA JAKIN
        System.out.print("Epekako erosketa da? (B/E) ");
        erantzunaMota = in.next().charAt(0);
        if(erantzunaMota == 'B'){
            epekakoa = true;
        } else {
            epekakoa = false;
        }
        //EROSKETA SORTU
        if(!epekakoa){
            erosketak.add(new Erosketa(erosketaKodea, data, bezeroa, produktuak, unitateak, guztira));
        } else {
            //EPEKAKO EROSKETA SORTU, BEHAR DIREN DATUAK ESKATUZ
            int epeKop;
            char ordainketaErantzuna;
            boolean ordainketaBukatuta;
            double kuota;

            System.out.print("Epekako erosketaren epe kopurua: ");
            epeKop = in.nextInt();
            System.out.print("Ordainketa bukatuta dago? (B/E) ");
            ordainketaErantzuna = in.next().charAt(0);
            if(ordainketaErantzuna == 'B'){
                ordainketaBukatuta = true;
            } else {
                ordainketaBukatuta = false;
            }
            System.out.print("Epe bakoitzaren kuota: ");
            kuota = in.nextDouble();
            erosketak.add(new EpekakoErosketa(erosketaKodea, data, bezeroa, produktuak, unitateak, guztira, epeKop, ordainketaBukatuta, kuota));
        }
    }

    public static void readMenua(){
        int erantzuna;
        do{
            System.out.println("");

            System.out.println("READ MENUA");
            System.out.println("------------------------------------------------");
            System.out.println("1. Erosketen zerrenda");
            System.out.println("2. Erosketa bilatu");
            System.out.println("3. Fakturazio osoa");
            System.out.println("4. Bezerorik onena");
            System.out.println("5. Helbidea bilatu");
            System.out.println("6. Epekako erosketen txostena");
            System.out.println("20. Menu nagusira itzuli");
            System.out.println("------------------------------------------------");

            System.out.print("Aukeratu zenbaki bat: ");
            erantzuna = in.nextInt();

            System.out.println("");
            switch(erantzuna){
                case 1:
                    erosketenZerrenda();
                    break;
                case 2:
                    erosketaBilatu();
                    break;
                case 3:
                    fakturazioOsoa();
                    break;
                case 4:
                    bezerorikOnena();
                    break;
                case 5:
                    helbideaBilatu();
                    break;
                case 6:
                    epekakoErosketenTxostena();
                    break;
                case 20:
                    break;
                default:
                    System.out.println("Sartutako erantzuna ez da egokia.");
            }
        }while(erantzuna != 20);
    }

    public static void update(){
        //ALDAGAIAK SORTU
        String kodigoa;
        char[] kodea;

        //ALDAGAIAK ESKATU
        System.out.println("EROSKETA BATEN KODIGOA BERRIZTU");
        System.out.println("------------------------------------------------");
        System.out.print("Zein erosketaren kodigoa berriztu nahi duzu, esan orain duen kodigoa:");
        kodigoa = in.next();
        System.out.print("Kodigo berria: ");
        kodea = in.next().toCharArray();

        //ALDAKETA EGIN
        for (int i = 0; i < erosketak.size(); i++) {
            if(erosketak.get(i).getKodea().equals(kodigoa)){
                erosketak.get(i).setKodea(kodea);
            }
        }
    }

    public static void delete(){
        //ALDAGAIAK SORTU
        String kodigoa;
        
        //ALDAGAIAK ESKATU
        System.out.println("EROSKETA BAT EZABATU");
        System.out.println("------------------------------------------------");
        System.out.print("Zein erosketa borratu nahi duzu, esan bere kodigoa:");
        kodigoa = in.next();

        //EROSKETA EZABATU
        for (int i = 0; i < erosketak.size(); i++) {
            if(erosketak.get(i).getKodea().equals(kodigoa)){
                erosketak.remove(i);
            }
        }
    }

    public static void erosketenZerrenda(){
        for (int i = 0; i < erosketak.size(); i++) {
            System.out.println((i+1) + ". " + erosketak.get(i));
            System.out.println("");
        }
    }

    public static void erosketaBilatu(){
        String kodea;

        System.out.print("Esan ikusi nahi duzun erosketaren kodea: ");
        kodea = in.next();

        for (int i = 0; i < erosketak.size(); i++) {
            if(erosketak.get(i).getKodea().equals(kodea)){
                System.out.println(erosketak.get(i).toStringLuzea());
            }
        }
    }

    public static void fakturazioOsoa(){
        double faktOsoa = 0;
        for (int i = 0; i < erosketak.size(); i++) {
            faktOsoa += erosketak.get(i).getGuztira();
        }
        System.out.println("Fakturazio osoa: " + faktOsoa + " EUR");
    }

    public static void bezerorikOnena(){
        Erosketa onena = erosketak.get(0);
        for (int i = 1; i < erosketak.size(); i++) {
            if(erosketak.get(i) != null){
                if(erosketak.get(i).getGuztira() > onena.getGuztira()){
                    onena = erosketak.get(i);
                }
            }
        }

        System.out.println("Bezerorik onena: " + onena.getBezeroa());
    }

    public static void helbideaBilatu(){
        //NOTA: Arguiñano abizenarekin ezin da egin, ñ karakterea desberdin gordetzen duelako, eta ondorioz, ezin du konparaketarik egin.
        String abizena;

        Scanner sc = new Scanner(System.in);
        System.out.print("Esan pertsonaren abizena: ");
        abizena = sc.nextLine();

        for (int i = 0; i < erosketak.size(); i++) {
            if(erosketak.get(i).getBezeroa() instanceof Pertsona){
                if(((Pertsona)erosketak.get(i).getBezeroa()).getAbizena().equals(abizena)){
                    System.out.println(erosketak.get(i).getBezeroa().getIzena() + " -ren helbidea, " + erosketak.get(i).getBezeroa().getHelbidea() + " da.");
                }
            }
        }
    }

    public static void epekakoErosketenTxostena(){
        System.out.println("\nEPEKAKO EROSKETEN TXOSTENA");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n", "Data", "Bezeroa", "Guztira", "Epeak", "Kuota", "Ordaindua");
        System.out.println("------------------------------------------------------------------------------------------------");
        for (int i = 0; i < erosketak.size(); i++) {
            if(erosketak.get(i) instanceof EpekakoErosketa){
                System.out.println(((EpekakoErosketa)erosketak.get(i)).toStringLuzea());
            }
        }
        
    }
}
