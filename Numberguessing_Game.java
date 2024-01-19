import java.util.Scanner;

class rangen{
    public int genrate(int max,int min){
        return (int) (Math.random()*(max - min + 1) + min);
    }
}

public class Numberguessing_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rangen rg = new rangen();
        int totalAttempts = 0;
        int win = 0;
        System.out.println( "\nHello !! Let's go\n");
        System.out.println("Task:01 Number Guessing Game\n");
        System.out.println("Let's start the game....\n");
        while (true) {
            System.out.println("Enter the maximum number");
            int max = sc.nextInt();
            System.out.println("\nEnter the minimum number");
            int min = sc.nextInt();
            sc.nextLine();

            int cnum = rg.genrate(max, min);
            int attempts = 0;

            while (true) {
                System.out.println("/nGuess a number between "+max+" and "+min+"\n");
                int gnum = sc.nextInt();
                attempts++;

                if (gnum > cnum) {
                    System.out.println("Its Greater\n");
                } else if (gnum < cnum){
                    System.out.println("Its Lower\n");
                }else{
                    System.out.println("Correct Guess\n");
                    win++;
                    break;
                }
            }
            totalAttempts += attempts;
            System.out.println("\nAttempts = " + attempts);
            System.out.println("\nWins = " + win);

            double winrate = (double) win / totalAttempts*100;
            System.out.printf("/nYour winrate is %.2f%%\n",winrate);

            System.out.println("\nDo you want to play again (yes/no)");
            String playAgain = sc.next();
            if(!playAgain.equalsIgnoreCase("yes")){
                sc.close();
                System.exit(0);
            }
            System.out.println("\nThank you :)\n\n");
            sc.nextLine();
        }
    }
}