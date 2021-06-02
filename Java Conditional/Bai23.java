import java.util.Scanner;
public class Bai23 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input number of rows : ");
    int n=k.nextInt();
    for(int i=n;i>=1;i--){
      for(int m=n;m>=i;m--){
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      System.out.print("\n");
    }
 }
}