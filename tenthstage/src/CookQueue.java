import java.util.concurrent.ArrayBlockingQueue;

public class CookQueue extends Thread {
    ArrayBlockingQueue queue;

    public CookQueue() {
    }

    public CookQueue(ArrayBlockingQueue queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        while (true) {
            try {
                queue.put("面条");
                System.out.println("厨师做了了一碗面条");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 获取
     *
     * @return queue
     */
    public ArrayBlockingQueue getQueue() {
        return queue;
    }

    /**
     * 设置
     *
     * @param queue
     */
    public void setQueue(ArrayBlockingQueue queue) {
        this.queue = queue;
    }

    public String toString() {
        return "CookQueue{queue = " + queue + "}";
    }
}
