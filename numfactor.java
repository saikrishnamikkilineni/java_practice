import java.util.Scanner;
class numberfactor{
  public static void main(String args[]){
    int num,i,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number :");
    num=sc.nextInt();
    for(i=1;i<=num;i++){
      if(num%i==0){
        count++;
      }
    }
    System.out.println("number of factor is:"+count);
  }
}