import java.util.ArrayList;
import java.util.Collections;

public class FunTest1 {
    public static void main(String[] args) {
//        Integer[] arr = {2, 3, 13, 4, 432, 1};
//        Arrays.sort(arr, FunTest1::subtraction);
//        System.out.println(Arrays.toString(arr));
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list, "1", "2", "3", "4", "5");
//
//        list.stream().map(s -> Integer.parseInt(s)).forEach(s -> System.out.println(s));
//        list.stream().map(Integer::parseInt).forEach(s -> System.out.println(s));

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1-1", "2-1", "#-1", "3-1", "2-2", "3-2");

//        list.stream().filter(new StringOperation()::stringJudge).forEach(s -> System.out.println(s));
        // 静态类中没有this
//        list.stream().filter(new FunTest1()::stringJudge).forEach(s -> System.out.println(s));
//        List<Actor> actorList = list.stream().map(new Function<String, Actor>() {
//            @Override
//            public Actor apply(String s) {
//                String[] arr = s.split("-");
//                String name = arr[0];
//                int age = Integer.parseInt(arr[1]);
//                return new Actor(name, age);
//            }
//        }).collect(Collectors.toList());
//        System.out.println(actorList);
//        List<Actor> actorList = list.stream().map(Actor::new).collect(Collectors.toList());
//        System.out.println(actorList);
    }

    public static int subtraction(Integer o1, Integer o2) {
        return o2 - o1;
    }

    public boolean stringJudge(String s) {
        return s.startsWith("2") && s.length() == 3;
    }
}
