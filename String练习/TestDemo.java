import java.util.Arrays;

public class TestDemo {

    public static String reserve (String str) {
        char[] ch = str.toCharArray();
        int left = 0;
        int right = ch.length-1;
        while (left < right) {
            char tmp = ch[left];
            ch[left] = ch[right];
            ch[right] = tmp;
            left++;
            right--;
        }
        //return new String(ch);
        //return String.copyValueOf(ch);
        return String.valueOf(ch);
        //System.out.println(Arrays.toString(ch));
    }

    //逆置字符串
    public static void main(String[] args) {
        String str = "sheng";
        System.out.println(reserve(str));
    }

    public static void main4(String[] args) {
        char[] ch = {'s','h','e','n','g'};
        String str3 = new String(ch);
        String str2 = new String(ch,1,3);
        System.out.println(str3);
        System.out.println(str2);

        String str1 = "sheng";
        char c = str1.charAt(1);
        System.out.println(c);

        char[] ch1 = str1.toCharArray();
        System.out.println(Arrays.toString(ch1));
    }

    public static void main3(String[] args) {
        String str1 = "sheng";
        String str2 = new String("sheng");
        char[] ch = {'s','h','e','n','g'};
        String str3 = new String(ch);

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        System.out.println(str1.equals("sheng"));
        System.out.println("sheng".equals(str1));//这样更好
    }

    public static void main2(String[] args) {
        String str1 = "shenghui";

        String str2 = new String("shenghui").intern();
        System.out.println(str1 == str2);
    }

    public static void main1(String[] args) {
        String str1 = "shenghui";

        String str2 = new String("shenghui");

        char[] ch = {'s','h','e','n','g','h','u','i'};
        String str3 = new String(ch);

        //与内存有关
        System.out.println(str1 == str2);  //false
        System.out.println(str1 == str3);  //false
        System.out.println(str2 == str3);  //false
    }
}
