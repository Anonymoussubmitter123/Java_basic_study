import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> clazz = Class.forName("Student");
        Method[] methods = clazz.getMethods();  // 获取包括父类方法在内的所有公共方法
        Method[] methods1 = clazz.getDeclaredMethods();  // 获取本类的所有方法，包括私有方法
        Method eat = clazz.getDeclaredMethod("eat", String.class);  // 获取本类中指定的单一方法
        int modifiers = eat.getModifiers();  // 获取方法的修饰符
        String name = eat.getName();  // 获取方法的名字
        Parameter[] parameters = eat.getParameters();  // 获取方法的参数
        Class<?>[] exceptionTypes = eat.getExceptionTypes();  // 获取方法抛出的异常
        /*方法运行
            Method类中用于创建对象的方法
            object invoke(object obj, object. . . args):运行方法
            参数一:用obj对象调用该方法
            参数二:调用方法的传递的参数（如果没有就不写)
            返回值:方法的返回值（如果没有就不写）
        */
        Student student = new Student();
        Object str = eat.invoke(student, "汉堡包");
        System.out.println(str);
        System.out.println(Arrays.toString(exceptionTypes));
    }
}
