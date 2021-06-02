import java.util.Scanner;
public class Bai11 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input n terms : ");
    int n=k.nextInt();
    int s=0;
    for(int i=1;i<=n;i++) s+=i;
    System.out.print("The Sum of Natural Number upto n terms : "+s);
  }
}