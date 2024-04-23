import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IOTest14 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\饭碗\\java入门\\入门\\basic_study\\ninthstage\\src\\wokankan.txt");
        File dest = new File("D:\\饭碗\\java入门\\入门\\basic_study\\ninthstage\\src\\copy.txt");
//        // Commons-io  工具包
//        FileUtils.copyFile(src, dest);
//        FileUtils.copyDirectory(src, dest);

        // hutool 工具包
        File file = FileUtil.file("ninthstage", "src", "wokankan.txt");
        System.out.println(file);

        File touch = FileUtil.touch((file));
        System.out.println(touch);

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "ASDASDASFAfasf", "dasfadsf");
        FileUtil.writeLines(list, file, "utf-8");

        FileUtil.appendLines(list, file, "utf-8");
        System.out.println(file);
        List<String> list1 = FileUtil.readLines(file, "utf-8");
        System.out.println(list1);
    }
}
