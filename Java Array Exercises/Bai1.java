import java.util.Arrays;
public class Bai1 {
  public static void main(String[] args) {
    int[] number={32,34,12,43,55,23,12};
    String[] str={"Anh","T", "QUang" ,"Fuang","Minh","Hung"};
    System.out.print("Number Arrays: "+Arrays.toString(number)+"\nNew num Arrays");
    Arrays.sort(number);
    System.out.print(Arrays.toString(number));
    System.out.print("\nString Arrays: "+Arrays.toString(str)+"\nNew stri Arrays");
    Arrays.sort(str);
    System.out.print(Arrays.toString(str));
 }
}