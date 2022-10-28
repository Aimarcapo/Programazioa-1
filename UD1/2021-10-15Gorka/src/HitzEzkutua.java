import java.util.Scanner;

public class HitzEzkutua {
    public static void main(String[] args) {
        String hitza = "udazkena";
        char hizkia;
        int x = 0;
        
        Scanner in = new Scanner(System.in);

        do{
            System.out.print("Sartu karaktere bat: ");
            hizkia = in.next().charAt(0);

            for(int i = 0; i < hitza.length(); i++){
                if(hizkia == hitza.charAt(i)){
                    System.out.print(hizkia);
                    x++;
                }else{
                    System.out.print("-");
                }
            }
            System.out.println("");
        } while(x < hitza.length());

        in.close();

    }
}
