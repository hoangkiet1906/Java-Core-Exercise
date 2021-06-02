import java.util.Scanner;
public class Bai117 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int n;
    System.out.print("Input a positive integer: ");
    n = kb.nextInt();
    System.out.print("Square root of "+n+" is: "+Math.sqrt(n));
 }
}