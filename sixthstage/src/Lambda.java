import java.util.Arrays;

public class Lambda {
    public static void main(String[] args) {
        Integer[] arr = {16, 5, 9, 12, 21, 18, 32, 23, 37, 26, 45, 34, 50, 48, 61, 52, 73, 66};
        String[] arrS = {"a", "aaaa", "aaa", "aa"};

        Arrays.sort(arrS, (String o1, String o2) -> {
            return o2.length() - o1.length();
        });

        System.out.println(Arrays.toString(arrS));

//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });

        Arrays.sort(arr, (o1, o2) -> {
            return o1 - o2;
        });
        System.out.println(Arrays.toString(arr));

//        method(
//                ()->{
//                    System.out.println("youyong");
//                }
//        );
//        public static void method(Swim s){
//            s.swimming();
//        }
    }
}

@FunctionalInterface
interface Swim {
    public abstract void swimming();
}