package URLify;

public class URLify {

    public static void main(String[] args) {
        String str = "Mr           John Smith  ";
        str = str.trim().replaceAll("\\s", "%20");

        System.out.println(str);
    }
}
