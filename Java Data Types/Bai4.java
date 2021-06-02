import java.util.Scanner;
public class Bai4 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input the number of minutes: ");int m=k.nextInt();
    int d=m/(24*60);
    int y=d/365;
    System.out.print(m+" minutes is approximately "+y+" years and "+d%365+" days");
 }
}