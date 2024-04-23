import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class IOTest11 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Actor actor1 = new Actor("zhangsan", 23);
        Actor actor2 = new Actor("lisi", 24);
        Actor actor3 = new Actor("wangwu", 18);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ninthstage\\src\\bushiba.txt"));
        ArrayList<Actor> list = new ArrayList<>();
        Collections.addAll(list, actor1, actor2, actor3);
        oos.writeObject(list);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ninthstage\\src\\bushiba.txt"));
        ArrayList<Actor> list1 = (ArrayList<Actor>) ois.readObject();
        for (Actor actor : list1) {
            System.out.println(actor);
        }
        ois.close();
    }
}
