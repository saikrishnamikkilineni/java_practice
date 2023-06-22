import java.util.Scanner;

class salary {
  public static void main(String args[]) {
    int salary, Hra, Da, emp, Grossalary;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter basic salary of employee :");
    emp = sc.nextInt();
    if (emp <= 10000) {
      Hra = 20 / 100;
      Da = 80 / 100;
      Grossalary = emp + Hra + Da;
      System.out.println("Gross salary of 1st:" + Grossalary);
    } else if (emp <= 20000) {
      Hra = 25 / 100;
      Da = 90 / 100;
      Grossalary = emp + Hra + Da;
      System.out.println("Gross salary of 2nd :" + Grossalary);
    } else if (emp > 20000) {
      Hra = 30 / 100;
      Da = 95 / 100;
      Grossalary = emp + Hra + Da;
      System.out.println("Gross salary of 3rd : " + Grossalary);
    } else {
      System.out.println("Gross salary is not correct");
    }
  }
}