import java.util.*;
public class Bai13 {
  public static void main(String[] args){   
	  String[] a = {"a", "b", "c", "a", "f", "c", "h"};
    for (int i = 0; i < a.length-1; i++)
    {
      for (int j = i+1; j < a.length; j++)
      {
        if( (a[i].equals(a[j])) && (i != j) )
        {
          System.out.println("Duplicate Element is : "+a[j]);
        }
      }
    }
	}
}