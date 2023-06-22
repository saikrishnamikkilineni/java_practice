import java.util.Scanner;

class bill {
  public static void main(String args[]) {
    double per, units, Billamount, Addgst, Totalbill;

    System.out.println("Enter no.of units:");
    Scanner sc = new Scanner(System.in);
    units = sc.nextInt();
    if (units <= 50) {
      per = 3.5;
    } else if (units <= 150) {
      per = 4.8;
    } else if (units <= 250) {
      per = 7.2;
    } else if (units <= 500) {
      per = 9.7;
    } else {
      per = 0;
    }
    Billamount = units * per;
    Addgst = Billamount * 0.18;
    Totalbill = Billamount + Addgst;
    System.out.println("Generate total bill :" + Totalbill);
  }
}