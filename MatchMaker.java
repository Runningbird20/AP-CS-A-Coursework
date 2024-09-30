import java.util.Scanner;

public class MatchMaker {
    static Scanner kb = new Scanner (System.in);

    public static void main(String[] args) {
        int counter1 = 0;
        int counter2 = 0;
        int loveNumber = 0;

        System.out.print("Please Enter Name 1: ");
        String name1 = kb.next();
        System.out.print("Please Enter Name 2: ");
        String name2 = kb.next();

        for(int i = 0; i < name1.length();i++){
            if(name1.charAt(i) == 'L' || name1.charAt(i) == 'l'){
                counter1++;
            }
            if(name1.charAt(i) == 'O' || name1.charAt(i) == 'o'){
                counter1++;
            }
            if(name1.charAt(i) == 'V' || name1.charAt(i) == 'v'){
                counter1++;
            }
            if(name1.charAt(i) == 'E' || name1.charAt(i) == 'e'){
                counter1++;
            }
        }
        for(int i = 0; i < name2.length();i++){
            if(name2.charAt(i) == 'L' || name2.charAt(i) == 'l'){
                counter1++;
            }
            if(name2.charAt(i) == 'O' || name2.charAt(i) == 'o'){
                counter1++;
            }
            if(name2.charAt(i) == 'V' || name2.charAt(i) == 'v'){
                counter1++;
            }
            if(name2.charAt(i) == 'E' || name2.charAt(i) == 'e'){
                counter1++;
            }
        }

        loveNumber = counter1 + counter2;

        if(loveNumber % 2 == 1){
            System.out.println("They fall madly in love with each other.");
        }
        else{
            System.out.println("They are destined for divorce!");
        }
    }
}
