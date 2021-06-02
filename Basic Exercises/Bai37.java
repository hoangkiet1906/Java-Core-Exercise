import java.util.Scanner;
public class Bai37 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Nhap chuoi: ");
    char[] chuoi;
    chuoi=k.nextLine().toCharArray();
    for (int i = chuoi.length - 1; i >= 0; i--) {
      System.out.print(chuoi[i]);
    }
 }
}