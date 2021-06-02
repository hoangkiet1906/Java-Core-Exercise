import java.util.Arrays;
public class Bai2 {
  public static void main(String[] args) {
    int[] number={32,34,12,43,55,23,12};
    int s=0;
    for(int i=0;i<number.length;i++){
      s+=number[i];
    }
    System.out.print("Sum : "+s);
 }
}