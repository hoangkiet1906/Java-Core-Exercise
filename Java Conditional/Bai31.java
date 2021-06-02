import java.util.Scanner;
public class Bai31 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input number 1st  : ");
    float n=k.nextFloat();
    System.out.print("Input number 2nd : ");
    float m=k.nextFloat();
    System.out.print("Input number 3rd : ");
    float p=k.nextFloat();
    if(n>m&&m>p)System.out.print("Decreasing order");
    else{
      if(m<p&&n<m)System.out.print("Increasing order");
      else System.out.print("Neither increasing or decreasing order");
    }
 }
}