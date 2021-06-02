import java.util.*;
 public class Bai54 {
 public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.print("Input the first number : ");
    int x = in.nextInt();  
		System.out.print("Input the second number: ");
		int y = in.nextInt(); 
		System.out.print("Input the third number : ");
    int z = in.nextInt(); 
    if(x%10==y%10||y%10==z%10||x%10==z%10){
    System.out.print("The result TRUE ");}
    else System.out.print("The result FALSE");
    }
}
