import java.util.Random;

public class MyRun implements Runnable {
    static int money = 100;
    int flag = 0;
    Random r = new Random();

    @Override
    public void run() {
        synchronized (MyRun.class) {
            if (flag >= 3) {
                System.out.println(Thread.currentThread().getName() + "什么都没抢到");
            } else if (flag < 2) {
                int hongBao = r.nextInt(50);
                System.out.println(Thread.currentThread().getName() + "抢到了" + hongBao + "元");
                money -= hongBao;
                flag++;
            } else {
                System.out.println(Thread.currentThread().getName() + "抢到了" + money + "元");
                flag++;
            }
        }
    }
}
