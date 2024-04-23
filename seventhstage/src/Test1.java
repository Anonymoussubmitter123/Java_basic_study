import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("nnn");
        coll.add("mmm");
        coll.add("ccc");

        // 增强for
        for (String s : coll) {
            s = "qqq";
            System.out.println(s);
        }

        // 迭代器
        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {
            String str = it.next();
            if ("bbb".equals(str)) {
                it.remove();
            }
//            System.out.println(str);
        }

        // Lambda方法
        coll.forEach(s -> System.out.println(s));

        System.out.println(coll);
    }
}
