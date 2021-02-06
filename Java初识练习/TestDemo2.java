public class TestDemo {
    public static void main(String[] args) {
        //打印 1 - 100 之间所有的素数
        for (int i = 1; i < 101; i++) {
            int tmp = 0;
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    //代表不是素数
                    tmp = 1;
                    break;
                }
            }
            if (tmp == 0){
                System.out.println(i+"是素数");
            }
        }
    }
}
