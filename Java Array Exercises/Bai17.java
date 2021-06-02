import java.util.*;
public class Bai17 {
  public static void main(String[] args) {
    int[] a = {123,394,3,394,110};
		System.out.println("Original numeric array : "+Arrays.toString(a));            
		Arrays.sort(a);
		int index = a.length-1;
		while(a[index]==a[a.length-1]){
		index--;
		}
		System.out.println("Second largest value: " + a[index]);
 }
}