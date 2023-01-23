package exekutagarriak;

import model.MyPoint;

public class MyTriangle {
    //ALDAGAIAK EZARRI
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    //KONSTRUKTOREAK
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "MyTriangle [v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
    }

    //GETTER
    public MyPoint getV1() {
        return v1;
    }
    public MyPoint getV2() {
        return v2;
    }
    
    public MyPoint getV3() {
        return v3;
    }
    public double getPerimeter(){
        double perimeter = 0;
        perimeter += this.v1.distance(v2);
        perimeter += this.v2.distance(v3);
        perimeter += this.v3.distance(v1);
        return perimeter;
    }
    public String getType(){
        if(((this.v1.distance(v2)) == this.v2.distance(v3)) && ((this.v2.distance(v3)) == this.v3.distance(v1))){
            return "Aldekidea";
        } else if(((this.v1.distance(v2)) == this.v2.distance(v3)) || ((this.v2.distance(v3)) == this.v3.distance(v1)) || ((this.v1.distance(v2)) == this.v3.distance(v1))){
            return "Isoszelea";
        } else {
            return "Eskalenoa";
        }
    }

    //SETTER
    public void setV1(MyPoint v1) {
        this.v1 = v1;
    }    
    public void setV2(MyPoint v2) {
        this.v2 = v2;
    }
    public void setV3(MyPoint v3) {
        this.v3 = v3;
    }
    

}
