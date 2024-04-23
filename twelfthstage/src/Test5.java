public class Test5 {
    public static void main(String[] args) {
        BigStar bigStar = new BigStar("jige");
        Star proxy = ProxyUtil.createProxy(bigStar);
        String result = proxy.sing("只因你太美");
        System.out.println(result);

        proxy.dance();
    }
}
