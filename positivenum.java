import java.util.Scanner;

class checknumber {
  public static void main(String[] arg) {
    int num;
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    if (num > 0) {
      System.out.println("a is positive number: " + num);
    } else if (num < 0) {
      System.out.println("a is negative number: " + num);
    } else {
      System.out.println(" Number is zero:" + num);
    }
  }
}