import java.util.Scanner;

public class DeliMarket {
    static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Link's Weapon Shop!");
        System.out.println("------------------------------");
        System.out.println();

        System.out.println("What Weapon would you like to buy?");
        System.out.println("1. Master Sword - $20");
        System.out.println("2. Lightscale Tridant - $10");
        System.out.println("3. Fierce Deity Sword - $15");
        System.out.println();

        System.out.print("Please enter the number of the item you would like: ");
        int choice = kb.nextInt();
        System.out.println();

        System.out.print("How many would you like: ");
        double pounds = kb.nextDouble();

        double totalCost = 0;

        if(choice == 1){
            totalCost += (20 * pounds);
        }
        else if(choice == 2){
            totalCost += (10 * pounds);
        }
        else if(choice == 3){
            totalCost += (15 * pounds);
        }
        else{
            System.out.println("That is not an option. Please choose a number between 1 and 3");
        }

        System.out.print("Would you like to buy more (yes or no): ");
        String answer = kb.next();

        while(answer.equalsIgnoreCase("yes")){
        System.out.println("What Weapon would you like to buy?");
        System.out.println("1. Master Sword - $20");
        System.out.println("2. Lightscale Tridant - $10");
        System.out.println("3. Fierce Deity Sword - $15");
        System.out.println();

        System.out.print("Please enter the number of the item you would like: ");
        choice = kb.nextInt();
        System.out.println();

        System.out.print("How many would you like: ");
        pounds = kb.nextDouble();

        if(choice == 1){
            totalCost += (20 * pounds);
        }
        else if(choice == 2){
            totalCost += (10 * pounds);
        }
        else if(choice == 3){
            totalCost += (15 * pounds);
        }
        else{
            System.out.println("That is not an option. Please choose a number between 1 and 3");
        }
        System.out.print("Would you like to buy more (yes or no): ");
        answer = kb.next();

        }

        System.out.println("Thank You for your purchase");
        System.out.println("Your total cost is " + totalCost);
    }
}
