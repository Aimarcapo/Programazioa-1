package tests;

import model.MyPoint;

public class TestMyPoint {
    public static void main(String[] args) {
        //ESKATUTAKO 3 PUNTUAK SORTU
        MyPoint p0 = new MyPoint();
        MyPoint p1 = new MyPoint(2, 1);
        MyPoint p2 = new MyPoint(4, 0);
        System.out.println("a) Hiru puntu sortu:");
        System.out.println("p0 => " + p0);
        System.out.println("p1 => " + p1);
        System.out.println("p2 => " + p2);
    }   
}
