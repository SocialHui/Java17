import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            int[] data = new int[strs.length];
            for (int i = 0; i < strs.length; i++) {
                data[i] = Integer.parseInt(strs[i]);
            }
            Arrays.sort(data);
            if (data.length-2 >= 0) {
                System.out.println(data[data.length-2]);
            }
        }
    }
}