import java.util.*;
public class Bai8 {
  public static void main(String[] args) {
    int[] a={2,3,4,5,6,7,2,3,4};
    int[] copya=new int[a.length];
    System.out.println("Source Array : "+Arrays.toString(a));
    for(int i=0;i<a.length;i++){
      copya[i]=a[i];
    }
    System.out.println("New Array : "+Arrays.toString(copya));
 }
}