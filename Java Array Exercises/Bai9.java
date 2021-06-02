import java.util.*;
public class Bai9 {
  public static void main(String[] args) {
    int[] a={2,3,4,5,6,7,2,3,4};
    int[] newa=new int[a.length+1];
    int b;
    System.out.println("Source Array : "+Arrays.toString(a));
    Scanner k=new Scanner(System.in);
    System.out.print("Input a element: ");b=k.nextInt();
    System.out.print("Input specific position: ");int n=k.nextInt();
    for(int i=0;i<a.length;i++){
      newa[i]=a[i];
      if(i==n){
        for(int j=0;j<a.length+1;j++){
          newa[j]=a[i+1];
        }
        newa[i]=b;
      }
    }
    System.out.println("New Array : "+Arrays.toString(newa));
 }
}