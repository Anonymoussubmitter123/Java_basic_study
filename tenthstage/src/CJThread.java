import java.util.ArrayList;
import java.util.Collections;

public class CJThread extends Thread {
    ArrayList<Integer> list;

    public CJThread() {
    }

    public CJThread(ArrayList list) {
        this.list = list;
    }

    @Override
    public void run() {
        ArrayList<Integer> boxList = new ArrayList<>();
        while (true) {
            synchronized (CJThread.class) {
                if (list.size() == 0) {
                    System.out.println(Thread.currentThread().getName() + "抽到了" + boxList);
                    break;
                } else {
                    Collections.shuffle(list);
                    boxList.add((Integer) list.remove(0));
//                    System.out.println(Thread.currentThread().getName() + "抽到了" + prize);
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 获取
     *
     * @return list
     */
    public ArrayList getList() {
        return list;
    }

    /**
     * 设置
     *
     * @param list
     */
    public void setList(ArrayList list) {
        this.list = list;
    }

    public String toString() {
        return "CJThread{list = " + list + "}";
    }
}
