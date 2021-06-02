import java.util.Scanner;
public class Bai50 {
  public static void main(String[] args) {
    // Scanner k=new Scanner(System.in);
    System.out.println("Divided 3: ");
    for(int i=0;i<=100;i++){
      if(i%3==0) System.out.print(i+",");
    }
    System.out.println("\nDivided 5: ");
    for(int i=0;i<=100;i++){
      if(i%5==0)System.out.print(i+",");
    }
    System.out.println("\nDivided 3&5: ");
    for(int i=0;i<=100;i++){
      if(i%5==0&&i%3==0)System.out.print(i+",");
    }
 }
}