import java.util.Scanner;
public class Test {
    public static void main3(String[] args) {
        //替换所有的问号
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str.replace("?", ""));
    }

    public static void main2(String[] args) {
        //统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
        //请注意，你可以假定字符串里不包括任何不可打印的字符。
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] str1 = str.split(" ");
        int num = str1.length;
        System.out.println(num);
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1 = str.replace(" ","");
        System.out.println(str1);
    }
}
