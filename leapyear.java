import java.util.Scanner;

class leap {
  public static void main(String args[]) {
    int year;
    Scanner sc = new Scanner(System.in);
    year = sc.nextInt();
    if (year % 400 == 0) {
      System.out.println("It is leap year");
    } else if (year % 4 == 0) {
      System.out.println("It is a leap year");
    } else {
      System.out.println("It is not a leap year");
    }
  }

}
