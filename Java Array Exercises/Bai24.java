import java.util.*;
public class Bai24 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    // System.out.print("Input a number : ");
    // int input=k.nextInt();
    int [] a=new int[]{1,2,3,4,5,7,8,10};
    for(int i=0;i<a.length-1;i++){
      if((a[i+1]-a[i])!=1){
        System.out.print("\nMissing : "+(a[i]+1));
      }
    }
  }
}