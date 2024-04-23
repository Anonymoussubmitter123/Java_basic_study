import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> coll = new ArrayList<>();

        coll.add(1);
        coll.add(2);
        coll.add(3);
        coll.add(4);

        // 手动装箱
        Integer i = Integer.valueOf(1);
        coll.remove(i);

        coll.set(1, 2);

        Iterator<Integer> iterator = coll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer integer : coll) {
            System.out.println(integer);
        }

        coll.forEach(s -> System.out.println(s));

        for (int j = 0; j < coll.size(); j++) {
            int s = coll.get(i);
            System.out.println(s);
        }
    }
}
