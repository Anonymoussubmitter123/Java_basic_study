public class Test2 {
    public static void main(String[] args) {
        /*第二种
         * 自己定义一个类实现Runnable接口
         * 重写run方法
         * 创建自己类的对象
         * 创建Thread的对象，
         * */
        MyRun myRun1 = new MyRun();
        MyRun myRun2 = new MyRun();
        Thread thread1 = new Thread(myRun1);
        Thread thread2 = new Thread(myRun2);

        thread1.setName("线程1");
        thread2.setName("线程2");
        
        thread1.start();
        thread2.start();
    }
}