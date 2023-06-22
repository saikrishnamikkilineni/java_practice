import java.util.Scanner;
class threenumbers {
  public static void main(String args[]){
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if(a>b && a>c){
      System.out.println("a is maximum number:"+a);
    }
    else if(b>a && b>c){
      System.out.println("b is maximum number: "+b);
    }
    else if(c>a && c>b){
        System.out.println("c is maximum number:"+c);
      }
    else {
      System.out.println("No value ");
    }
     
  }
}