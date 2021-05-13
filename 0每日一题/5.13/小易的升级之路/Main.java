import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();   //代表怪兽的数量
            int g = sc.nextInt();   //代表玩家的初始的能力值
            int[] num = new int[n];  //用来存放怪兽的能力值
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
                if (g > num[i] || g == num[i]) {
                    //代表可以打败刮手并且自己最终的战斗力增加
                    g += num[i];
                } else{
                    //也可以打败，这个时候去找最大公约数
                    int nu = yue(g,num[i]);
                    g += nu;
                }
            }
            System.out.println(g);
        }
    }

    //寻找最大公约数
    public static int yue(int a,int b){
        int min = Math.min(a,b);
        while (true) {
            if (a%min == 0 && b% min == 0) {
                return min;
            }
            min--;
        }
    }
}