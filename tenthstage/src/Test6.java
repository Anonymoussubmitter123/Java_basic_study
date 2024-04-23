public class Test6 {
    public static void main(String[] args) {
        SafeRunnable sr = new SafeRunnable();

        Thread t1 = new Thread(sr, "窗口1");
        Thread t2 = new Thread(sr, "窗口2");
        Thread t3 = new Thread(sr, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
