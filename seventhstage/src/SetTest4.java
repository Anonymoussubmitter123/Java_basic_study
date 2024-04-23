import java.util.TreeSet;

public class SetTest4 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("wangwu", 25);

        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s3);
        ts.add(s2);
        ts.add(s4);

        System.out.println(ts);
    }
}
