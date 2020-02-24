import java.util.Locale;
import java.util.Scanner;

public class RomanNum {
    public static void main(String[] args) {
        int userInput;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please type a number between 1 and 100");
            userInput = scanner.nextInt();
            if (userInput < 0) {
                System.out.println("Please only use positive numbers.");
            } else if (userInput == 0) {
                System.out.println("Fun fact: The Romans had no concept of the number Zero. Their math was based on geometry. So please use a higher number.");
            } else if (userInput > 100) {
                System.out.println("Your number is to high.");
            }

        } while (userInput <= 0 || userInput > 100);

        int C = userInput / 100;
        int X = (userInput - (100 * C)) / 10;
        int I = (userInput - (100 * C) - (10 * X));

        if (C > 0)
            System.out.print("C");
        switch (X) {
            case 9:
                System.out.print("XC");
                break;
            case 8:
                System.out.print("LXXX");
                break;
            case 7:
                System.out.print("LXX");
                break;
            case 6:
                System.out.print("LX");
                break;
            case 5:
                System.out.print("L");
                break;
            case 4:
                System.out.print("XL");
                break;
            case 3:
                System.out.print("XXX");
                break;
            case 2:
                System.out.print("XX");
                break;
            case 1:
                System.out.println("X");
                break;
       }
        switch (I) {
            case 9:
                System.out.print("IX");
                break;
            case 8:
                System.out.print("VIII");
                break;
            case 7:
                System.out.print("VII");
                break;
            case 6:
                System.out.print("VI");
                break;
            case 5:
                System.out.print("V");
                break;
            case 4:
                System.out.print("IV");
                break;
            case 3:
                System.out.print("III");
                break;
            case 2:
                System.out.print("II");
                break;
            case 1:
                System.out.println("I");
                break;
        }


        /*if (X == 9) {                     Mein erster Versuch war mit if und else. Ich lasse die Ruinen mal hier:
            System.out.print("XC");

        }else if(X<9 && X>4) {
            System.out.print("L");
        }else if(X==4) {
            System.out.print("XL");
        }else if (X > 0)
            for (int i = 0; i > X; i++) {
                System.out.print("X");
            }
        if (I == 4) {
            System.out.print("IV");
        } else if (I > 0) {
            for (int i = 0; i > I; i++) {
                System.out.print("I");*/
            }
        }
