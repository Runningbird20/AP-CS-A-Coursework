import java.util.Scanner;

public class JumpRopeForHeart {
    static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("What is the jump rope rate: ");
        double rate = kb.nextDouble();

        System.out.print("How many jumps did person 1 make: ");
        double numJumps = kb.nextDouble();

        double totalMoney = rate * numJumps;
        System.out.println("Total Money Raised: $" + totalMoney);

        System.out.print("Another Jumper (yes or no): ");
        String answer = kb.next();

        while(answer.equalsIgnoreCase("yes")){
            System.out.print("What is the jump rope rate: ");
            rate = kb.nextDouble();

            System.out.print("How many jumps did person 1 make: ");
            numJumps = kb.nextDouble();

            totalMoney += (rate * numJumps);

            System.out.print("Another Jumper (yes or no): ");
            answer = kb.next();
        }

        System.out.println("Total Money Raised: $" + totalMoney);
    }
}
