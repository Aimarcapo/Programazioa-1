package model;

import java.util.ArrayList;

public class Selekzioa {
    public static int azkenId = 0; //Erabili den azken identifikadorea
    public static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<>();

    public static void futbolariBat(){
        //Falta da id automatikoa ezartzea
        Futbolista Asier = new Futbolista(++azkenId, "Asier", "Villalibre", 23, 11, Demarkazioa.DEL);
        System.out.println("Asierren erregistroa sortu da:");
        System.out.println(Asier);
        System.out.println("...\nEntrenar metodoa erabili ondoren: ");
        Asier.entrenar();        
    }
    
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
