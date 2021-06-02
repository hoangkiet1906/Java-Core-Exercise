import java.util.Scanner;
public class Bai4 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input a number: ");
    int a=k.nextInt();
    System.out.print("The value of m : "+a);
    System.out.print("\nThe value of n : ");
    if(a>0)System.out.print(1);
    if(a==0)System.out.print(0);
    if(a<0)System.out.print(-1);
 }
}