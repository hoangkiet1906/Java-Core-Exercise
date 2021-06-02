import java.util.*;
public class Bai10 {
  static int max;
	static int min;
	    public static void max_min(int a[]) {
	        max = a[0];
	        min = a[0];
	        for (int i = 1; i < a.length - 1; i++) {
	            if (a[i] > a[i + 1]) {
	                if (a[i] > max) max = a[i];
	                if (a[i + 1] < min) min = a[i + 1];
	            }
	            if (a[i] < a[i + 1]) {
	                if (a[i] < min) min = a[i];
	                if (a[i + 1] > max) max = a[i + 1];
	            }
	        }
	    }
	    public static void main(String[] args) {
	        int[] a = {2, 1, 6, 5, 3, 5, 7, 8, 9, 4};
	        max_min(a);
	        System.out.println(" Original Array: "+Arrays.toString(a));
	        System.out.println(" Maximum value for the above array = " + max);
	        System.out.println(" Minimum value for the above array = " + min);
  }
}