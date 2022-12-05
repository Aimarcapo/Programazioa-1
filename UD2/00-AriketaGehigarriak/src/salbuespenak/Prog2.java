package salbuespenak;

public class Prog2 {
    
    public static void main(String[] args) {
        int[] zenbakiak = {1, 15, 2};
        try {
            System.out.println(zenbakiak[8]);
            System.out.println("Gaur markatze azterketa euki dogu. Oso nekatuta gaude.");
        } catch (Exception ex) {
            System.out.println("Salbuespena gertatu da.");
            System.out.println(ex.getMessage());
            System.out.println(ex.getClass());
        }
    }
}
