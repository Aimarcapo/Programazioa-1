package exekutagarriak;

import java.util.ArrayList;

import model.Demarkazioa;
import model.Entrenador;
import model.Futbolista;
import model.IntegranteSeleccion;
import model.Masajista;

/** Programa honetan Euskal Selekzioko datuekin egingo dugu lan.
 *  Iturria: https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
 */
public class EuskalSelekzioa {
    
    public static int azkenId = 0; //Erabili den azken identifikadorea
    public static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<>();
    
    /** Programa honek metodo desberdinei deituko die banan banan. 
     *  Beharbada ez diozu koherentzia handirik topatuko programa osoari. 
     *  Ariketaren helburua da beste pakete bateko klase hierarkia erabiltzen trebatzea. 
     */
    public static void main(String[] args) {
        
        futbolariBat();
        System.out.println("\n\n");
        bestePartaideBatzukSortu();
        System.out.println("\n\n");
        selekzioOsoaSortu();
        int ezabatzekoIda = 4;
        if (partaideaEzabatu(ezabatzekoIda)){
            System.out.println(ezabatzekoIda + " id-a duen partaidea ezabatu da.");
        }
    }
    
    
    /** Metodo honek "Asier Villalibre"ri dagokion Futbolista objektua sortu eta formatu honetan inprimatzen du:    
     *  "Futbolista{id=1, nombre=Asier, apellidos=Villalibre, edad=23, dorsal=11, demarcacion=DEL}"
     *  Hori lortzeko Futbolista klasean toString() metodoa birdefinitu beharko duzu.
     *  Gainera, Web orrian id-rik ez dagoenez, automatikoki kalkulatzea erabaki dugu. 
     *  Horretarako, kontadore bat (Adibidez, azkenIda izeneko klase atributu bat) erabili dezakezu 
     *  partaide bat sortzen den bakoitzean handituko dena. 
     *  Amaitzeko, Villalibre entrenatzen hasiko da.
    */
    public static void futbolariBat(){
        //Falta da id automatikoa ezartzea
        Futbolista Asier = new Futbolista(++azkenId, "Asier", "Villalibre", 23, 11, Demarkazioa.DEL);
        System.out.println("Asierren erregistroa sortu da:");
        System.out.println(Asier);
        System.out.println("...\nEntrenar metodoa erabili ondoren: ");
        Asier.entrenar();        
    }
    
    /** Metodo honek hiru objektu berri sortuko ditu. Pertsona hauei dagokienak: 
     * - Javier Clemente
     * - Iñaki Sertxiberrieta
     * - Ander Etxeburu
     * Zein klaseko objektua izan behar du bakoitzak?
     * 
     * Objektu bakoitza sortu ondoren, bere datuak inprimatu eta kontzentratu eta bidaiatuko dute
     */
    public static void bestePartaideBatzukSortu(){
        Entrenador Clemente = new Entrenador(++azkenId, "Javier", "Clemente", 45, "a00");
        Masajista Sertxiberrieta = new Masajista(++azkenId, "Iñaki", "Sertxiberrieta", 35, "Bai", 5);
        IntegranteSeleccion Etxeburu = new IntegranteSeleccion(++azkenId, "Ander", "Etxeburu", 25);
        System.out.println("Entrenatzailea:");
        System.out.println("\t" + Clemente);
        Clemente.concentrarse();
        Clemente.viajar();
        System.out.println("Masajista:");
        System.out.println("\t" + Sertxiberrieta);
        Sertxiberrieta.concentrarse();
        Sertxiberrieta.viajar();
        System.out.println("Integrante:");
        System.out.println("\t" + Etxeburu);
        Etxeburu.concentrarse();
        Etxeburu.viajar();
    }
    
    
    /** Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion klaseko 
     * ArrayList estatiko baten.
     *  
     */
    public static void selekzioOsoaSortu(){
        
        selekzioa.add(new Futbolista(++azkenId, "Aitor", "Fernández", 31, 1, Demarkazioa.POR));
        selekzioa.add(new Futbolista(++azkenId, "Unai", "Bustinza", 30, 2, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Mikel", "Balenziaga", 34, 3, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Asier", "Illarramendi", 32, 4, Demarkazioa.MED));
        selekzioa.add(new Futbolista(++azkenId, "Iñigo", "MArtínez", 31, 5, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Mikel", "San José", 33, 6, Demarkazioa.MED));
        selekzioa.add(new Futbolista(++azkenId, "Gaizka", "Larrazabal", 25, 7, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Manu", "García", 36, 8, Demarkazioa.MED));
        selekzioa.add(new Futbolista(++azkenId, "Aritz", "Aduriz", 41, 9, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(++azkenId, "Javier", "Eraso", 32, 10, Demarkazioa.MED));
        selekzioa.add(new Futbolista(++azkenId, "Asier", "Villalibre", 25, 11, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(++azkenId, "Aihen", "Muñoz", 25, 12, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Iago", "Herrerín", 35, 13, Demarkazioa.POR));
        selekzioa.add(new Futbolista(++azkenId, "Aritz", "Elustondo", 28, 14, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Jesús", "Areso", 23, 15, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Íñigo", "Vicente", 25, 16, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(++azkenId, "Daniel", "Vivian", 23, 17, Demarkazioa.DEF));
        
        selekzioa.add(new Entrenador(++azkenId, "Javier", "Clemente", 0, "F1"));
        selekzioa.add(new Entrenador(++azkenId,"Joseba","Núñez",0,"F2"));
        selekzioa.add(new Entrenador(++azkenId,"Markel","Lautadahandi",0,"F3"));
    
        selekzioa.add(new Masajista(++azkenId,"Iñaki","Sertxiberrieta",0,"Fisioterapeuta",0));
    
        selekzioa.add(new IntegranteSeleccion(++azkenId,"Ander","Etxeburu",0));
    }
    
    /** ArrayListetik objektu bat ezabatzen du. Aurkitzen ez badu false itzuliko du
     * 
     * @param id Ezabatu nahi den partaidearen ida
     * @return 
     */
    public static boolean partaideaEzabatu(int id){
        for (int i = 0; i < selekzioa.size(); i++) {
            if(selekzioa.get(i).getId() == id){
                selekzioa.remove(i);
                return true;
            }            
        }
        return false;
    }
}
