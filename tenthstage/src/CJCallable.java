import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class CJCallable implements Callable {
    List<Integer> list;

    public CJCallable() {
    }

    public CJCallable(List<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> boxList = new ArrayList<>();
        while (true) {
            synchronized (CJCallable.class) {
                if (list.size() == 0) {
                    System.out.println(Thread.currentThread().getName() + "抽到了" + boxList);
                    break;
                } else {
                    Collections.shuffle(list);
                    boxList.add(list.remove(0));
                }
            }
            Thread.sleep(10);
        }
        if (boxList.size() == 0) {
            return null;
        } else {
            return Collections.max(boxList);
        }
    }

    /**
     * 获取
     *
     * @return list
     */
    public List<Integer> getList() {
        return list;
    }

    /**
     * 设置
     *
     * @param list
     */
    public void setList(List<Integer> list) {
        this.list = list;
    }

    public String toString() {
        return "CJCallable{list = " + list + "}";
    }
}
