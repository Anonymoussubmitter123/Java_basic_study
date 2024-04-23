import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test10 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);

        CJCallable cc = new CJCallable(list);
        FutureTask<Integer> ft1 = new FutureTask<>(cc);
        FutureTask<Integer> ft2 = new FutureTask<>(cc);

        Thread t1 = new Thread(ft1, "抽奖箱1");
        Thread t2 = new Thread(ft2, "抽奖箱2");

        t1.start();
        t2.start();

        Integer max1 = ft1.get();
        Integer max2 = ft2.get();
        System.out.println(max1 > max2 ? max1 : max2);
//        CJThread t1 = new CJThread(list);
//        CJThread t2 = new CJThread(list);
//
//        t1.setName("抽奖箱1");
//        t2.setName("抽奖箱2");
//
//        t1.start();
//        t2.start();
    }
}
