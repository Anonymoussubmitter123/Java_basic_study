import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");

        list.stream().filter(name -> name.startsWith("l")).filter(name -> name.length() == 4).forEach(name -> System.out.println(name));
    }
}
