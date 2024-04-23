import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest3 {
    public static void main(String[] args) {
        Map<Student, String> m = new HashMap<>();
        Student s1 = new Student("xiaoming", 18);
        Student s2 = new Student("xiaoming", 18);
        Student s3 = new Student("xiaoming", 18);

        m.put(s1, "xiaoming");
        m.put(s2, "xiaoming");
        System.out.println(m.put(s3, "xiaoming"));

        System.out.println(m);

        Set<Student> keys = m.keySet();
        keys.forEach(key -> {
            System.out.println(key);
            System.out.println(m.get(key));
        });

        for (Student key : keys) {
            System.out.println(key);
            System.out.println(m.get(key));
        }

        m.forEach((student, s) -> {
            System.out.println(student);
            System.out.println(s);
        });
    }
}
