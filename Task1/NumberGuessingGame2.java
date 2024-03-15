import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rangeStart,rangeEnd,targetNumber,guess,attempts=0;

        System.out.println("Welcome to Number Guessing Game!!!");

        while(true){
            System.out.println("\n \n1.Guess the Number");
            System.out.println("2.Scoreboard");
            System.out.println("3.Exit");

            System.out.print("\n Enter your choice: ");
            int option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.print("\nEnter the start of the range: ");
                    rangeStart = scanner.nextInt();
                    System.out.print("\nEnter the end of the range: ");
                    rangeEnd = scanner.nextInt();
                    targetNumber = random.nextInt(rangeEnd - rangeStart + 1) + rangeStart;
                    attempts = 0;
                    System.out.println("Range set successfully! You can start now guessing");
                    while (true){
                        System.out.print("Enter your guess (between " + rangeStart +" and " + rangeEnd +"): ");
                        guess = scanner.nextInt();
                        attempts++;

                        if(guess < targetNumber) {
                            System.out.println("Too low! Try again");
                        }else if(guess > targetNumber){
                            System.out.println("Too High! Try Again");
                        }
                        else {
                            System.out.print("Congratulations you guessed the correct number in " + attempts + " Attempts");
                            break;
                        }
                    }
                    break;

                case 2:
                    if(attempts == 0) {
                        System.out.print("No scoreboard to display. Please play game first");
                    }else {
                        System.out.print("Scoreboard : ");
                        System.out.print("\nAttempts : " + attempts );
                    }
                    break;

                case 3:
                    System.out.println("Exiting the game. Thanks for playing!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.print("\n Invalid choice!!! Try Again");
            }
        }
    }
}