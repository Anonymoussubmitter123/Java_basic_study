import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test11 {
    public static void main(String[] args) throws InterruptedException {
        // 创建线程池
        ExecutorService pool1 = Executors.newCachedThreadPool();  // 无限大的线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);  // 有限大的线程池
        // 提交任务
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        // 销毁线程池
        pool.shutdown();
    }
}
