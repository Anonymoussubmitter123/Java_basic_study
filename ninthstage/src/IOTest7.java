import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class IOTest7 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("ninthstage\\src\\a.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        try (fr) {
            while ((ch = fr.read()) != -1) {
                sb.append((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Integer> list = Arrays.stream(sb.toString().split("-")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.sort(list);
        String s = list.toString();
        s = s.substring(1, s.length() - 1).replace(", ", "-");
        FileWriter fw = new FileWriter("ninthstage\\src\\c.txt");
        try (fw) {
            fw.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
