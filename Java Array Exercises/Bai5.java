import java.util.Arrays;
import java.util.Scanner;
public class Bai5 {
  public static void main(String[] args) {
    int []a = {1,2,3,4,5,6,7,8,9};   
    System.out.print("Input a value Int: ");
    Scanner k=new Scanner(System.in);
    int s=k.nextInt();
    for(int i = 0; i < a.length; i++)
    {
      if(a[i]==s) System.out.print("True ");
    }
 }
}