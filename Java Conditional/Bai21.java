import java.util.Scanner;
public class Bai21 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input number of rows : ");
    int n=k.nextInt();
    for(int i=1;i<=n;i++){
      for(int m=n;m>=i;m--){
        System.out.print(" ");
      }
      for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
      }
      System.out.print("\n");
    }
    for(int i=n-1;i>=1;i--){
      for(int m=n;m>=i;m--){
        System.out.print(" ");
      }
      for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
      }
      System.out.print("\n");
    }
 }
}