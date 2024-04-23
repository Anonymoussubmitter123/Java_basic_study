import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test12 {
    public static void main(String[] args) {
        // 自定义线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,  // 核心线程数
                6, // 最大线程数，  临时线程数 = 最大线程数 - 核心线程数
                60,
                TimeUnit.SECONDS,  // 临时线程的存活时间
                // 阻塞队列，new ArrayBlockingQueue<>(1)有限长度，new LinkedBlockingQueue<>()无限长度
                new ArrayBlockingQueue<>(1),
                Executors.defaultThreadFactory(),  // 创建线程工厂
                new ThreadPoolExecutor.AbortPolicy()  // 任务的拒绝策略
        );
        pool.submit(new MyRunnable());
        pool.shutdown();

        int count = Runtime.getRuntime().availableProcessors();
        System.out.println(count);
    }
}
