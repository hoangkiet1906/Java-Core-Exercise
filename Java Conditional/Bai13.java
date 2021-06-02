import java.util.Scanner;
public class Bai13 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input numbers of term : ");
    int n=k.nextInt();
    for(int i=1;i<=n;i++){
      System.out.print("\nNumber is : "+i+"and cube of "+i+" is : "+Math.pow(i,3));
    }
  }
}