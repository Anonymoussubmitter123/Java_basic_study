public class MyThread extends Thread {
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "@" + i);
            Thread.yield();  // Thread类中的yield()方法用于将CPU 资源让给其他线程。
        }
    }
}
