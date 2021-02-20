

public class TestDemo {
    public static void main(String[] args) {
        String str = "   skjajd  kasujh dksjhdf  wkhef   ";
        System.out.println(countSegments(str));
    }

    public static int countSegments(String s) {
        s = s.trim();   //去除字符串的开头和结尾的空格
        if (s == null || s.isEmpty()) {
            return 0;
        }
        String[] strings = s.split(" ");
        int count = 0;
        for (int i = 0; i < strings.length; i++) {   //中间可能有很多被空格分隔开的空的字符串
            // if (!strings[i].equals("")) {
            //     count++;
            // }
            if (!strings[i].isEmpty()) {
                count++;
            }
        }
        return count;
    }
}