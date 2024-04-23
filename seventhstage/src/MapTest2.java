import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest2 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("1", "xiaoming");
        m.put("2", "xiaoming");
        m.put("3", "xiaoming");

        // 1、键找值
        Set<String> keys = m.keySet();
        keys.forEach(key -> System.out.println(m.get(key)));

        for (String key : keys) {
            System.out.println(m.get(key));
        }
        // 2、键值对
        Set<Map.Entry<String, String>> entries = m.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        entries.forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });

        Iterator<Map.Entry<String, String>> eit = entries.iterator();
        while (eit.hasNext()) {
            Map.Entry<String, String> entry = eit.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // 3、lambda
        m.forEach((String key, String value) -> System.out.println(key + " =" + value));
    }
}
