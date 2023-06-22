import java.util.Scanner;

class valid {
  public static void main(String args[]) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number :");
    num = sc.nextInt();
    if (num > 0) {
      System.out.println("Is valid number :" + num);
    } else {
      System.out.println("Is not valid number :" + num);
    }
  }
}