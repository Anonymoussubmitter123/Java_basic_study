public class Test4 {
    public static void main(String[] args) {
        int[] data = {0, 1, 2, 3};
        User u1 = new User("zhangshan", 001, "1234567", "d", data);

        try {
            User u2 = (User) u1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
