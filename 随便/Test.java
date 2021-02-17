public class Test {
    public static void main(String[] args) {
        //求最大值方法的重载
        //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
        int n1 = 1;
        int n2 = 2;
        double n3 = 3.0;
        double n4 = 0.5;

        int max = max1(n1, n2);
        System.out.println(max);

        double max2 = max1(n3,n4);
        System.out.println(max2);

        double max3 = max1(n3,n4,n1);
        System.out.println(max3);
    }

    public static int max1 (int n1, int n2) {
        return n1>n2?n1:n2;
    }

    public static double max1 (double n3,double n4) {
        return n3>n4?n3:n4;
    }

    public static double max1 (double n3,double n4,int n1) {
        double max = max1(n3,n4);
        return max>n1?max:n1;
    }
}
