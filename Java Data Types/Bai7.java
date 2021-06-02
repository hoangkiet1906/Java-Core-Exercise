import java.util.Scanner;
public class Bai7 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input distance in meters: ");int meters=k.nextInt();
    System.out.print("Input hour: ");int h=k.nextInt();
    System.out.print("Input minutes: ");int m=k.nextInt();
    System.out.print("Input seconds: ");int s=k.nextInt();
    double mps=(double)meters/(h*3600+m*60+s);
    System.out.print("Your speed in meters/second is : "+mps);
    System.out.print("\nYour speed in km/h is : "+mps*3.6);
    System.out.print("\nYour speed in miles/h is : "+mps*3.6/1.609);
 }
}