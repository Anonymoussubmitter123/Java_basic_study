public class Test1 {
    public static void main(String[] args) {
        Actor[] arr = new Actor[3];
        Actor actor = new Actor();
        actor.setAge(53);
        try {
            System.out.println(arr[10]);
            System.out.println(2 / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        int[] arrInt = {};
        try {
            int max = getMax(arrInt);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("看看我执行了吗");

    }

    public static int getMax(int[] arrInt) {
        if (arrInt == null) {
            throw new NullPointerException();
        }
        int max = arrInt[0];
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] > max) {
                max = arrInt[i];
            }
        }
        return max;
    }
}
