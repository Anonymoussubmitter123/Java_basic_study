import java.util.concurrent.atomic.AtomicInteger;

public class Foo {

    private AtomicInteger fisrtFlag = new AtomicInteger(0);
    private AtomicInteger secondFlag = new AtomicInteger(0);

    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        fisrtFlag.incrementAndGet();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (fisrtFlag.get() != 1) {
        }
        synchronized (Foo.class) {
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            secondFlag.incrementAndGet();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (secondFlag.get() != 1) {
        }
        synchronized (Foo.class) {
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
    }
}