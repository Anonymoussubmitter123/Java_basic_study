import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunTest2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "AAA", "bbb", "ccc");

//        list.stream().map(new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return s.toUpperCase();
//            }
//        }).forEach(s -> System.out.println(s));
//        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
//        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
//            @Override
//            public String[] apply(int value) {
//                return new String[value];
//            }
//        });
        String[] arr = list.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
