import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");

//        Iterator<String> it = set.iterator();
//        while (it.hasNext()) {
//            String str = it.next();
//            System.out.println(str);
//        }
//
//        for (String s : set) {
//            System.out.println(s);
//        }

        set.forEach(s -> System.out.println(s));
    }
}
