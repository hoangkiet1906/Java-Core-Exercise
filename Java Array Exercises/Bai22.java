import java.util.*;
public class Bai22 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input a number : ");
    int input=k.nextInt();
    int[] a={1,2,3,4,5,6,7,8,9};
    System.out.println("Pairs of elements and their sum : ");
    for (int i =  0; i < a.length; i++)
    {
      for (int j  = i+1; j < a.length; j++)
      {
        if(a[i]+a[j] == input)
        {
          System.out.println(a[i]+" + "+a[j]+" =  "+input);
        }
      }
    }
  }
}