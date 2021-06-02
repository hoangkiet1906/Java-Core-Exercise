import java.util.Scanner;
public class Bai3 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input the 1st number: ");
    int a=k.nextInt();
    System.out.print("Input the 2nd number: ");
    int b=k.nextInt();
    System.out.print("Input the 3rd number: ");
    int c=k.nextInt();
    int m=a;
    if(m<b)m=b;
    if(m<c)m=c;
    System.out.print("The greatest : "+m);
 }
}