public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz1 = Class.forName("Student");// 第一种方式，最为常用
        System.out.println(clazz1);

        Class<Student> clazz2 = Student.class;  // 第二种方式，一般作为参数传递
        System.out.println(clazz1 == clazz2);

        Student s = new Student();  // 第三种方式，有局限，需要有对象
        Class clazz3 = s.getClass();
        System.out.println(clazz3 == clazz1);
    }
}
