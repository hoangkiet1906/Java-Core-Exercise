import java.util.*;
public class Bai27 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    // System.out.print("Input a number : ");
    // int input=k.nextInt();
    int[] array_nums = {5, 7, 2, 4, 9};
	  System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	  int ctr = 0;
	  for(int i = 0; i < array_nums.length; i++)
	  {
		  if(array_nums[i] % 2 == 0)
			  ctr++;
	  }
	  System.out.println("Number of even numbers : "+ctr);
	  System.out.println("Number of odd numbers  : "+(array_nums.length-ctr));
  }
}