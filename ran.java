import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Welcome to the Guess Number Game...");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+-+");

        Random random = new Random();
        boolean playAgain = true;
        while (playAgain){
            int randomNumber  = random.nextInt(100) + 1;
           
            int attempts = 0;
            boolean guessCorrectly  = false;
            int maxAttempt = 5;
            while((!guessCorrectly) && (attempts < maxAttempt)){
                attempts++;
                System.out.print("Enter the guess number :" );
                int guessNumber = sc.nextInt();
                if(randomNumber ==  guessNumber){
                    System.out.printf("Congratulations! You guessed the number %d correctly in %d attempts!\n", randomNumber,attempts);
                    guessCorrectly = true;
                }
                else if(guessNumber < randomNumber){
                    System.out.println("The Guess is low.  Try Again");
                }
                else if(guessNumber > randomNumber){
                    System.out.println("The Guess is high.  Try Again");
                }
                

            }

            if(!guessCorrectly){
                System.out.printf("Sorry, The attempts is Over The correct number is %d\n",randomNumber );
                sc.nextLine();
            }

            System.out.print("DO you want to play again :  Say Yes/ No :  ");
            String play_again_input =  sc.next();
            if(play_again_input.equals("Yes")){
                playAgain = true;
            }
            else{
                playAgain = false;
                System.out.println("The Game Ends: THank you for playing!!");
            }

        }

    }
}

