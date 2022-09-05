import java.util.ArrayList;

/**
 * Test Example.
 *
 * @description: This is one simple example for test.
 * @author: Eric
 * @create: 2022-09-05
 **/

public class HelloWorld {
  static ArrayList<Integer> arrayList = new ArrayList<>();

  /**
  * This method is the start of the program.

  * @param args input para
  */

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      arrayList.add(i);
      arrayList.size();
      arrayList.contains(i);
    }
    System.out.println("Hello");
  }
}