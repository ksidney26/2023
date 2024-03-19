import java.util.*;
import java.util.Scanner;
public class Lab12 {
    public static void main(String[] args) {

// Dice roll

        Random r = new Random();
        int roll1 = r.nextInt(6) + 1;
        int roll2 = r.nextInt(6) + 1;
        int sum = roll1 + roll2;
        System.out.println("This program simulates rolling a pair of dice");
        System.out.println("The first die shows " + roll1);
        System.out.println("The second die shows " + roll2);
        System.out.println("The total of both dies is " + sum);

// Counting change

        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will help you add up the total of your change");
        System.out.println("Enter the number of quarters you have... ");
        int quarters = scanner.nextInt();

        System.out.println("Enter the number of dimes... ");
        int dimes = scanner.nextInt();

        System.out.println("Enter the number of nickels... ");
        int nickels = scanner.nextInt();

        System.out.println("Enter the number of pennies... ");
        int pennies = scanner.nextInt();

        int total = quarters * 25 + dimes * 10 + nickels * 5 + pennies;
        double sumOfChange = total / 100.0;

        System.out.println("You have $" + sumOfChange);

// Snake eyes simulation
        int numRolls = 0;
        do {
            roll1 = r.nextInt(6) + 1;
            roll2 = r.nextInt(6) + 1;
            numRolls++;
        } while (roll1 != 1 || roll2 != 1);

        System.out.println("Number of rolls to get snake eyes: " + numRolls);
    }
}