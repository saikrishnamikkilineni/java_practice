import java.util.Scanner;
class name{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter messgae: ");
    String message=sc.nextLine();
    System.out.println("Enter a name: ");
   String  name =sc.nextLine();  

    System.out.println(message);
    System.out.println(name);
  }
}