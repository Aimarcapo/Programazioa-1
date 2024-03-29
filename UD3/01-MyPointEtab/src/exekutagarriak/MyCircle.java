package exekutagarriak;

import model.MyPoint;

public class MyCircle {
    //ALDAGAIAK DEKLARATU ETA HASIERATU
    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;

    //KONSTRUKTOREAK
    public MyCircle(){
    }

    public MyCircle(int x, int y, int radius){
        center.setX(x);
        center.setY(y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }

    //GETTERAK
    public double getArea(){
        double area = (Math.PI * radius * radius);
        return area;
    }
    public MyPoint getCenter(){
        return center;
    }
    public void getCenterX(){

    }
    public int[] getCenterXY(){
        int[] XY = new int[2];
        /*int[0] = center.getX();
        int[1] = center.getY();*/

        return XY;
    }
    public double getCircumference(){
        double circumference = (Math.PI * 2 * radius);
        return circumference;
    }
    public int getRadius(){
        return radius;
    }

    //SETTERAK
    public void setCenter(MyPoint center){
        this.center = center;
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }
    public void setCenterY(int y){
        this.center.setX(y);
    }
    public void setCenterXY(int x, int y){
        this.center.setX(x);
        this.center.setX(y);
    }
    public void setRadius(int radius){
        this.radius = radius;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "MyCircle [center=" + center + ", radius=" + radius + "]";
    }

    //BESTELAKOAK
    public double distance(MyCircle another){
        double distantzia;
        distantzia = this.center.distance(another.center);
        return distantzia;
    }

    public boolean isInside(MyPoint puntua){
        boolean barruan;
        if(this.center.distance(puntua)>this.radius){
            barruan = false;
        } else {
            barruan = true;
        }
        return barruan;
    }
}
