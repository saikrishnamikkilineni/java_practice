import java.io.*;
import java.util.Scanner;

interface EmployeesInter {
  // abstract methods
  // public,static,final
  Scanner sc = new Scanner(System.in);

  void add();

  void viewAll();

  void delete();

  void update();
}

// interface to class
abstract class first implements EmployeesInter {
  int numEmployee = 0;

  Employee[] arr = new Employee[100];

  // 1st Method
  public void add() {
    System.out.println("Enter employeeid");
    int id = sc.nextInt();
    System.out.println("Enter employee name");
    String name = sc.next();
    System.out.println("Enter employee salary");
    double salary = sc.nextDouble();
    System.out.println("Enter employee city");
    String city = sc.next();
    Employee obj = new Employee();

    obj.setEmp_id(id);
    obj.setEmp_salary(salary);
    obj.setEmp_name(name);
    obj.setEmp_city(city);

    arr[numEmployee] = obj;
    numEmployee++;

    System.out.println("employee ID: " + obj.getEmp_id());
    System.out.println("employee salary: " + obj.getEmp_salary());
    System.out.println("employee name: " + obj.getEmp_name());
    System.out.println("employee city: " + obj.getEmp_city());
    System.out.println("Number of employees" + numEmployee);

  }

  // 2nd Method
  public void viewAll() {
    for (int i = 0; i < numEmployee; i++) {
      System.out.println("Employee no: " + i);
      System.out.println("Employee id :" + arr[i].getEmp_id());
      System.out.println("Employee salary :" + arr[i].getEmp_salary());
      System.out.println("Employee name :" + arr[i].getEmp_name());
      System.out.println("Employee city :" + arr[i].getEmp_city());
    }
  }
}

// second class to implements pending methods

class second extends first {

  public void delete() {
    System.out.println("Enter employee id");
    int delete = sc.nextInt();
    for (int i = 0; i < numEmployee; i++) {
      if (delete == arr[i].getEmp_id()) {
        for (int j = i; j < numEmployee; j++)
          arr[j] = arr[j + 1];
        numEmployee--;
        break;
      }
    }
    viewAll();
  }

  public void update() {
    System.out.println("Enter employee id");
    int update = sc.nextInt();
    for (int i = 0; i < numEmployee; i++) {
      if (update == arr[i].getEmp_id()) {
        System.out.println("enter new name");
        String name = sc.next();
        arr[i].setEmp_name(name);
        System.out.println("Enter new salary");
        int salary = sc.nextInt();
        arr[i].setEmp_salary(salary);
        System.out.println("Enter new city");
        String city = sc.next();
        arr[i].setEmp_city(city);

      }
    }
    viewAll();
  }

}

class Interface extends second {

  public static void main(String args[]) {

    EmployeesInter obj = new Interface();
    int option = 0;
    while (option != 5) {
      System.out.println("=============Interface Menu based application============== ");
      System.out.println("1.Enter the add operation");
      System.out.println("2.Enter the viewoption");
      System.out.println("3.Enter the delete option");
      System.out.println("4.Enter the update option");
      option = sc.nextInt();
      if (option == 1) {

        obj.add();
      } else if (option == 2) {

        obj.viewAll();
      }

      else if (option == 3) {

        obj.delete();

      } else if (option == 4) {
        obj.update();
      }
    }

  }

}
