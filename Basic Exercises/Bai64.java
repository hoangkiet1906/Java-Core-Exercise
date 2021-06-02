import java.util.*;
 public class Bai64 {
 public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.print("Input the first number : ");
    int a = in.nextInt();  
		System.out.print("Input the second number: ");
		int b = in.nextInt(); 
		int x = a % 10;
	  int y = b % 10;
	  a /= 10;
	  b /= 10;
	  if(a == b || a == y || x == b || x == y)
		System.out.println("Result: True ");
    }
}

