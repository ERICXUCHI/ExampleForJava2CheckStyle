import java.util.ArrayList;

public class HelloWorld { static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {for
    (int i = 0;
    i < 100;
    i++) {
            arrayList.add(i);
            arrayList.size();
            arrayList.contains(i);
        }
        System.out.println("Hello");
    }
}
