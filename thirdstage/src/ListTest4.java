import java.util.ArrayList;

public class ListTest4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("xiaoming", 20);
        Student s2 = new Student("xiaohong", 19);
        Student s3 = new Student("xiaolv", 18);
        
        list.add(s1);
        list.add(s2);
        list.add(s3);

        ArrayList<Student> studentsInfoList = getStudentInfo(list);
        for (int i = 0; i < studentsInfoList.size(); i++) {
            Student student = studentsInfoList.get(i);
            System.out.println(student.getName() + "," + student.getAge());
        }
    }

    public static ArrayList<Student> getStudentInfo(ArrayList<Student> list) {
        ArrayList<Student> resultList = new ArrayList<>();// 容器集合
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if (student.getAge() <= 19) {
                resultList.add(student);
            }
        }
        return resultList;
    }
}
