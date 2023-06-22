import java.util.Scanner;

class sumfactor {
  public static void main(String args[]) {
    int sum = 0, i = 1, num = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number :");
    num = sc.nextInt();
    for (i = 1; i <= num; i++) {
      if (num % i == 0) {
        sum += i;
      }
    }
    System.out.println("sum of factor is: " + sum);
  }
}
