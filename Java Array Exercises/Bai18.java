import java.util.*;
public class Bai18 {
  public static void main(String[] args) {
    int[] my_array = {10,0,-1, 4, 0, 2, 7, -3};
		System.out.println("Original numeric array : "+Arrays.toString(my_array));
		int min = 0;
		int second_min = 0;
		for (int i = 0; i < my_array.length; i++) {
		  if(my_array[i]==min){ second_min=min;
		  } else if (my_array[i] < min) {
		      second_min = min;
		      min = my_array[i];
		      }else if (my_array[i] < second_min) {
		        second_min = my_array[i];
		      }
		}
		System.out.println("Second lowest number is : " + second_min);
 }
}