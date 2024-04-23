import java.io.*;

public class IOTest9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("ninthstage\\src\\b.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("ninthstage\\src\\bzifu.txt"));

        try (br; bw) {
            String line = br.readLine();
            System.out.println(line);
            bw.write("我剑也未尝不利");
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
