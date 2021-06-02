import java.util.Scanner;
public class Bai15 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Nhap x: "); int x=k.nextInt();
    System.out.print("\nNhap y: ");int y=k.nextInt();
    int z;
    z=x;
    x=y;
    y=z;
    System.out.println("x: "+x+"\ny: "+y);
  }
}