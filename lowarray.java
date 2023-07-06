import java.util.Scanner;

class lowarray {
  public static void main(String args[]) {
    int  i;
    int myarray[] = new int[5];
    Scanner sc = new Scanner(System.in);
    for (i = 0; i <= 4; i++) {
      System.out.println(" enter the number" + (i + 1) + " :");
      myarray[i] = sc.nextInt();
    }
    int lowestvalue = myarray[0];
    for (i = 0; i <= 4; i++) {
      if (myarray[i] < lowestvalue) {
        lowestvalue = myarray[i];
      }
    }
    System.out.println("lowest value is : " + lowestvalue);
  }
}