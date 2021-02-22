import java.util.ArrayList;

public class TestDemo{
    public static void main(String[] args) {
        ArrayList<Character> arrayList = new ArrayList<>();
        String str1 = "welcome to bit";
        String str2 = "come";
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (!str2.contains(ch+"")) {
                arrayList.add(ch);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
        }
        System.out.println();
        System.out.println(arrayList);
    }
}

