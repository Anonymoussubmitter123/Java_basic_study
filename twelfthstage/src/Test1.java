import java.lang.reflect.Field;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = Class.forName("Student");
        Field[] fields1 = clazz.getFields();  // 获取公共的成员变量
        Field[] fields = clazz.getDeclaredFields();  // 获取所有的成员变量
        Field name = clazz.getDeclaredField("name");
        int modifiers = name.getModifiers();  // 获取成员变量的权限修饰符
        String n = name.getName();  // 获取成员变量的名字
        Class<?> type = name.getType();   // 获取成员变量的数据类型
        Student student = new Student("zhangsan", 23, "nan");
        // 获取成员变量的值，同样需要有对象，并且设置临时权限
        name.setAccessible(true);
        Object vlaue = name.get(student);
        System.out.println(student);
        name.set(student, "lisi");  // 修改成员变量的值
        System.out.println(student);
    }
}
