import java.util.Scanner;

class table {
  public static void main(String args[]) {
    int num, i;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number :");
    num = sc.nextInt();
    for (i = 1; i <= 10; i++) {
      System.out.println("table of number :" + num + " * " + i + " = " + num * i);
    }
  }
}