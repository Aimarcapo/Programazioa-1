public class TestCircle {
    public static void main(String[] args) {   
        // DEKLARATU ETA ERAIKI OBJEKTUAK
        Circle c1 = new Circle(2.0, "blue");  // Use 3rd constructor
        Circle c2 = new Circle(2.0);  // Use 2nd constructor
        Circle c3 = new Circle();  // Use 1st constructor
        Circle c4 = new Circle(5, "blue"); // Use 3rd constructor

        System.out.println("Zirkulua     Erradioa     Kolorea     Azalera");
        System.out.println("===============================================");
        System.out.println("");

        //IDATZI C1 ZIRKULUAREN DATUEN FILA
        System.out.print("      c1      " + c1.getRadius() + "          " + c1.getColor());
        System.out.printf("        %.2f%n", c1.getArea());
        System.out.println("");

        //IDATZI C2 ZIRKULUAREN DATUEN FILA
        System.out.print("      c2      " + c2.getRadius() + "          " + c2.getColor());
        System.out.printf("         %.2f%n", c2.getArea());
        System.out.println("");

        //IDATZI C3 ZIRKULUAREN DATUEN FILA
        System.out.print("      c3      " + c3.getRadius() + "          " + c3.getColor());
        System.out.printf("         %.2f%n", c3.getArea());
        System.out.println("");

        //IDATZI C4 ZIRKULUAREN DATUEN FILA
        System.out.print("      c4      " + c4.getRadius() + "          " + c4.getColor());
        System.out.printf("        %.2f%n", c4.getArea());
        System.out.println("");


        //toString() METODODA FORGATZEKO:
        System.out.println("toString() metodoa horrela erabili ahal da:");
        System.out.println("    1. " + c1.toString());
        System.out.println("    2. " + c1);
        System.out.println("    3. ... +  " + c1 + " + ...");
        System.out.println("");


        //10 aldiz  c1  handitu => inprimatu. Seigarrenean kolorea aldatu.
        for(int i = 1; i <= 10; i++ ){
            System.out.println(c1);
            if(i==6){
                c1.setColor("magenta");
            }
            c1.setRadius(i+2);
        }
    }
}
