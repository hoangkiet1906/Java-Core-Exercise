import java.util.*;
public class Bai30 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    // System.out.print("Input a number : ");
    // int input=k.nextInt();
	  int[] array_nums = {0,50, 77, 12, 54, -11};
	  System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	  System.out.println("Result: "+test(array_nums));
    }	
  public static boolean test(int[] numbers) {
    for (int number : numbers) {
      if (number == 0 || number == -1) {
        return false;
      }
    }
    return true;
  }
}