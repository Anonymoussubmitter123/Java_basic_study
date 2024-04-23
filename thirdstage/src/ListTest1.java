import java.util.ArrayList;

public class ListTest1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        boolean result1 = list.add("adad");
        list.add("1212");
        list.add("3434");
        String result = list.remove(0);
        System.out.println(result);
        System.out.println(list);
    }
}
