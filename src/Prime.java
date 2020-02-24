import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        int userInput;
        int i=2;
        boolean prime = true;
        System.out.println("Pleas type your suspected prime number:");
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextInt();

        while(i<userInput){
            if (userInput % i == 0) {
                prime = false;
                break;
            }
            i++;
        }
        if (prime) {
            System.out.println("The Number " + userInput + " is a prime Number!");
        }
        else{
            System.out.println("The Number " + userInput + " is NOT a prime Number!");
        }

    }
}
