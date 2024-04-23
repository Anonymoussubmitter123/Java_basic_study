import java.util.concurrent.ArrayBlockingQueue;

public class Test8 {
    public static void main(String[] args) {
        // 阻塞队列机制

        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        CookQueue cq = new CookQueue(queue);
        FoodieQueue fq = new FoodieQueue(queue);

        cq.start();
        fq.start();
    }
}
