import java.util.*;
 public class Bai60 {
 public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.print("Input a String: ");
	  String line = in.nextLine();
	  char[] chr=line.toCharArray();
    for(int i=chr.length-1;i>=0;i--){
      System.out.print(chr[i]);
    }
    }
}
