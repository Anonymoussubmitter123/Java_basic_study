import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        ArrayList<String> c1 = new ArrayList<>();
        c1.add("nanjing");
        c1.add("nanjing");
        c1.add("nanjing");

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("nanjing");
        c2.add("nanjing");
        c2.add("nanjing");

        ArrayList<String> c3 = new ArrayList<>();
        c3.add("nanjing");
        c3.add("nanjing");
        c3.add("nanjing");

        hm.put("jiangsu", c1);
        hm.put("hunan", c2);
        hm.put("hebei", c3);

        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner sj = new StringJoiner(", ", "", "");
            for (String s : value) {
                sj.add(s);
            }
            System.out.println(key + "=" + sj);
        }
    }
}
