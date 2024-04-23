public class Test3 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);
        System.out.println(Runtime.getRuntime().availableProcessors());
        Object obj = new Object();
        String s = obj.toString();
        System.out.println(s);
    }
}
