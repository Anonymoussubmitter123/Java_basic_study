public class Test7 {
    public static void main(String[] args) {
        // 等待唤醒机制，生产者和消费者

        Cook c = new Cook();
        Foodie f = new Foodie();
        c.setName("厨师");
        f.setName("吃货");
        c.start();
        f.start();
    }
}
