import java.util.concurrent.ArrayBlockingQueue;

public class FoodieQueue extends Thread {
    ArrayBlockingQueue<String> queue;

    public FoodieQueue() {
    }

    public FoodieQueue(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("吃货吃了一碗面条");
        }
    }

    /**
     * 获取
     *
     * @return queue
     */
    public ArrayBlockingQueue<String> getQueue() {
        return queue;
    }

    /**
     * 设置
     *
     * @param queue
     */
    public void setQueue(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    public String toString() {
        return "FoodieQueue{queue = " + queue + "}";
    }
}
