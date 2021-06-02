import java.util.Scanner;
public class Bai39 {
  public static void main(String[] args) {
    int dem = 0;
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= 4; j++){
				for(int k = 1; k <= 4; k++){
					if(k != i && k != j && i != j){
						dem++;
						System.out.println(i + "" + j + "" + k);
					}
				}
			}
		}
		System.out.print("So so co ba chu so tu 1,2,3,4 : "+dem);
 }
}