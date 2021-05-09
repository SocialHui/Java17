import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] strs = str.split("-");
            String[] str1 = strs[0].split(" ");
            String[] str2 = strs[1].split(" ");


            if (strs[0].equals("joker JOKER") || strs[0].length() == 7 || strs[1].equals("joker JOKER") || strs[1].length() == 7) {
                //代表两副牌里面有炸弹或者王炸
                if (strs[0].equals("joker JOKER") || strs[1].equals("joker JOKER")) {
                    //代表其中有王炸，王炸最大
                    System.out.println("joker JOKER");
                } else if (strs[0].length() == 7 && strs[1].length() == 7) {
                    //代表两个都是炸弹
                    if (strs[0].charAt(0) > strs[1].charAt(0)) {
                        System.out.println(strs[0]);
                    } else {
                        System.out.println(strs[1]);
                    }
                } else {
                    if (strs[0].length() == 7) {
                        System.out.println(strs[0]);
                    } else {
                        System.out.println(strs[1]);
                    }
                }
            } else if (str1.length == str2.length){
                //注意个子 A和10

                //可能是个子，对子，三个或者是顺子

                /**
                 * 错误的原因：A不能转换成数字和数字进行比较
                 */
                //Integer.parseInt(str1[0]) > Integer.parseInt(str2[0])) {
                if (Integer.parseInt(str1[0]) > Integer.parseInt(str2[0])) {

                    System.out.println(strs[0]);
                } else {
                    System.out.println(strs[1]);
                }

            } else {
                //代表不可以比较
                System.out.println("ERROR");
            }
        }
    }
}