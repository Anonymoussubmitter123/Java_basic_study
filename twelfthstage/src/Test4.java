import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        // 与配置文件结合,利用反射，动态的创建对象和运行方法
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("twelfthstage\\prop.yml");
        prop.load(fis);  // 读取配置文件中的信息
        System.out.println(prop);
        String classname = (String) prop.get("classname");
        String method = (String) prop.get("method");  // 获取全类名和方法名
        Student student = new Student("zhangsan", 23, "男");
        runMethod(classname, method);
    }

    private static void runMethod(String classname, String method) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InstantiationException {
        Class clazz = Class.forName(classname);
        Constructor con = clazz.getDeclaredConstructor(String.class, int.class, String.class);
        Student student = (Student) con.newInstance("zhangsan", 23, "男");  // 构建对象
        Method met = clazz.getDeclaredMethod(method);  // 获取成员方法
        met.setAccessible(true);
        String result = (String) met.invoke(student);  // 运行成员方法
        System.out.println(result);
    }
}
