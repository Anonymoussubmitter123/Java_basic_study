import java.io.Serializable;

public class Actor implements Serializable { // 没有抽象方法的接口叫做标记接口，Serializable表示当前javabean类可以被序列化
    private String name;
    private int age;
    private transient String address;  //瞬态关键字

    public Actor() {
    }

    public Actor(String str) {
        String[] arr = str.split("-");
        String name = arr[0];
        int age = Integer.parseInt(arr[1]);
        this.name = name;
        this.age = age;
    }

    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        if (age < 18 || age > 40) {
//            throw new RuntimeException();
            this.age = age;
        } else {
            this.age = age;
        }
    }

    public String toString() {
        return "Actor{name = " + name + ", age = " + age + "}";
    }


}
