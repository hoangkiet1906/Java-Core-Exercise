import java.util.Scanner;
public class Bai9 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input 1st integer: ");int a=k.nextInt();
    System.out.print("Input 2nd integer: ");int b=k.nextInt();
    System.out.print("\nSum of two integers: "+(a+b));
    System.out.print("\nDifference of two integers: "+(a-b));
    System.out.print("\nProduct of two integers: "+(a*b));
    System.out.print("\nAverage of two integers: "+(a+b)/2);
    System.out.print("\nMax integer: "+(a>b?a:b));
    System.out.print("\nMin integer: "+(a<b?a:b));
 }
}