import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> list1 = list.stream().filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(list1);

        ArrayList<String> strList = new ArrayList<>();
        Collections.addAll(strList, "zhangsan,21", "lisi,23", "wangwu,24");
        List<String> list2 = strList.stream().filter(s -> Integer.parseInt(s.split(",")[1]) >= 23).collect(Collectors.toList());
        System.out.println(list2);

        ArrayList<String> nanList = new ArrayList<>();
        ArrayList<String> nvList = new ArrayList<>();
        Collections.addAll(nanList, "zhangsan,21", "lisi,23", "wangwu,24");
        Collections.addAll(nvList, "xiaoming,21", "xiaohong,23", "xiaolan,24");

        Stream<String> nanstream = nanList.stream().filter(s -> s.length() >= 3).limit(2);
        Stream<String> nvstream = nvList.stream().filter(s -> s.startsWith("x")).skip(1);

        List<Actor> actorList = Stream.concat(nanstream, nvstream).map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());

        System.out.println(actorList);
    }
}
