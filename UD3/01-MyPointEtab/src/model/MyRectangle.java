package model;

public class MyRectangle {
    //ALDAGAIAK
    private MyPoint topLeft;
    private MyPoint bottomRight;

    //KONSTRUKTOREAK
    public MyRectangle(MyPoint topLeft, MyPoint bottomRPoint){
        this.topLeft = topLeft;
        this.bottomRight = bottomRPoint;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "MyRectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }

    //GETTER-AK
    public MyPoint getTopLeft() {
        return topLeft;
    }
    public MyPoint getBottomRight() {
        return bottomRight;
    }
    public double getPerimetroa(){
        double perimetroa = 0;
        MyPoint topRight = new MyPoint(this.bottomRight.getX(), this.topLeft.getY());
        perimetroa +=  this.topLeft.distance(topRight) * 2;
        perimetroa +=  this.bottomRight.distance(topRight) * 2;
        return perimetroa;
    }
    public double getAzalera(){
        double azalera = 0;
        MyPoint topRight = new MyPoint(this.bottomRight.getX(), this.topLeft.getY());
        azalera = (this.topLeft.distance(topRight) * this.bottomRight.distance(topRight));
        return azalera;
    }

    //SETTER-AK
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }  
    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

}
