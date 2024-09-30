import java.util.Scanner;

public class HotLips {
    static Scanner kb = new Scanner (System.in);

    public static void main(String[] args) {
        int numKisses = 0;
        System.out.println("Welcome to the kissing booth");
        System.out.println("----------------------------");
        System.out.println();

        System.out.print("Would you like to purchase a kiss (yes or no): ");
        String answer = kb.next();

        if(answer.equalsIgnoreCase("yes")){
            numKisses ++;
            System.out.println("KISS: " + numKisses);
            
        }

        while(answer.equalsIgnoreCase("yes")){
            System.out.println("Next Person in line...");
            System.out.println("Next Person walks up...");
            System.out.print("Would you like to purchase a kiss (yes or no): ");
            answer = kb.next();

            numKisses ++;
            System.out.println("KISS: " + numKisses);
            
        }
        System.out.println("The total number of kisses purchased was: " + numKisses);
    }
}
