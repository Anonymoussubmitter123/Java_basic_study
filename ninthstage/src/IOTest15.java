import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class IOTest15 {
    public static void main(String[] args) throws IOException {
        String familyNameNet = "https://hanyu.baidu.com/s?wd=%E7%99%BE%E5%AE%B6%E5%A7%93&from=poem";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";
        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);

        ArrayList<String> familyNameTempList = getData(familyNameStr, "([\\u4E00-\\u9FA5]{4})(，|。)", 1);
        ArrayList<String> boyNameTempList = getData(boyNameStr, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
        ArrayList<String> girlNameTempList = getData(girlNameStr, "([\\u4E00-\\u9FA5]{2} ){4}..", 0);

        ArrayList<String> familyNameList = new ArrayList<>();
        for (String s : familyNameTempList) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                familyNameList.add(c + "");
            }
        }
        Set<String> boyNameSet = new HashSet<>();
        for (String s : boyNameTempList) {
            boyNameSet.add(s);
        }
        List<String> boyNameList1 = boyNameSet.stream().collect(Collectors.toList());
        ArrayList<String> boyNameList = (ArrayList<String>) boyNameList1;

        ArrayList<String> girlNameList = new ArrayList<>();
        for (String s : girlNameTempList) {
            String[] arr = s.split(" ");
            for (int i = 0; i < arr.length; i++) {
                girlNameList.add(arr[i]);
            }
        }
        ArrayList<String> list = getInfo(familyNameList, boyNameList, girlNameList, 70, 50);
        Collections.shuffle(list);
        System.out.println(list);

        BufferedWriter bw = new BufferedWriter(new FileWriter("ninthstage\\src\\shenme.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }

    public static String webCrawler(String net) throws IOException {
        StringBuilder sb = new StringBuilder();
        URL url = new URL(net);
        URLConnection conn = url.openConnection();
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }
        isr.close();
        return sb.toString();
    }

    public static ArrayList<String> getData(String str, String regex, int index) {
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);  // 制定一个规则
        Matcher matcher = pattern.matcher(str);  // 创建一个matcher对象，并告知他规则
        while (matcher.find()) {  // 让他去找符合规则的数据
            String group = matcher.group(index);  // 保存符合规则的数据
            list.add(group);
        }
        return list;
    }

    public static ArrayList<String> getInfo(ArrayList<String> family, ArrayList<String> boyName, ArrayList<String> girlName, int boyCount, int girlCount) {
        HashSet<String> boyhs = new HashSet<>();
        while (true) {
            if (boyhs.size() == boyCount) {
                break;
            } else {
                Collections.shuffle(family);
                Collections.shuffle(boyName);
                boyhs.add(family.get(0) + boyName.get(0));
            }
        }
        HashSet<String> girlhs = new HashSet<>();
        while (true) {
            if (girlhs.size() == girlCount) {
                break;
            } else {
                Collections.shuffle(family);
                Collections.shuffle(girlName);
                girlhs.add(family.get(0) + girlName.get(0));
            }
        }
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (String boy : boyhs) {
            int age = r.nextInt(9) + 18;
            list.add(boy + "-男-" + age);
        }
        for (String girl : girlhs) {
            int age = r.nextInt(7) + 18;
            list.add(girl + "-女-" + age);
        }
        return list;
    }
}
