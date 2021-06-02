import java.util.Scanner;
public class Bai35 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Nhap length canh da giac deu : ");int a=k.nextInt();
    System.out.print("Nhap number of canh da giac deu : ");int b=k.nextInt();
    System.out.println("Dien thich Hexagon : "+((b*a*a)/(4*Math.tan(Math.PI/b))));
 }
}