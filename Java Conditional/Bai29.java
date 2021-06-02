import java.util.Scanner;
public class Bai29 {
  public static void main(String[] args) {
    int i,j,n,p,q;
    System.out.print("Input number less than 10 billion : ");
    Scanner in = new Scanner(System.in);
		n = in.nextInt();
    int numberOfDigits = String.valueOf(n).length();
    System.out.print(numberOfDigits);
 }
}