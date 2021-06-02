import java.util.Scanner;
public class Bai9 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input a year: ");
    int y=k.nextInt();
      if((y%4==0&&y%100!=0)||y%400==0) System.out.print(y+"  is a leap year ");
      else System.out.print(y+ " is NOT a leap year");
  }
}