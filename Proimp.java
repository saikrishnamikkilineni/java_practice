import java.util.Scanner;

class Proimp {

  Scanner sc = new Scanner(System.in);
  Product arr[] = new Product[100];
  int productnum = 0;

  public void addProduct() {

    System.out.println("Enter the product ID ");
    int Id = sc.nextInt();
    System.out.println("Enter the Product name ");
    String name = sc.next();
    System.out.println("Enter the price ");
    double Price = sc.nextDouble();
    System.out.println("Enter pricequantity");
    int Pqty = sc.nextInt();
    Product obj = new Product();

    obj.setpId(Id);
    obj.setpName(name);
    obj.setprice(Price);
    obj.setpqty(Pqty);

    arr[productnum] = obj;
    productnum++;

    System.out.println("Product ID: " + obj.getpId());
    System.out.println("Product name :" + obj.getpName());
    System.out.println("Product price :" + obj.getprice());
    System.out.println("Product quantity:" + obj.getpqty());
  }

  public void deleteId() {
    System.out.println("Enter pID to delete product details ");
    int search = sc.nextInt();
    for (int i = 0; i < productnum; i++) {
      if (search == arr[i].getpId()) {
        for (int j = i; j < productnum; j++) {
          arr[j] = arr[j + 1];
          productnum--;
          break;
        }
      }
      viewAll();
    }
  }

  public void updateId() {
    System.out.println("Enter pId to update the product details");
    int buss = sc.nextInt();
    for (int i = 0; i < productnum; i++) {
      if (buss == arr[i].getpId()) {
        System.out.println("Enter new product name");
        String name = sc.next();
        arr[i].setpName(name);
        System.out.println("Enter new price ");
        double Price = sc.nextDouble();
        arr[i].setprice(Price);
        System.out.println("Enter new price quatity");
        int Pqty = sc.nextInt();
        arr[i].setpqty(Pqty);
      }
    }
  }

  public void viewAll() {
    for (int i = 0; i <= productnum; i++) {
      System.out.println("Product ID: " + arr[i].getpId());
      System.out.println("Product name:" + arr[i].getpName());
      System.out.println("Product price :" + arr[i].getprice());
      System.out.println("Product quantity :" + arr[i].getpqty());
    }
  }

  public void pId() {
    System.out.println("Enter pId to view product details");
    int view = sc.nextInt();
    for (int i = 0; i <= productnum; i++) {
      if (view == arr[i].getpId()) {
        System.out.println("Product name:" + arr[i].getpName());
        System.out.println("Product price :" + arr[i].getprice());
        System.out.println("Product quantity :" + arr[i].getpqty());
      }
    }
  }

  public void pName() {
    System.out.println("Enter pName to view product details");
    String det = sc.next();
    for (int i = 0; i < productnum; i++) {
      if (det == arr[i].getpName()) {
        System.out.println("Product ID: " + arr[i].getpId());
        System.out.println("Product price :" + arr[i].getprice());
        System.out.println("Product quantity :" + arr[i].getpqty());
      }
    }
  }

  public void pRange() {
    System.out.println("Enter price range1 to view product details");
    double range1 = sc.nextDouble();
    System.out.println("Enter price range2 to view product details");
    double range2 = sc.nextDouble();
    for (int i = 0; i < productnum; i++) {
      if (arr[i].getprice() >= range1 && arr[i].getprice() <= range2) {
        System.out.println("Product name:" + arr[i].getpName());
        System.out.println("Product ID: " + arr[i].getpId());
        System.out.println("Product quantity :" + arr[i].getpqty());
      }
    }

  }

  public void viewOptions() {
    int option = sc.nextInt();
    do {

      System.out.println("========Product Application========");
      System.out.println("1.Add product");
      System.out.println("2.Delete product based on pId");
      System.out.println("3.Update product based on pId");
      System.out.println("4.view all products");
      System.out.println("5.view product details based on PiD");
      System.out.println("6.view product details based on Pname");
      System.out.println("7. view product details by price range");
      System.out.println("8.exit");
      option = sc.nextInt();

      if (option == 1) {
        addProduct();
      }

      else if (option == 2) {
        deleteId();
      }

      else if (option == 3) {
        updateId();
      }

      else if (option == 4) {
        viewAll();
      }

      else if (option == 5) {
        pId();
      }

      else if (option == 6) {
        pName();
      }

      else if (option == 7) {
        pRange();
      }

    } while (option != 8);

  }

  public static void main(String args[]) {
    Proimp obj = new Proimp();
    obj.viewOptions();

  }
}