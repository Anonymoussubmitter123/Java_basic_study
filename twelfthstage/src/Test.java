import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName("Student");  // 获取class字节码文件对象
        Constructor<?>[] cons = clazz.getConstructors();  // 获取构造方法，只能获得公共的
//        for (Constructor<?> con : cons) {
//            System.out.println(con);
//        }
        Constructor<?>[] cons2 = clazz.getDeclaredConstructors();  // 获取所有的构造方法，包括私有的
        Constructor<?> con1 = clazz.getDeclaredConstructor();  // 获取无参的
        System.out.println(con1);
        Constructor<?> con2 = clazz.getDeclaredConstructor(String.class);  // 获取参数为一个string的
        System.out.println(con2);
        Constructor<?> con3 = clazz.getDeclaredConstructor(int.class);
        System.out.println(con3);
        Constructor<?> con4 = clazz.getDeclaredConstructor(String.class, int.class);
        int modifiers = con4.getModifiers();  // 获取方法的权限修饰符
        Parameter[] parameters = con4.getParameters();  // 获取方法的所有参数
        System.out.println(Arrays.toString(parameters));
        System.out.println(con4);
        // （暴力反射）创建对象，如果是私有的需要加上con4.setAccessible(true);,表示临时取消权限的校验
        con4.setAccessible(true);
        Student student = (Student) con4.newInstance("zhangsan", 23);
    }
}
