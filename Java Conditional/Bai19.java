import java.util.Scanner;
public class Bai19 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input number of rows : ");
    int n=k.nextInt();
    for(int i=1;i<=n;i++){
      for(int m=n;m>=i;m--){
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        System.out.print(i+" ");
      }
      System.out.print("\n");
    }
 }
}