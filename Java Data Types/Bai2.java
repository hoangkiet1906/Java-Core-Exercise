import java.util.Scanner;
public class Bai2 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input a value for inch: ");int i=k.nextInt();
    double m=i*0.0254;
    System.out.print(i+" inch is "+m+" meters");
 }
}