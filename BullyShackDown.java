import java.util.Scanner;

public class BullyShackDown {
    static Scanner kb = new Scanner (System.in);

    public static void main(String[] args){
        double gamePrice = 30.00;

        System.out.println("Benny the bully enters the school.");
        System.out.println("Benny walks down the hall and finds his first victim");
        System.out.println("Benny walks up to a student, grabs him, shakes him a bit, and money falls out.");
        System.out.println("How much money fell out of the student's pocket: ");
        double moneyCollected = kb.nextDouble();
        System.out.println("");

        System.out.println("Benny currently has $" + moneyCollected);
        System.out.println("Benny still needs $" + (gamePrice - moneyCollected) + ".");
        System.out.println();

        while(moneyCollected < gamePrice){
            System.out.println("Benny doesn't have enough money for his game yet!");
            System.out.println("Benny continues down the hall to find his next victim");
            System.out.println("Benny agressively find another student, grabs him, and gives him a little shake.");
            System.out.println("How much money fell out of the student's pocket");
            moneyCollected += kb.nextDouble();

            System.out.println("Benny currently has $" + moneyCollected);
            System.out.println("Benny still needs $" + (gamePrice - moneyCollected) + ".");
            System.out.println();
        }
        System.out.println("Benny currently has looted enough money to get CyberPunk 2077.");
        System.out.println("At 2:00pm today Benny will be on his way to GameStop.");

    }
}
