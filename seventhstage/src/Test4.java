import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(list, 0, 0, 0);

        Collections.shuffle(list);

        Random r = new Random();
        int i = r.nextInt(list.size());
        int flag = list.get(i);
        System.out.println(flag);
    }
}
