public class SafeThread extends Thread {
    static int ticket = 0;
//    static Object obj = new Object();

    public SafeThread() {
    }

    public SafeThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            // 同步代码块
//            synchronized (obj) {
            synchronized (SafeThread.class) {
                if (ticket < 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket++;
                    System.out.println(getName() + "在卖第" + ticket + "张票!");
                } else {
                    break;
                }
            }
        }
    }
}
