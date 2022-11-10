public class Circle {
   //ALDAGAI PRIBATUAK SORTU
   private double radius;
   private String color;

   //KONSTRUKTOREAK
   //SORTU KONSTRUKTOR BAT DEFAULTEKO BALOREEKIN
   public Circle() {                 // 1st Constructor
      radius = 1.0;
      color = "red";
   }
   //KONSTRUKTORE BAT R JAKINDA, ETA DEFAULTEKO KOLOREA ERABILIZ
   public Circle(double r) {           // 2nd Constructor
      radius = r;
      color = "red";
   }
   //KONSTRUKTORE BAT, R ETA C JAKINDA
   public Circle(double r, String c) { // 3rd Constructor
      radius = r;
      color = c;
   }

   //METODO PUBLIKOAK
   // /** MOTA HONETAKO NOTAK, JAVA.DOC DEITZEN DIRA, ETA AZALPEN BEZALA AGERTZEN DA METODOREN BAT APLIKATZERAKO ORDUAN. */

   //RADIOA BUELTATZEKO. getter METODO PUBLIKO BAT, ZIRKULU BATEN ERRADIOA ERAKUTSI AHAL IZATEKO.
   public double getRadius() { 
      return radius;
   }

   //KOLOREA BUELTATZEKO. getter METODO PUBLIKO BAT, ZIRKULU BATEN KOLOREA ERAKUTSI AHAL IZATEKO.
   public String getColor() {  
      return color;
   }

   //AREA BUELTATZEKO. getter METODO PUBLIKO BAT, ZIRKULU BATEN AREA ERAKUTSI AHAL IZATEKO.
   public double getArea() {
      return radius * radius * Math.PI;
   }

   //ZIRKULU BATEN ATRIBUTOAK STRING BEZALA BISTARATU AHAL IZATEKO.
   public String toString() {
      return "Circle[Radius=" + radius + ", Color=" + color + "]";
   }

   // Setter MOTATAKO METODOA, ZIRKULU BATEN EZARRITUTAKO KOLOREA ALDATZEKO.
   public void setColor(String newColor) {
      color = newColor;
   }
   
   // Setter MOTATAKO METODOA, ZIRKULU BATEN EZARRITUTAKO ERRADIOA ALDATZEKO.
   public void setRadius(double newRadius) {
      radius = newRadius;
   }
}
