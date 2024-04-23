import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest2 {
    public static void main(String[] args) {
        Map<Character, Integer> tm = new TreeMap<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o2 - o1;
            }
        });

        String str = "aababcbacdabcde";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (tm.containsKey(c)) {
                int count = tm.get(c);
                tm.put(c, ++count);
            } else {
                tm.put(c, 1);
            }
        }
        Set<Character> keys = tm.keySet();
        int max = 0;
        Character maxc = ' ';
        for (Character key : keys) {
            if (tm.get(key) > max) {
                max = tm.get(key);
                maxc = key;
            }
        }
        System.out.println(tm);
        System.out.println(max);
        System.out.println(maxc);
    }
}
