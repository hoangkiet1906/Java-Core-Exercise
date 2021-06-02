import java.util.Scanner;
public class Bai36 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.print("Nhap kinh do 1 : ");double a1=k.nextDouble();
    System.out.print("Nhap vi do 1 : ");double a2=k.nextDouble();
    System.out.print("Nhap kinh do 2 : ");double b1=k.nextDouble();
    System.out.print("Nhap vi do 2 : ");double b2=k.nextDouble();
    System.out.print("Khoang cach hai diem : "+(6371.01*Math.acos(Math.sin(Math.toRadians(a1))*Math.sin(Math.toRadians(b1))+Math.cos(Math.toRadians(a1))*Math.cos(Math.toRadians(b1))*Math.cos(Math.toRadians(b1)-Math.toRadians(b2))))+"Km");
 }
}