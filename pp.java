import java.util.Scanner;
class pp{
  public static void main(String args[]){
    int i,j,primecount=0,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("prime number from 1 to n");
    int n=sc.nextInt(); 
    for( i=2;i<=n;i++){
      for( j=2;j<i/2;j++){
        if(i%j==0){
          count++;
          break;
        } 
      }   
    }
    if(count==1) {
      primecount++;
      if(primecount%2!=0)
    System.out.println(i);
    }
  }
}