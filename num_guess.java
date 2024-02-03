
import java.util.Random;
import java.util.Scanner;

public class num_guess 
{
    private static final int MIN_RANGE=1;
    private static final int MAX_RANGE=200;
    private static final int MAX_ATTEMPTS = 10;
    private static final int MAX_ROUNDS = 2;

    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;

        System.out.println("Number Guessing Game");
        System.out.println("Total Number of Rounds:");
        System.out.println("Attempts that helps to guess number: 2");
        for(int i=1;i <=  MAX_ROUNDS;i++)
        {
              int number = random.nextInt(MAX_RANGE)+MIN_RANGE;
              int Attempts = 0;

              System.out.printf("\nRound %d: Guess the number Between %d and %d in %d attempts. \n",i,MIN_RANGE,
              MAX_RANGE,MAX_ATTEMPTS);

              while (Attempts < MAX_ATTEMPTS) 
              {
                  System.out.println("Enter your guess:");
                  int guess_num = scanner.nextInt();
                  Attempts = Attempts + 1;

                  if(guess_num == number)
                  {
                      int score = MAX_ATTEMPTS - Attempts;
                      totalScore = totalScore + score;
                      System.out.printf("Congratulations..! Number Guessed Successfully..Attempts = %d, Score= %d\n",Attempts,score);
                      break;
                  }

                  else if(guess_num < number)
                  {
                    System.out.printf("The number is greater than %d. Attempts Left=%d.\n",guess_num,MAX_ATTEMPTS-Attempts);
                  }

                  else if(guess_num > number)
                  {
                    System.out.printf("Number is less than %d. Attempts Left=%d.\n",guess_num,MAX_ATTEMPTS-Attempts);
                  }
              }

              if(Attempts == MAX_ATTEMPTS)
              {
                      System.out.printf("Round= %d\n",i);
                      System.out.println("Attempts = 0");
                      System.out.printf("The Random Number is: %d\n\n",number);
              }
        }
        System.out.printf("Game Over. Total Score = %d\n",totalScore);
        scanner.close();
    }
}