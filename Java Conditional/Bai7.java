import java.util.Scanner;
public class Bai7 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input a month number: ");
    int m=k.nextInt();
    System.out.print("Input a year: ");
    int y=k.nextInt();
    if(m!=2){
      switch(m){
        case 1: System.out.print("January "+y+"has 31 days");
        case 3: System.out.print("March "+y+"has 31 days");
        case 5: System.out.print("May "+y+"has 31 days");
        case 7: System.out.print("July "+y+"has 31 days");
        case 8: System.out.print("August "+y+"has 31 days");
        case 10: System.out.print("October "+y+"has 31 days");
        case 12: System.out.print("December "+y+"has 31 days");
        case 4: System.out.print("April "+y+"has 30 days");
        case 6: System.out.print("June "+y+"has 30 days");
        case 9: System.out.print("September "+y+"has 30 days");
        case 11: System.out.print("November "+y+"has 30 days");
      }
    }
    else{
      if((y%4==0&&y%100!=0)||y%400==0) System.out.print("February "+y+"has 29 days");
      else System.out.print("February "+y+"has 28 days");
    }
  }
}