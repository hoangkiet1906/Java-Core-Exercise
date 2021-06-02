import java.util.Scanner;
public class Bai2 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input number a: ");
    int a=k.nextInt();
    System.out.print("Input number b: ");
    int b=k.nextInt();
    System.out.print("Input number c: ");
    int c=k.nextInt();
    double delta=b*b-4*a*c;
    if(a==0&&b==0&&c==0) System.out.print("Equation countless solutions ");
    else{
      if(a==0)System.out.print("The root is : "+(-b/c));
      else{
        if(delta>0)System.out.print("The root are: "+((Math.sqrt(delta)-b)/(2*a))+" and "+((-Math.sqrt(delta)-b)/(2*a)));
        if(delta==0)System.out.print("The root are double : "+(-b)/(2*a));
        if(delta<0)System.out.print("The equation is no solution !");
      }
    }
 }
}