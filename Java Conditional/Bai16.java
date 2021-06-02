import java.util.Scanner;
public class Bai16 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input numbers of rows : ");
    int n=k.nextInt();
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++)
      {
        System.out.print(j);
      }
      System.out.print("\n");
    }
  }
}