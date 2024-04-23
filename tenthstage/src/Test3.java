import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*第三种，可以获得多线程运行的结果
         *  创建一个类实现Callable接口
         *  重写call（有返回值，表示多线程运行的结果）
         *  创建自己类的对象（表示多线程要执行的任务）
         *  创建FutureTask的对象（作用是管理多线程运行的结果）
         *  创建Thrad类的对象，并启动（表示线程）
         * */
        MyCallable myCallable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(myCallable);
        Thread thread1 = new Thread(futureTask);
        thread1.start();
        // 获取结果
        Integer result = futureTask.get();
        System.out.println(result);
    }
}