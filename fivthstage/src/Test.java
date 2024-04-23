public class Test {
    public static void main(String[] args) {
        int x = 1256;
        int flag = 0;

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i != 0) {
                flag = 1;
            }
        }
        choose:
        switch (flag) {
            case 1:
                System.out.println("不是");
                break choose;
            case 0:
                System.out.println("是");
                break choose;
        }
    }
}
