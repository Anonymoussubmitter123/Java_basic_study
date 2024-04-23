public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];

        Goods goods1 = new Goods("001", "华为p40", 5999, 100);
        Goods goods2 = new Goods("002", "保温杯", 227, 50);
        Goods goods3 = new Goods("003", "枸杞", 12.7, 70);
        
        arr[0] = goods1;
        arr[1] = goods2;
        arr[2] = goods3;
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId() + ", " + goods.getName());
        }
    }
}
