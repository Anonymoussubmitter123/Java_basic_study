public class Test4 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("飞机");
        MyThread t2 = new MyThread("坦克");

        t1.start();
        t2.start();

        t1.join();

//        Thread t = Thread.currentThread();s
//        System.out.println(t.getName());

        System.out.println("什么？");
        Thread.sleep(5000);
        System.out.println("我看看怎么个事？");

    }
}
