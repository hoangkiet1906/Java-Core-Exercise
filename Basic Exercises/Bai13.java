import java.util.Scanner;
public class Bai13 {
  public static void main(String[] args) {
    Scanner k = new Scanner(System.in);
    System.out.print("Nhap chieu dai Rectangle : ");
    double a=k.nextDouble();
    System.out.println("Chieu rong : ");
    double b=k.nextDouble();
    System.out.println("Dien tich : "+a*b+"\nChu vi : "+2*(a+b));
 }
}