package basics;
public class CheckOddEven {
    public static void main(String[] args) {
        
        //ALDAGAIA DEFINITU
        int number = -2; 

        //DESBERDINDU PAR-IMPAR
        System.out.println("The number is " + number);
        if (number % 2 == 0) { //NUMBER / 2-REN ONDARRA = NUMBER % 2
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        System.out.println("Bye!");
    }
}
