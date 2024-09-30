public class ifStatements {
  public static void main(String[] args) {
    System.out.println("Problem 5");
    int number = 2600;
    if (number < 10) {
      System.out.println("ONE DIGIT");
    } else if (number >= 100 && number < 1000) {
      System.out.println("THREE DIGITS");
    } else if (number >= 1000) {
      System.out.println("FOUR DIGITS");
    } else {
      System.out.println("TWO DIGITS");
    }
  }
}