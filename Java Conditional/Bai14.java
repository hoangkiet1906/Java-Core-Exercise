import java.util.Scanner;
public class Bai14 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input numbers of term : ");
    int n=k.nextInt();
    for(int i=0;i<=n;i++){
      System.out.print("\n"+n+" x "+i+" = "+n*i);
    }
  }
}