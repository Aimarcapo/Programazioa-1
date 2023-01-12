package model;

public class MyPoint {
    //ALDAGAI PRIBATUAK SORTU
    private int x;
    private int y;

    //KONSTRUKTOREAK
    public MyPoint(){
        x = 0;
        y = 0;
    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    //GETTERS
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int[] getXY(){
        int [] XY;
        XY = new int[2];
        XY[0] = x;
        XY[1] = y;
        return XY;
    }

    //SETTERS
    
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    //TOSTRING
    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    //DISTANTZIA KALKULATZEKO METODOAK
    public double distance(){
        /*Distantzia koordenatu jatorrira (0, 0) */
        double distantzia;
        distantzia = Math.sqrt((Math.pow(this.x, 2))+(Math.pow(this.y, 2)));
        return distantzia;
    }
    public double distance(MyPoint another){
        MyPoint distTotal = new MyPoint();
        distTotal.setX(this.x - another.x);
        distTotal.setX(this.y - another.y);
        
        double distantzia;
        distantzia = Math.sqrt((Math.pow(distTotal.x, 2)) + (Math.pow(distTotal.y, 2)));

        return distantzia;
    }
    public double distance(int x, int y){
        MyPoint distTotal = new MyPoint();
        distTotal.setX(this.x - x);
        distTotal.setX(this.y - y);
        
        double distantzia;
        distantzia = Math.sqrt((Math.pow(distTotal.x, 2)) + (Math.pow(distTotal.y, 2)));

        return distantzia;
    }
}
