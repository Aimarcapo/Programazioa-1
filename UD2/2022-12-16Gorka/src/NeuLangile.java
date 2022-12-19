/** Programa honek zure izen abizenak daramatzan erabiltzailea sortuko du, lehenetsitako email eta soldatarekin.
 * Langilearen datuak kontsolatik bistaratu ondoren.
 * Soldata igo eta berriz inprimatuko du langilearen informazioa.
 */
public class NeuLangile {
    public static void main(String[] args) throws Exception {
        //OSATU METODO HAU
        Langilea neu = new Langilea("Gorka", "Garcia");
        System.out.println("Nire langile datuak igoera aurretik: ");
        System.out.println(neu);
        neu.soldataIgo(50);
        System.out.println("Nire langile datuak igoera ostean: ");
        System.out.println(neu);
    }
}
