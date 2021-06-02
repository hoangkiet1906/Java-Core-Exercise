import java.util.Scanner;
public class Bai15 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input numbers of term : ");
    int n=k.nextInt();
    int s=0;
    for(int i=1;i<=2*n;i+=2){
      System.out.print("\n"+i);
      s+=i;
    }
    System.out.print("\nThe Sum of odd Natural Number upto " +n+" terms is: " +s);
  }
}