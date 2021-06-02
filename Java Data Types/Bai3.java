import java.util.Scanner;
public class Bai3 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input an integer between 0 and 1000 ");int i=k.nextInt();
    int c=(i/10)%10;
    int t=(i/10)/10;
    int dv=i%10;
    System.out.print("The sum of all digits in "+i+" is "+(c+t+dv));
 }
}