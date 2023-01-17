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
        distTotal.setY(this.y - another.y);
        
        double distantzia;
        distantzia = Math.sqrt((Math.pow(distTotal.x, 2)) + (Math.pow(distTotal.y, 2)));

        return distantzia;
    }
    public double distance(int x, int y){
        MyPoint distTotal = new MyPoint();
        distTotal.setX(this.x - x);
        distTotal.setY(this.y - y);
        
        double distantzia;
        distantzia = Math.sqrt((Math.pow(distTotal.x, 2)) + (Math.pow(distTotal.y, 2)));

        return distantzia;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyPoint other = (MyPoint) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }
    
}
