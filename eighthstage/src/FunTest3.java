import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FunTest3 {
    public static void main(String[] args) {
        ArrayList<String> listStr = new ArrayList<>();
        Collections.addAll(listStr, "AAA", "bbb", "ccc");

        ArrayList<String> listStr2 = new ArrayList<>();
        Collections.addAll(listStr2, "111-1", "222-1", "323-1", "234-2");

        Actor[] actors = listStr2.stream().map(Actor::new).toArray(Actor[]::new);
        System.out.println(Arrays.toString(actors));
        List<Actor> actorList = Arrays.stream(actors).toList();
        String[] array = actorList.stream().map(Actor::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }
}
