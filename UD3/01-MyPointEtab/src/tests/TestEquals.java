package tests;
import model.MyPoint;

public class TestEquals {
    public static void main(final String[] args) {
        final MyPoint p1 = new MyPoint(7,8);
        final MyPoint p2 = new MyPoint(7,8);

        if (p1.equals(p2)) {
            System.out.println("Espazioko puntu berdina adierazten dute.");
        } else {
            System.out.println("EZ dira berdinak.");
        }
    }
}
