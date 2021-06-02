import java.util.Scanner;
public class Bai18 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input number of rows : ");
    int n=k.nextInt();
    int m=1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print((m++) +" ");
      }
      System.out.print("\n");
    }
 }
}