import java.util.function.IntConsumer;

class FizzBuzz {
    private int n;
    private volatile int count = 1;
    //    private AtomicInteger count = new AtomicInteger(0);

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while (count <= n) {
            synchronized (FizzBuzz.class) {
                while ((count % 3 != 0 || count % 15 == 0)) {
                    wait();
                }
                if (count <= n) printFizz.run();
                else return;
                count++;
                notifyAll();
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while (count <= n) {
            synchronized (FizzBuzz.class) {
                while ((count % 5 != 0 || count % 15 == 0)) {
                    wait();
                }
                if (count <= n) printBuzz.run();
                else return;
                count++;
                notifyAll();
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (count <= n) {
            synchronized (FizzBuzz.class) {
                while ((count % 15 != 0)) {
                    wait();
                }
                if (count <= n) printFizzBuzz.run();
                else return;
                count++;
                notifyAll();
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while (count <= n) {
            synchronized (FizzBuzz.class) {
                while (count % 3 == 0 || count % 5 == 0) {
                    wait();
                }
                if (count <= n) printNumber.accept(count);
                else return;
                count++;
                notifyAll();
            }
        }
    }
}