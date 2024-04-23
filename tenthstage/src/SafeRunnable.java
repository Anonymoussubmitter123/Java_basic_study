import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SafeRunnable implements Runnable {
    int ticket = 0;

    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        // 循环 - 同步代码块 - 判断是否到末尾
        while (true) {
            lock.lock();
            try {
                if (method()) break;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    private synchronized boolean method() {
        if (ticket == 100) {
            return true;
        } else {
            ticket++;
            System.out.println(Thread.currentThread().getName() + "zaimai" + ticket + "zhangpiao!!");
        }
        return false;
    }
}
