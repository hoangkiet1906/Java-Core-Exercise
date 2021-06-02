import java.util.Scanner;
public class Bai12 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input 5 numbers : ");
    int n=k.nextInt();
    int n1=k.nextInt();
    int n2=k.nextInt();
    int n3=k.nextInt();
    int n4=k.nextInt();
    System.out.print("The sum of 5 no is: "+(n+n1+n2+n3+n4));
    System.out.print("\nThe Average is : "+(n+n1+n2+n3+n4)/5.0);
  }
}