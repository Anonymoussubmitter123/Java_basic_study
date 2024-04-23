import java.util.ArrayList;
import java.util.Scanner;

public class ListTest3 {
    private static int flag;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("xiaozhang", 18);
        Student s2 = new Student("xiaohong", 20);
        Student s3 = new Student("xiaolv", 19);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        String str = scanner.next();

        for (int i = 0; i < list.size(); i++) {
            if (str.equals(list.get(i).getName())) {
                flag = i;
                break;
            }
            flag = -1;
        }
        System.out.println(flag);
    }
}
