import java.util.Scanner;
public class Bai6 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input weight in pounds: ");int w=k.nextInt();
    System.out.print("Input height in inches: ");int h=k.nextInt();
    double bmi=w*0.45359237/(Math.pow(h*0.0254,2));
    System.out.print("BMI : "+bmi);
 }
}