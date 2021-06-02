import java.util.Scanner;
public class Bai30 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input number 1st  : ");
    float n=k.nextFloat();
    System.out.print("Input number 2nd : ");
    float m=k.nextFloat();
    System.out.print("Input number 3rd : ");
    float p=k.nextFloat();
    if(n==m&&m==p)System.out.print("All numbers are different ");
    else{
      if(n!=m&&n!=p&&m!=p)System.out.print("All numbers are different ");
      else System.out.print("Neither all are equal or different");
    }
 }
}