import java.util.Scanner;

class divisible {
  public static void main(String args[]) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    num = sc.nextInt();

    if (num % 5 == 0 && num % 11 == 0) {
      System.out.println("is divisible by number: " + num);
    } else {
      System.out.println("is not divisble by 5 and 11 " + num);
    }
  }
}