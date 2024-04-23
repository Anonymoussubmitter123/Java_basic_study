import java.util.ArrayList;

public class ListTest2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Character> list = new ArrayList<>();

        list.add('1');
        list.add('2');
        list.add('3');
        list.add('4');
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ",");
        }
    }
}
