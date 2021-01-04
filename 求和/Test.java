public class Test {
    public static void main(String[] args) {
        //求和的重载
        //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
        int n1 = 10;
        int n2 = 5;
        double n3 = 1.5;
        double n4 = 2.5;
        double n5 = 0.5;

        int ret = add(n1,n2);
        System.out.println(ret);

        double ret2 = add (n3,n4,n5);
        System.out.println(ret2);
    }

    public static int add (int n1,int n2) {
        return n1+n2;
    }

    public static double add (double n3, double n4, double n5) {
        return n3+n4+n5;
    }

}
