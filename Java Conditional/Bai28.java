import java.util.Scanner;
public class Bai28 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input number of rows : ");
    float n=k.nextFloat();
    if(n==0) System.out.print("Zero");
    else{
      if(n>0)System.out.print("Number is positive");
      else System.out.print("Number is negative");
      if(Math.abs(n)<1)System.out.print(" and Small");
      if(Math.abs(n)>1000000) System.out.print(" and Large");
    }
 }
}