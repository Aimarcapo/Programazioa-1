public class CylinderComputation {
    public static void main(String[] args) {
        double surface_area, base_area, volume, radius, height;

        radius = 10;
        height = 5;

        base_area = Math.PI * radius * radius;
        surface_area = 2.0 * Math.PI * radius + 2.0 * base_area;
        volume = base_area * height;

        System.out.println("The base area of the cylinder is: " + base_area);
        System.out.println("The suraface area of the cylindder is: " + surface_area);
        System.out.println("The volume of the cylinder is: " + volume);
    }    
}
