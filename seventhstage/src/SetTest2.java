import java.util.LinkedHashSet;

public class SetTest2 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("wangwu", 25);
//        HashSet<Student> hs = new HashSet<>();
//        System.out.println(hs.add(s1));
//        System.out.println(hs.add(s2));
//        System.out.println(hs.add(s3));
//        System.out.println(hs.add(s4));
        LinkedHashSet<Student> lh = new LinkedHashSet<>();
        System.out.println(lh.add(s1));
        System.out.println(lh.add(s2));
        System.out.println(lh.add(s3));
        System.out.println(lh.add(s4));
        System.out.println(lh);
    }
}
