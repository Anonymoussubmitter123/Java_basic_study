public class Test {
    public static void main(String[] args) {
        MyRun myCallable = new MyRun();

        Thread thread1 = new Thread(myCallable, "女神");
        Thread thread2 = new Thread(myCallable, "备胎");
//        Thread thread3 = Thread.currentThread();
//        thread1.setPriority(10);
//        thread2.setPriority(1);
        // 线程结束了。守护线程也会陆陆续续结束
        thread2.setDaemon(true);

        thread2.start();
        thread1.start();
    }
}
