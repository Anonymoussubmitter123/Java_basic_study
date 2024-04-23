public class Test1 {
    public static void main(String[] args) {
        /*第一种
         * 自己定义一个类继承Thread
         * 重写run方法
         * 创建子类的对象，启动多线程
         * */
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.setName("线程1");
        myThread2.setName("线程2");

        myThread1.start();
        myThread2.start();
    }
}
