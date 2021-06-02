import java.util.Scanner;
public class Bai11 {

  public static void main(String[] args) {
    double r,pi=3.1415;
    Scanner k=new Scanner(System.in);
    System.out.print("Nhap ban kinh circle: ");
    r=k.nextDouble();
    System.out.println("Ban kinh : "+r*2*pi+"\nDien tich : "+r*r*pi);
 }
}