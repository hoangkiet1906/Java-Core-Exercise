import java.util.Scanner;
public class Bai32 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input number 1st  : ");
    float n=k.nextFloat();
    System.out.print("Input number 2nd : ");
    float m=k.nextFloat();
    if (Math.abs(n - m) <= 0.01) { 
      System.out.println("These numbers are the same."); 
    } 
    else { 
      System.out.println("These numbers are different."); 
 }
 }
}