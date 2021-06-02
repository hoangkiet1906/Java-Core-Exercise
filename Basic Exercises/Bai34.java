import java.util.Scanner;
public class Bai34 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Nhap canh luc giac deu : ");int a=k.nextInt();
    System.out.println("Dien thich Hexagon : "+((6*a*a)/(4*Math.tan(Math.PI/6))));
 }
}