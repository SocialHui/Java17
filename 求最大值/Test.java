public class Test {

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int n3 = 5;
        int max;
        max = max2(n1,n2);
        System.out.println(max);
        max = max3 (n3, max);
        System.out.println(max);
    }

    public static int max2 (int n1,int n2) {
        return n1>n2?n1:n2;
    }
    public static int max3 (int n3,int max) {
        return max2(n3,max);
    }


    //未按照要求写
    /*public static void main(String[] args) {
        //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
        //​ 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
        int n1 = 10;
        int n2 = 20;
        int n3 = 5;
        int max;
        max = max2(n1,n2);
        System.out.println("两个数中的最大值是: " + max);
        max = max3(n3,max);
        System.out.println("三个数中的最大值是：" + max);
    }

    public static int max2 (int n1,int n2) {
        return n1>n2?n1:n2;
    }

    public static int max3 (int n3, int max) {
        return n3>max?n3:max;
    }*/


    //这种方法写太繁琐
    /*public static void main1(String[] args) {
        //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
        //​ 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        int max;
        int max0;
        max = max2(n1, n2);   //两个数的最大值
        max0 = max3(n3,max2(n1, n2));     //三个数的最大值
        System.out.println("两个数中的最大值是：" + max);
        System.out.println("三个数中的最大值是：" + max0);
    }

    public static int max2 (int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    public static int max3 (int n3,int max) {
        if (n3 > max) {
            return n3;
        } else {
            return max;
        }
    }*/

}
