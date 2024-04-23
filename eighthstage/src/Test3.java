import java.util.*;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list1, 1, 2, 3, 4, 5, 5, 5, 56, 6);
        Collections.addAll(list, "1-1", "2-1", "#-1", "3-1", "2-2", "3-2");

//        list.stream().limit(3).forEach(s -> System.out.println(s));
//        list.stream().distinct().forEach(s -> System.out.println(s));  // 去重,基于hashcode和equals方法
//        list.stream().skip(4).limit(1).forEach(s -> System.out.println(s));
//        list.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s -> System.out.println(s));
//        list.stream().forEach(s -> System.out.println(s));
//        Object[] objects = list.stream().toArray();
//        System.out.println(Arrays.toString(objects));
//        String[] arr = list.stream().toArray(value -> new String[value]);
//        System.out.println(Arrays.toString(arr));
        List<String> newlist = list.stream().filter(s -> "1".equals(s.split("-")[1])).collect(Collectors.toList());
        Set<String> newSet = list.stream().filter(s -> "2".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(newlist);
        System.out.println("------------------------");
        System.out.println(newSet);
        System.out.println("------------------------");
        Map<String, Integer> map = list.stream().filter(s -> "1".equals(s.split("-")[1])).collect(Collectors.toMap(
                s -> s.split("-")[0],
                s -> Integer.parseInt(s.split("-")[1])));
        System.out.println(map);
    }
}
