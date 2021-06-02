import java.util.Scanner;
public class Bai8 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Input an alphabet: ");
    String m=k.nextLine();
    char[] ch=m.toCharArray();
    if(ch.length==1||Character.isLetter(ch[0])){
      if(ch[0]=='u'||ch[0]=='e'||ch[0]=='o'||ch[0]=='a'||ch[0]=='i') System.out.print("Input letter is Vowel");
      else System.out.print("Input letter is Consonant");
    }
    else System.out.print("Input wrong");
  }
}