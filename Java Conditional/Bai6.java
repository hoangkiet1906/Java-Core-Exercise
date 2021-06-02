import java.util.Scanner;
public class Bai6 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input 1st number: ");
    double a=k.nextDouble();
    System.out.print("Input 2nd number: ");
    double b=k.nextDouble();
    double x = Math.floor(a * 1000);
    x = x / 1000;
    double y = Math.floor(b * 1000);
    y = y / 1000;
    if(x==y)System.out.print("They're the same ");
    else System.out.print("They're different");
  }
}