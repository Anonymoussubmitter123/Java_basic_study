import java.io.File;

public class FileTest3 {
    public static void main(String[] args) {
//        File f1 = new File("ninthstage\\src\\a.txt");
//        try {
//            System.out.println(f1.createNewFile());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        File f2 = new File("D:\\disk\\aaa");
//        System.out.println(Arrays.toString(f2.listFiles((File dir, String name) ->
//                name.endsWith(".avi")
//        )));

        // 找到电脑中所有以“”结尾的文件，套路：进入文件，遍历数组，判断，判断

        File src = new File("C:\\");
        findAVI(src);
    }

    public static void findAVI(File src) {
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                String name = file.getName();
                if (file.isFile()) {
                    if (name.endsWith(".avi")) {
                        System.out.println(file);
                    }
                } else {
                    findAVI(file);
                }
            }
        }
    }
}
