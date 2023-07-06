import java.util.Scanner;

public class application {
  int arr[] = new int[100];
  Scanner sc = new Scanner(System.in);
  int n = 0;

  public void insertfirst() {
    System.out.println("Enter new value : ");
    int value = sc.nextInt();
    if (n == 0) {
      arr[0] = value;
      n++;
    } else {
      for (int i = n; i > 0; i--) {
        arr[i] = arr[i - 1];

      }
      arr[0] = value;
      n++;
    }
  }

  public void insertlast() {
    int value = sc.nextInt();
    if (n == 0) {
      arr[0] = value;
      n++;
    } else {
      arr[n] = value;
      n++;
    }

  }

  public void insertindex() {
    System.out.println("Enter new value :");
    int value = sc.nextInt();
    System.out.println("Enter index value :");
    int index = sc.nextInt();
    if (index <= n) {
      if (n == 0) {
        arr[index] = value;
        n++;
      } else {
        for (int i = n; i > index; i--) {
          arr[i] = arr[i - 1];

        }
        arr[index] = value;
        n++;
      }
    }
  }

  public void deletefirst() {
    System.out.println("enter search element");
    int search = sc.nextInt();
    for (int i = 0; i < n; i++) {
      if (search == arr[i]) {
        for (int j = i; j < n - 1; j++) {
          arr[j] = arr[j + 1];
        }
      }
      n--;
      break;
    }
  }

  public void deleteall() {
    System.out.println("enter search element");
    int search = sc.nextInt();
    for (int i = 0; i < n; i++) {
      if (search == arr[i]) {
        for (int j = i; j < n - 1; j++) {
          arr[j] = arr[j + 1];
        }
      }
      n--;
      i--;
    }
  }

  public void display() {
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public void viewoptions() {
    int option = 0;
    do {

      System.out.println("1.Insert first ");
      System.out.println("2.Insert last");
      System.out.println("3.insert index ");
      System.out.println("4.delete first occurence of search element ");
      System.out.println("5.delete all occurence of search element ");
      System.out.println("Choose your option");
      option = sc.nextInt();
      if (option == 1) {
        insertfirst();
        display();
      }
      if (option == 2) {
        insertlast();
        display();
      }
      if (option == 3) {
        insertindex();
        display();
      }
      if (option == 4) {
        deletefirst();
        display();
      }
      if (option == 5) {
        deleteall();
        display();
      }
    } while (option != 0);

  }

  public static void main(String args[]) {
    application obj = new application();
    obj.viewoptions();

  }
}