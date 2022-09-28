import java.util.*;

public class Modulo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashSet<Integer> set = new HashSet<>();

    int cur;
    while (sc.hasNextShort()) {
      cur = sc.nextShort();
      set.add(cur % 42);
    }
    System.out.println(set.size());
  }
}
