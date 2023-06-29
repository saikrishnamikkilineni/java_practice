import java.util.*;

public class bankapplication {
  int i = 1;
  Scanner s = new Scanner(System.in);
  double acbal = 10000;
  int count = 0;

  public void no_of_notes(int amount) {
    int n1 = 0, n2 = 0, n3 = 0;
    // amount = s.nextInt();
    if (amount >= 500) {
      n1 = amount / 500;
      amount = amount % 500;
    }
    if (amount >= 200) {
      n2 = amount / 200;
      amount = amount % 200;
    }
    if (amount >= 100) {
      n3 = amount / 100;
      amount = amount % 100;
    }
    System.out.println("No.of 500 notes :" + n1);
    System.out.println("No.of 200 notes :" + n2);
    System.out.println("No.of 100 notes :" + n3);

  }

  public void withdraw() {
    System.out.println("Enter withdraw amount");
    int amount = s.nextInt();
    // withdraw amount should be multiples of 100 only
    // transaction limit is 20K only
    // customer can't make account bal : 0, min bal: 500
    // 5000 : 4500
    // withdraw amount should be less than acbal.
    if (amount % 100 == 0) {
      // System.out.println(amount);
      if (amount <= 20000) {
        // System.out.println(amount);
        if (amount <= acbal - 500) {
          // System.out.println(amount);
          acbal = acbal - amount;
          // System.out.println(acbal);
          no_of_notes(amount);
          // count++;
          System.out.println("Available bal is :" + acbal);
        } else {
          System.out.println("insucffient fund");
        }
      } else {
        System.out.println("Transaction limit is 20k only");
      }
    } else {
      System.out.println("Please enter multiples of 100 only");
    }
  }

  public void deposit() {
    System.out.println("Enter deposit amount");
    int amount = s.nextInt();
    if (amount % 100 == 0) {
      if (amount <= 50000) {
        acbal = acbal + amount;
        System.out.println("Available bal is :" + acbal);
      } else {
        System.out.println("Deposit limit is 50k only");
      }
    } else {
      System.out.println("Please enter multiples of 100 only");
    }

  }

  public void balEnquiry() {
    System.out.println(" Display balance" + acbal);
  }

  public void viewOptions() {
    System.out.println("============Welcome to ABC bank===========");
    while (i == 1) {
      System.out.println("1.Deposit");
      System.out.println("2.Withdaraw");
      System.out.println("3.bal Enquiry");
      System.out.println("0.EXIT");
      System.out.println("Choose your option :");
      int option = s.nextInt();
      if (option == 1) {
        deposit();
      } else if (option == 2) {
        // if(count<=3)
        withdraw();
      } else if (option == 3) {
        balEnquiry();
      } else if (option == 0) {
        System.out.println("Exit");
      }
      System.out.println("1 Continue 0. EXIT");
      i = s.nextInt();
    }
  }

  public static void main(String args[]) {
    bankapplication obj = new bankapplication();
    obj.viewOptions();
  }
}