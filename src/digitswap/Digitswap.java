import java.util.Scanner;

public class Digitswap {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String res = new String(new char[] {s.charAt(1), s.charAt(0)});
    System.out.println(res);
    sc.close();
  }
}
