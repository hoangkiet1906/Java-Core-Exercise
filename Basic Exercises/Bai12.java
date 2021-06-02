import java.util.Scanner;
public class Bai12 {
  public static void main(String[] args) {
    Scanner k = new Scanner(System.in);
    System.out.print("Nhap ba so : ");
    int a=k.nextInt();
    int b=k.nextInt();
    int c=k.nextInt();
    System.out.println("Trung binh cong ba so : "+(float)(a+b+c)/3);
 }
}