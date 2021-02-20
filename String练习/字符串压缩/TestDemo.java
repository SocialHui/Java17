
public class TestDemo {

    public static void main(String[] args) {
        String str = "aaaaaaaaaa";
        String str1 = compressString(str);
        System.out.println(str1);
    }

    public static String compressString(String S) {

        if (S == null) {
            return null;
        }
        if (S.isEmpty()) {
            return S;
        }

        String str = new String();
        int count = 1;
        for (int i = 0; i < S.length(); i++) {
            count = 1;
            int j = i + 1;
            for (j = i + 1; j < S.length(); j++) {
                if (S.charAt(i) == S.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            str = str + S.charAt(i) + count;
            i = j - 1;
        }

        if (S.length() <= str.length()) {
            return S;
        }
        return str;
    }


    //内存和效率都变高了
    public static String compressString2(String S) {
        if (S.length() == 0) { // 空串处理
            return S;
        }
        StringBuffer ans = new StringBuffer();
        int cnt = 1;
        char ch = S.charAt(0);
        for (int i = 1; i < S.length(); ++i) {
            if (ch == S.charAt(i)) {
                cnt++;
            } else {
                ans.append(ch);
                ans.append(cnt);
                ch = S.charAt(i);
                cnt = 1;
            }
        }
        ans.append(ch);
        ans.append(cnt);
        return ans.length() >= S.length() ? S : ans.toString();
    }

}
