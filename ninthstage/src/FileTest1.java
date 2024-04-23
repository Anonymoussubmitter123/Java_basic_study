import java.io.File;

public class FileTest1 {
    public static void main(String[] args) {
//        String str = "D:\\disk\\a.txt";
//        File f1 = new File(str);
//        System.out.println(f1);
//
//        String parent = "D:\\disk";
//        String child = "a.txt";
////        File f2 = new File(parent, child);
////        System.out.println(f2);
//
//        File par = new File("D:\\disk");
//        File chi = new File("a.txt");
//        File par_chi = new File(par, child);
//        System.out.println(par_chi);

        File file1 = new File("D:\\disk\\aaa");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.length());
        System.out.println("----------------------------------");

        File file2 = new File("D:\\disk\\aaa\\a.txt");
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
        System.out.println(file2.exists());
        System.out.println(file2.length());

        System.out.println(file2.getAbsoluteFile());
        System.out.println(file2.getName());
    }
}
