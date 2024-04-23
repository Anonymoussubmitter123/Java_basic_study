import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("1", "xiaoming");
        m.put("2", "xiaoming");
        m.put("3", "xiaoming");

        Set<Map.Entry<String, String>> entries = m.entrySet();
        Map.Entry[] array = entries.toArray(new Map.Entry[0]);
    }
}
