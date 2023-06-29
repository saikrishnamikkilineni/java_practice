import java.util.*;
import java.util.Scanner;

class stringapp {
  int i = 1;
  Scanner s = new Scanner(System.in);

  public void student() {
    String student_id = "std101";

    if (student_id.startsWith("std")) {
      System.out.println(student_id);
    } else {
      System.out.println("Enter correct studentid starts with std ");
    }

    if (student_id.length() >= 6 && student_id.length() <= 10) {
      System.out.println(student_id);
    } else {
      System.out.println("enter correct studentid length");
    }
    if (student_id.endsWith("01")) {
      System.out.println(student_id);
    } else {
      System.out.println("Enter correct studentid endswith number");
    }
    System.out.println("after validating studentid :" + student_id);
  }

  public void namecheck() {
    String name = "Saikrishna";

    if (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z') {
      System.out.println(name);
    } else {
      System.out.println("Enter name should starts with capital letter");
    }
    if (name.length() >= 5 && name.length() <= 15) {
      System.out.println(name);
    } else {
      System.out.println("Enter name should contains 5-15 characters");
    }
    for (int i = 0; i <= name.length(); i++) {
      int a = (int) name.charAt(i);
      if (a >= 97 && a <= 128) {
        System.out.println(name);
      } else {
        System.out.println("Should ends with lowercase letter");
      }

      if (name.matches(".[\\s\\d\\w].*")) {
        System.out.println("shoud not contain digits,space and special characters");
      } else {
        System.out.println(name);
      }
      System.out.println("After validating name : " + name);
    }
  }

  public void mobileche() {
    String mobile = "1234567894";
    if (mobile.startsWith("1-9") && mobile.length() == 10) {
      System.out.println(mobile);
    } else {
      System.out.println("Enter correct number");
    }
  }

  public void emailcheck() {
    String emailid = "saik8794@gmail.com";
    if (emailid.contains("@") && emailid.contains(".")) {
      System.out.println(emailid);
    } else {
      System.out.println("should contain @ and . ");
    }
    if (emailid.startsWith("a-z") && emailid.endsWith(".com") || emailid.endsWith(".in")) {
      System.out.println(emailid);
    } else {
      System.out.println("Enter correct");
    }
    if (emailid.length() >= 10 && emailid.length() <= 25) {
      System.out.println(emailid);
    } else {
      System.out.println("should contain from 10 to 25");
    }
  }

  public void usernamev() {
    String username = "saikrishna";
    if (username.length() >= 8 && username.length() <= 15) {
      System.out.println(username);
    } else {
      System.out.println("enter correct username");
    }

  }

  public void viewoptions() {
    System.out.println("=================validate student details===================");
    while (i == 1) {
      System.out.println("1.student_id");
      System.out.println("2.name");
      System.out.println("3.mobile_number");
      System.out.println("4.emailid");
      System.out.println("5.username");
      System.out.println("6.password");
      System.out.println("choose your option :");
      int option = s.nextInt();
      if (option == 1) {
        student();
      } else if (option == 2) {
        namecheck();
      } else if (option == 3) {
        mobileche();
      } else if (option == 4) {
        emailcheck();
      } else if (option == 5) {
        usernamev();
      }

    }

  }

  public static void main(String args[]) {
    stringapp obj = new stringapp();
    obj.viewoptions();
  }
}