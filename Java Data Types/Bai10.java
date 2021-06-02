import java.util.Scanner;
public class Bai10 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input six non-negative digits: ");int a=k.nextInt();
    char[] chars=(""+a).toCharArray();
    for(int i=0;i<chars.length;i++){
      System.out.print(chars[i]+" ");
    }
 }
}