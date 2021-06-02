import java.util.Scanner;
public class Bai38 {
  public static void main(String[] args) {
    int letters=0,numbers=0,others=0,spaces=0;
    Scanner k=new Scanner(System.in);
    System.out.print("Nhap chuoi: ");
    char[] chuoi;
    chuoi=k.nextLine().toCharArray();
    for(int i=0;i<chuoi.length;i++){
      if(Character.isLetter(chuoi[i])){
        letters++;
      }else{
        if(Character.isDigit(chuoi[i])){
          numbers++;
        }else{
          if(Character.isSpaceChar(chuoi[i])){
            spaces++;
          }
          else{others++;}}}
    }
    System.out.println("Letters : "+letters);
    System.out.println("space: " + spaces);
		System.out.println("number: " + numbers);
		System.out.println("other: " + others);
 }
}