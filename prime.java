import java.util.*;

class prime {
  public static void main(String args[]) {
    int i, count = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    for (i = 2; i <= num / 2; i++) { // 2---9
      if (num % i == 0) {
        count++;
        break;
      }
    }
    if (count == 0) {
      System.out.println("is a prime number" + num);
    } else {
      System.out.println("is not a prime number" + num);
    }
  }
}