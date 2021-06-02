import java.util.Scanner;
public class Bai5 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    long ms = System.currentTimeMillis();
    System.out.print("Input the time zone offset to GMT: ");int gmt=k.nextInt();
    int s0=(int)ms/1000;
    int s=s0%60;
    int m=(s0/60)%60;
    int h0=(s0/60)/60;
    int h=(gmt+h0)%24;
    System.out.print("Current time is : "+h+":"+m+":"+s);
 }
}