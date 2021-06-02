import java.util.Scanner;
public class Bai32 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Nhap a: ");int a=k.nextInt();
    System.out.print("\nNhap b: ");int b=k.nextInt();
    if(a==b){
      System.out.println(a+"="+b);
    }
    if(a!=b){
      System.out.println(a+"!="+b);
    }
    if(a>b){
      System.out.println(a+">"+b);
    }
    if(a>=b){
      System.out.println(a+">="+b);
    }
    if(a<b){
      System.out.println(a+"<"+b);
    }
    if(a<=b){
      System.out.println(a+"<="+b);
    }
    
 }
}