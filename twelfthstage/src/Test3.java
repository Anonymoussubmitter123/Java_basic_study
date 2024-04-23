import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class Test3 {
    public static void main(String[] args) throws ClassNotFoundException, IOException, IllegalAccessException {
        // 利用反射保存任意类型对象的数据
        Student student = new Student("zhangsan", 23, "nan");
        Teacher teacher = new Teacher("xiaoming", 28);

        saveObject(student);
    }

    private static void saveObject(Object obj) throws ClassNotFoundException, IOException, IllegalAccessException {
        Class<?> clazz = Class.forName("Student");
        Field[] files = clazz.getDeclaredFields();
        BufferedWriter bw = new BufferedWriter(new FileWriter("twelfthstage\\src\\student.txt"), 8092);
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("twelfthstage\\src\\student.txt"));
//        oos.writeObject(student);
//        oos.close();
        for (Field file : files) {
            file.setAccessible(true);
            String name = file.getName();
            Object value = file.get(obj);
            bw.write(name + "==" + value);
            bw.newLine();
            System.out.println(name + "==" + value);
        }
        bw.close();
        System.out.println("写入陈坤");
    }
}
