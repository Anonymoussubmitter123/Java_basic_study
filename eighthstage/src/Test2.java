import java.util.*;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<Object> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 56, 6);
        hm.put("1", 11);
        hm.put("3", 12);
        hm.put("2", 13);
        int[] arr = {1, 2, 34, 5, 6};
        Arrays.stream(arr).forEach(s -> System.out.println(s));

        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        entries.stream().forEach(s -> System.out.println(s));
        Stream.of(1, 2, 34, 5, 6).forEach(s -> System.out.println(s));
    }
}
