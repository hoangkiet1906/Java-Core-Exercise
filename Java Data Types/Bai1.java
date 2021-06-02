import java.util.Scanner;
public class Bai1 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input a degree in Fahrenheit: ");int f=k.nextInt();
    int c=5*(f-32)/9;
    System.out.print(f+" degree Fahrenheit is equal to "+c+" in Celsius");
 }
}