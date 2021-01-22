import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String n = stringBuffer.toString();
                if(!n.contains(ch + "")){
                    stringBuffer.append(ch);
                }
            }
            System.out.println(stringBuffer);
        }
    }
}
