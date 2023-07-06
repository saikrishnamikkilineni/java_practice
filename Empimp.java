import java.util.Scanner;

public class Empimp {
  Scanner sc = new Scanner(System.in);
  Employee[] arr = new Employee[100];
  int numEmployee = 0;

  public void insertOperation() {

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

  public void viewAll() {
    for (int i = 0; i < numEmployee; i++) {
      System.out.println("Employee no: " + i);
      System.out.println("Employee id :" + arr[i].getEmp_id());
      System.out.println("Employee salary :" + arr[i].getEmp_salary());
      System.out.println("Employee name :" + arr[i].getEmp_name());
      System.out.println("Employee city :" + arr[i].getEmp_city());
    }
  }

  public void getId() {
    System.out.println("Enter employee id to get employee information :");
    int search = sc.nextInt();
    for (int i = 0; i < numEmployee; i++) {
      if (search == arr[i].getEmp_id()) {
        System.out.println("Employee salary :" + arr[i].getEmp_salary());
        System.out.println("Employee name :" + arr[i].getEmp_name());
        System.out.println("Employee city: " + arr[i].getEmp_city());
      }
    }
  }

  public void salaryRange() {
    System.out.println("Enter employee salary range1 to get employee information :");
    double range1 = sc.nextDouble();
    System.out.println("salary range2");
    double range2 = sc.nextDouble();
    for (int i = 0; i < numEmployee; i++) {
      if (arr[i].getEmp_salary() >= range1 && arr[i].getEmp_salary() <= range2) {
        System.out.println("Employee ID: " + arr[i].getEmp_id());
        System.out.println("Employee name: " + arr[i].getEmp_name());
        System.out.println("Employee city :" + arr[i].getEmp_city());
      }
    }
  }

  public void deleteId() {
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

  public void updateId() {
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

  public void viewoptions() {
    System.out.println("=============Menu based application============== ");
    int option = sc.nextInt();
    do {
      System.out.println("1.insert operation");
      System.out.println("2.view all empinformation");
      System.out.println("3.Delete empinformation based on EmpID");
      System.out.println("4.Update empinformation");
      System.out.println("5.Get employee information based on ID ");
      System.out.println("6.Get employee information with salary range");
      System.out.println("7.exit");
      option = sc.nextInt();

      if (option == 1) {
        insertOperation();
      }

      else if (option == 2) {
        viewAll();
      }

      else if (option == 3) {
        deleteId();
      }

      else if (option == 4) {
        updateId();
      }

      else if (option == 5) {
        getId();
      }

      else if (option == 6) {
        salaryRange();
      }

    } while (option != 7);
  }

  public static void main(String args[]) {
    Empimp obj = new Empimp();
    obj.viewoptions();

  }
}