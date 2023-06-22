import java.util.Scanner;

class odd {
  public static void main(String args[]) {
    int i = 0, sum = 0;
    for (i = 1; i <= 10; i++) {
      if (i % 2 != 0) {
        sum += i;
        System.out.println(sum);
      }
    }
  }
}