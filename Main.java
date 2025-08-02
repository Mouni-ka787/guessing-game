 import java.util.*;
 import java.util.Random;
 class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String play = "yes";
        int guess = -1;
        int tries = 0;

        while (play.equals("yes")) {
            Random redm = new Random();
            int readredm = redm.nextInt(100);
            
            while(guess != readredm){
                System.out.print(" Guess  a number between 1 to 100:" );
                guess = sc.nextInt();
                tries++;

                if(guess == readredm){
                    System.out.println("Awesome u gussed then crct number");
                    System.out.println("the number you gussed it took "+ tries+" guesses!");
                    System.out.println("Do  You want to play again? yes or no:");
                    play = sc.next().toLowerCase();
                }
                if( guess > readredm){
                    System.out.println("Your guess number is too high ,  try again.");
                }else{
                    System.out.println("Your guess number is too low, try again.. ");
                }
            }

            
        }
         
      sc.close();

    }
 }