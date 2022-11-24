public class TestZatikia {
    public static void main(String[] args) {
        Zatikia zat1 = new Zatikia(5, 10);
        Zatikia zat2 = new Zatikia();

        /*GETTER */
        System.out.println("Zenbakitzailea 1: " + zat1.getZenbakitzailea());
        System.out.println("Izendatzailea 1: " + zat1.getIzendatzailea());

        System.out.println("Zenbakitzailea 2: " + zat2.getZenbakitzailea());
        System.out.println("Izendatzailea 2: " + zat2.getIzendatzailea());

        System.out.println("");

        /*SETTER */
        System.out.println("Setterak erabili ondoren: ");
        zat1.setZenbakitzailea(10);
        zat1.setIzendatzailea(20);

        zat2.setZenbakitzailea(5);
        zat2.setIzendatzailea(10);

        /*STRING */
        System.out.println(zat1);

        System.out.println(zat2);

        System.out.println("");

        /*BESTELAKO METODOAK */
        System.out.println("Biderketa: " + Zatikia.biderkatu(zat1, zat2));
        System.out.println("Batuketa return-ekin: " + Zatikia.batu(zat1, zat2));
        zat1.batu(zat2);
        System.out.println("Batuketa void metodoarekin: " + zat1);
        System.out.println("zat1 ALDATUTA gehiketara");
        System.out.println("Hamartar baliokidea: " + zat1.hamartarBaliokidea());
        zat1.sinplifikatu();
        System.out.println("Sinplifikatuta: " + zat1);

    }
}
