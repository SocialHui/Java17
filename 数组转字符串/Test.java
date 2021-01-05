
public class Test {
    public static void main(String[] args) {
        //实现一个方法 toString, 把一个整型数组转换成字符串.
        //例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
        int[] arr = {1,2,3,4,5};
        String str = "[";
        String str1 = toString(arr,str);
        System.out.println(str1);
    }

    public static String toString(int[] arr,String str) {
        for (int i = 0; i < arr.length ; i++) {
            str += arr[i];
            if (i == arr.length-1) {
                str += "]";
            } else {
                str += ",";
            }
        }
        return str;
    }

}
