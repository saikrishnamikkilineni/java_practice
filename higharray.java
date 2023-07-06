import java.util.Scanner;

class higharray {
  public static void main(String args[]) {
    int i;
    int myarray[] = new int[7];
    Scanner sc = new Scanner(System.in);
    for (i = 0; i <= 6; i++) {
      System.out.println("Enter the number " + (i + 1) + ":");
      myarray[i] = sc.nextInt();
    }

    int maxvalue = myarray[0];
    for (i = 0; i <= 6; i++) {
      if (myarray[i] > maxvalue) {
        maxvalue = myarray[i];
      }
    }
    System.out.println("The highest value is : " + maxvalue);
  }
}