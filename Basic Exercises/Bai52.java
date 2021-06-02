import java.util.Scanner;
public class Bai52 {
  public static void main(String[] args) {
    Scanner k = new Scanner(System.in);
    System.out.print("Nhap so thu 1 : ");
    int x = k.nextInt();  
		System.out.print("Nhap so thu 2: ");
		int y = k.nextInt(); 
		System.out.print("Nhap so thu 3 : ");
    int z = k.nextInt();
    if(x + y == z || z + y == x || x + z == y){
    System.out.print("Ket qua: true");
    }
    else System.out.print("Ket qua : false");
  }
}