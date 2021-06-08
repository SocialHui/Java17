import java.util.*;

public class Main{
    public static void main(String[] args) {
        String symbol="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String number="222333444555666777788899991234567890";
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();   //代表有多少组数据
            sc.nextLine();
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String str = sc.nextLine();
                str = str.replace("-","");//将-全部替换
                String result = "";
                for (int j = 0; j < 7; j++) {
                    result += number.charAt(symbol.indexOf(str.charAt(j)+""));
                }
                result = result.substring(0,3)+"-"+result.substring(3,7);
                if (!list.contains(result)) {
                    list.add(result);
                }
            }
            Collections.sort(list);
            for (int j = 0; j < list.size(); j++) {
                System.out.println(list.get(j));
            }
            System.out.println();
        }
    }
}