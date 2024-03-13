import java.util.Scanner;
import java.util.Random;

public class guessgame {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int min = 1,max = 100;
        int maxAttempts = 10;
        int score = 0;
          char ch;
          do
          {
             System.out.println("-------------------------------------------------------------------------");
             System.out.println("\t \t \t\4 Number Guessing Game \4");
             System.out.println("-------------------------------------------------------------------------");
            int targetNumber = rand.nextInt(max - min + 1) + min;
            int attempts = 0;

            System.out.println("\nWe are generated a number between " + min + " and " + max +". Please enter number for guess in  " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) 
            {
                System.out.print("Enter your guess: ");
                int no = sc.nextInt();
                attempts++;

                if (no == targetNumber)
                 {
                    System.out.println("Congratulations you win in " + attempts + " attempts.");
                    score++;
                    break;
                 } 
                else if (no < targetNumber)
                 {
                    System.out.println("Too low! Try again.");
                 }
                  else 
                  {
                    System.out.println("Too high! Try again.");
                 }

                if (attempts == maxAttempts) 
                {
                    System.out.println("Sorry,your 10 attempts are complete. The correct number was: " + targetNumber);
                }
            }

            System.out.print("Do you want to play again press (y/Y): ");
             ch=sc.next().charAt(0);    
              
        }while(ch == 'y' || ch == 'Y');

        System.out.println("\n Game over! Your score: " + score);
    }
}