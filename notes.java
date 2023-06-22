import java.util.Scanner;
class notes{
  public static void main(String args[])
  {
    int n1,n2,n3,num;
    Scanner sc = new Scanner(System.in);
    num=sc.nextInt();
    if(num%100==0)
    {
      n1=num/500;
      num=num%500;
      n2=num/200;
      num=num%200;
      n3=num/100;
      System.out.println("No.of 500 notes:"+n1);
      System.out.println("No.of 200 notes:"+n2);
      System.out.println("No.of 100 notes:"+n3);
    }
      else 
    {
      System.out.println("Enter correct amount");
    }   
  }
}