import java.util.Scanner;

public class SpeedDial {
    static Scanner kb = new Scanner (System.in);
    public static void main(String[] args) {
    String name2 = " ", name3 = " ", name4 = " ", name5 = " ", name6 = " ", name7 = " ", name8 = " ", name9 = " ";

        System.out.println("Welcome to the SpeedDial Program.");
        System.out.print("Would you like to program a location (yes or no):");
        String answer = kb.next();
        System.out.println();

        while(answer.equalsIgnoreCase("yes")){
            System.out.print("You can program locations 2 - 9, which location would you like to program: ");
            int location = kb.nextInt();
            System.out.println();

            if(location == 2){
                System.out.println("Great! What contact would you like to store into 2? ");
                name2 = kb.next();
            }
            else if(location == 3){
                System.out.println("Great! What contact would you like to store into 3? ");
                name3 = kb.next();
            }
            else if(location == 4){
                System.out.println("Great! What contact would you like to store into 4? ");
                name4 = kb.next();
            }
            else if(location == 5){
                System.out.println("Great! What contact would you like to store into 5? ");
                name5 = kb.next();
            }
            else if(location == 6){
                System.out.println("Great! What contact would you like to store into 6? ");
                name6 = kb.next();
            }
            else if(location == 7){
                System.out.println("Great! What contact would you like to store into 7? ");
                name7 = kb.next();
            }
            else if(location == 8){
                System.out.println("Great! What contact would you like to store into 8? ");
                name8 = kb.next();
            }
            else if(location == 9){
                System.out.println("Great! What contact would you like to store into 9? ");
                name9 = kb.next();
            }
            else{
                System.out.println("Invalid Location!");
            }
            System.out.print("Would you like to program another location (yes or no): ");
            location = kb.nextInt();
        }
        System.out.print("Would you like to call someone (yes or no): ");
        String choice = kb.next();

        while(choice.equalsIgnoreCase("yes")){
            System.out.print("Which speed dial location do you want to call (2 - 9): ");
            int location = kb.nextInt();

            if(location == 2){
                System.out.println("Calling... " + name2);
            }
            else if(location == 3){
                System.out.println("Calling... " + name3);
            }
            else if(location == 4){
                System.out.println("Calling... " + name4);
            }
            else if(location == 5){
                System.out.println("Calling... " + name5);
            }
            else if(location == 6){
                System.out.println("Calling... " + name6);
            }
            else if(location == 7){
                System.out.println("Calling... " + name7);
            }
            else if(location == 8){
                System.out.println("Calling... " + name8);
            }
            else if(location == 9){
                System.out.println("Calling... " + name9);
            }
            else{
                System.out.println("You have requested an invalid location.");
            }

            System.out.print("Would you like to call someone else (yes or no): ");
            choice = kb.next();
        }
    }
}
    

