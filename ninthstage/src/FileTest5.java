import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileTest5 {
    public static void main(String[] args) {
        File f1 = new File("D:\\disk\\aaa");
        Map<String, Integer> map = getNum(f1);
        System.out.println(map);
    }

    public static Map<String, Integer> getNum(File src) {
        Map<String, Integer> map = new HashMap<>();
        File[] files = src.listFiles();
        // 遍历数组
        for (File file : files) {
            //判断：如果是文件
            if (file.isFile()) {
                String name = file.getName();
                String[] arr = name.split("\\.");
                if (arr.length >= 2) {
                    String endName = arr[arr.length - 1];
                    if (map.containsKey(endName)) {
                        int count = map.get(endName);
                        map.put(endName, ++count);
                    } else {
                        map.put(endName, 1);
                    }
                }
            } else {
                //如果是文件夹
                Map<String, Integer> sonMap = getNum(file);
                Set<String> keys = sonMap.keySet();
                for (String key : keys) {
                    if (map.containsKey(key)) {
                        int num = map.get(key);
                        map.put(key, num + sonMap.get(key));
                    } else {
                        map.put(key, sonMap.get(key));
                    }
                }
            }
        }
        return map;
    }
}
