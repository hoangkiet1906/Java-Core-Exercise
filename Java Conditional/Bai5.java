import java.util.Scanner;
public class Bai5 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input a number: ");
    int a=k.nextInt();
    switch(a){
      case 1:System.out.print("Monday");
      case 2:System.out.print("Tuesday");
      case 3:System.out.print("Wednesday");
      case 4:System.out.print("Thursday");
      case 5:System.out.print("Friday");
      case 6:System.out.print("Saturday");
      case 7:System.out.print("Sunday");
    }
 }
}