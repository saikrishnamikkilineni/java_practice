import java.util.Scanner;

class maximumnumber {
  public static void main(String args[]) {
    int a, b;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    if (a > b) {
      System.out.println("a is maximum number: " + a);
    } else {
      System.out.println("b is maximum number: " + b);
    }
  }
}