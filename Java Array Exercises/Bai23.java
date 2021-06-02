import java.util.*;
public class Bai23 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    // System.out.print("Input a number : ");
    // int input=k.nextInt();
    int[] a={1,2,3,4,5,6,7,8,9};
    int[] b={1,2,3,4,5,6,7,8,9};
    int x=1;
    if(a.length == b.length)
    {
      for (int i  = 0; i < a.length; i++)
      {
        if(a[i] !=b[i])
        {
          x=0;
        }
      }
    }
    else
    {
      x=0;
    }
    if(x==1)
    {
      System.out.println("Two arrays are equal.");
    }
    else
    {
      System.out.println("Two  arrays are not equal.");
    }
  }
}