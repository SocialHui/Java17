public class TestDemo {
    public static void main(String[] args) {
        //输出 1000 - 2000 之间所有的闰年
        for (int i = 1000; i <= 2000; i++) {
            if (i%4 == 0 && i%100 != 0) {
                System.out.println(i + " 是闰年");
            } else if (i%400 == 0){
                System.out.println(i + "是闰年");
            }
        }
    }
}
