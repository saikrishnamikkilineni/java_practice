import java.util.Scanner;

class factor {
  public static void main(String args[]) {
    int i = 0, num = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number :");
    num = sc.nextInt();
    for (i = 1; i <= num; i++) {
      if (num % i == 0) {
        System.out.println("factor of number is: " + i);
      }
    }
  }
}