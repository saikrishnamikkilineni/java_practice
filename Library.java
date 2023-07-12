import java.util.Scanner;

public class Library {
  Scanner sc = new Scanner(System.in);
  Lib[] array = new Lib[100];
  int num = 0;

  // add operation
  public void add() {
    System.out.println("Enter title");
    String title = sc.next();
    System.out.println("Enter author");
    String author = sc.next();
    System.out.println("Enter category");
    String category = sc.next();

    Lib obj = new Lib();

    obj.setStu_title(title);
    obj.setStu_author(author);
    obj.setStu_category(category);

    array[num] = obj;
    num++;

    System.out.println(" Title: " + obj.getStu_title());
    System.out.println("Author: " + obj.getStu_author());
    System.out.println("Category: " + obj.getStu_category());

    System.out.println("Number of Books" + num);
  }

  // Search operation
  public void search() {
    System.out.println("Enter books by title or author :");
    String title = sc.next();

    for (int i = 0; i < num; i++) {
      if (title.equals(array[i].getStu_title()) || title.equals(array[i].getStu_author())) {

        System.out.println("Category :" + array[i].getStu_category());
      }
    }
  }

  // Display books based on specific category

  public void display() {
    System.out.println("Enter the category ");
    String category = sc.next();
    for (int i = 0; i < num; i++) {
      if (category .equals( array[i].getStu_category())) {
        System.out.println("Title: " + array[i].getStu_title());
        System.out.println("author :" + array[i].getStu_author());
      }
    }
  }

  public void view() {
    for (int i = 0; i < num; i++) {
      System.out.println("No: " + i);
      System.out.println("Title  :" + array[i].getStu_title());
      System.out.println("Author:" + array[i].getStu_author());
      System.out.println("Category :" + array[i].getStu_category());
    }
  }

  // view operation
  public void viewoptions() {
    System.out.println("=============Library Application============== ");
    int option = sc.nextInt();
    do {
      System.out.println("1.add book");
      System.out.println("2.search for books by title or author");
      System.out.println("3.Display books based on specific category");
      System.out.println("4.Exit");
      option = sc.nextInt();

      if (option == 1) {
        add();
      }

      else if (option == 2) {
        search();
      }

      else if (option == 3) {
        display();
      } else if (option == 4) {
        view();
      }
    } while (option != 5);

  }

  public static void main(String args[]) {
    Library obj = new Library();
    obj.viewoptions();

  }
}