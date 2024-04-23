import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest4 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("ninthstage\\src\\zhongwen.txt");
            FileWriter fw = new FileWriter("ninthstage\\src\\shenme.txt", true);
//            //  一次读取一个数据
//            int ch;
//            while ((ch = fr.read()) != -1) {
//                System.out.print((char) ch);
//            }
            // 一次写一个字符
            fw.write(25105);
            // 一次写一个字符串（常用）
            fw.write("我剑也未尝不利");
            fw.close();

            char[] chars = new char[6];
            int len;
            while ((len = fr.read(chars)) != -1) {
                System.out.println(chars);
                System.out.println(len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
