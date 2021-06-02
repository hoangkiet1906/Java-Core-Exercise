import java.util.Scanner;
public class Bai7 {

  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.println("Nhap so bat ki: ");
    int a=k.nextInt();
    for(int i=1;i<=10;i++){
      System.out.println(a+"x"+i+"="+(a*i));
    }
    
 }
}
