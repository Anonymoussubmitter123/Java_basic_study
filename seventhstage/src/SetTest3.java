import java.util.Iterator;
import java.util.TreeSet;

public class SetTest3 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);

        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            int i = it.next();
            System.out.println(i);
        }

        for (Integer t : ts) {
            System.out.println(t);
        }

        ts.forEach((str) -> {
            System.out.println(str);
        });
    }
}
