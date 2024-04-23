import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class IOTest16 {
    public static void main(String[] args) throws IOException {
        String familyNameNet = "https://hanyu.baidu.com/s?wd=%E7%99%BE%E5%AE%B6%E5%A7%93&from=poem";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        String famlilyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        List<String> familyNameTempList = ReUtil.findAll("([\\u4E00-\\u9FA5]{4})(，|。)", famlilyNameStr, 1);
        List<String> boyNameTempList = ReUtil.findAll("([\\u4E00-\\u9FA5]{2})(、|。)", boyNameStr, 1);
        List<String> girlNameTempList = ReUtil.findAll("([\\u4E00-\\u9FA5]{2} ){4}..", girlNameStr, 0);

        Properties prop = new Properties();
        Properties prop1 = new Properties();
        prop.put("a", "nnn");
        prop.put("b", "nnn");
        prop.put("c", "nnn");

        FileOutputStream fos = new FileOutputStream("ninthstage\\src\\wokankan.txt");
        FileInputStream fis = new FileInputStream("ninthstage\\src\\wokankan.txt");
        try (fos) {
            prop.store(fos, "test");
        } catch (IOException e) {
            e.printStackTrace();
        }
        prop1.load(fis);
        fis.close();
        System.out.println(prop1);
    }
}
