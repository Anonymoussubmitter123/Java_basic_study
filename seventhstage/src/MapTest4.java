import java.util.*;

public class MapTest4 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        List<String> list = new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            list.add(arr[r.nextInt(arr.length)]);
        }
        System.out.println(list);

        HashMap<String, Integer> chm = new HashMap<>();
        for (String s : list) {
            if (chm.containsKey(s)) {
                int i = chm.get(s);
                chm.put(s, ++i);
            } else {
                chm.put(s, 1);
            }
        }
        System.out.println(chm);
        Set<String> keys = chm.keySet();
        int count = 0;
        for (String key : keys) {
            if (chm.get(key) > count) {
                count = chm.get(key);
            }
        }
        for (String key : keys) {
            if (chm.get(key) == count) {
                System.out.println(key);
            }
        }
        System.out.println(count);
    }
}
