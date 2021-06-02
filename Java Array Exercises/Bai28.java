import java.util.*;
public class Bai28 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    // System.out.print("Input a number : ");
    // int input=k.nextInt();
    int[] array_nums = {1, 7, 2, 4, 11};
	  System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	  int max_val = array_nums[0];
	  int min = array_nums[0];
	  for(int i = 1; i < array_nums.length; i++)
	  {
		  if(array_nums[i] > max_val)
			  max_val = array_nums[i];
		  else if(array_nums[i] < min)
			  min = array_nums[i];
	  }
	  System.out.println("Difference between the largest and smallest values of the said array: "+(max_val-min));	
 }
}