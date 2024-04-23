import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>((o1, o2) -> o2 - o1);
        TreeMap<Student, String> stm = new TreeMap<>((o1, o2) -> o2.getAge() - o1.getAge());

        tm.put(2, "xiaoming");
        tm.put(1, "zhangsan");
        tm.put(4, "xiaoming");
        tm.put(3, "xiaohong");
        Student s1 = new Student("xiaoming", 18);
        Student s2 = new Student("xiaoming", 19);
        Student s3 = new Student("xiaoming", 15);

        stm.put(s2, "shandong");
        stm.put(s1, "shandong");
        stm.put(s3, "shandong");

        System.out.println(tm);
        System.out.println(stm);
    }
}
