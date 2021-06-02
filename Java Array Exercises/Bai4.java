import java.util.Arrays;
public class Bai4 {
  public static void main(String[] args) {
    int []a = {1,2,3,4,5,6,7,8,9};   
    int s=0;
    for(int i = 0; i < a.length; i++)
    {
      s+=a[i];
    }
    System.out.print("Average : "+s/a.length);
 }
}