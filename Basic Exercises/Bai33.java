import java.util.Scanner;
public class Bai33 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Nhap so bat ki: ");int a=k.nextInt();
    int b=a/10;
    int c=a%10;
    System.out.println("Tong so phan tu : "+(b+c));
 }
}