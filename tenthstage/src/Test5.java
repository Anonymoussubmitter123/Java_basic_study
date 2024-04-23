public class Test5 {
    public static void main(String[] args) {
        SafeThread st1 = new SafeThread("窗口1");
        SafeThread st2 = new SafeThread("窗口2");
        SafeThread st3 = new SafeThread("窗口3");

        st1.start();
        st2.start();
        st3.start();
    }
}
