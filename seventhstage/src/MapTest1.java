import java.util.HashMap;
import java.util.Map;

public class MapTest1 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("1", "xiaoming");
        m.put("2", "xiaoming");
        m.put("3", "xiaoming");

        boolean key = m.containsKey("1");
        boolean value = m.containsValue("xiaoming");

        System.out.println(key);
        System.out.println(value);
        System.out.println(m.size());
        m.clear();
        System.out.println(m.isEmpty());
        System.out.println(m);
    }
}
