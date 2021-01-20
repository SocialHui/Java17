import java.util.Scanner;

public class TestDemo {

    public static void main(String[] args) {
        //输入abc  def    输出abcdef
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        System.out.println(str1 + str2);
        //System.out.println(scanner.next()+scanner.next());

    }

    public static void main2(String[] args) {
        String str = "helloworld";
        System.out.println(str.replace("l","myword"));
        System.out.println(str.replaceFirst("l","myword"));
    }

    public static void main1(String[] args){
        String str = "hello world hello=bit";
        String[] str1 = str.split(" |=");
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }
    }
}
