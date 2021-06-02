import java.util.Scanner;
public class Bai8 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input the side length value: ");double value=k.nextInt();
    System.out.print("Square: "+Math.pow(value,2));
    System.out.print("\nCube: "+Math.pow(value,3));
    System.out.print("\nFourth power: "+Math.pow(value,4));
 }
}