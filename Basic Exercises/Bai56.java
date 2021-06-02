import java.util.*;
 public class Bai56 {
 public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.print("Input two integer: ");
		int a = in.nextInt(); 
    int b = in.nextInt();
    System.out.print("Input a numbers : ");
    int c=in.nextInt();
    int dem=0;
    for(int i=a;i<=b;i++){
      if(i%c==0) dem+=1;
    }
    System.out.print("Results : "+dem);
    }
}
