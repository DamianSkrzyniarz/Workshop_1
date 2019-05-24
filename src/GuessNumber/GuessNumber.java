package GuessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Random rand = new Random();
        int correctGuess = rand.nextInt(100)+1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Zgadnij licze");
        int counter = 0;
        while(true){
            while(!scan.hasNextInt()){
                System.out.println("To nie jest liczba");
                scan.nextLine();
            }
            counter ++;
            int guess = scan.nextInt();
            if (guess > correctGuess){
                System.out.println("Za duzo.");
            }else if (guess < correctGuess){
                System.out.println("Za malo.");
            }else{
                System.out.println("Brawo! To wlasciwa liczba. Udalo Ci sie za " + counter + " razem.");
                break;
            }
        }

    }
}
