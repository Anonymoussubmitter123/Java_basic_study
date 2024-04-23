public class Test9 {
    public static void main(String[] args) {
        MyRun mr = new MyRun();

        Thread t1 = new Thread(mr, "玩家1");
        Thread t2 = new Thread(mr, "玩家2");
        Thread t3 = new Thread(mr, "玩家3");
        Thread t4 = new Thread(mr, "玩家4");
        Thread t5 = new Thread(mr, "玩家5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
