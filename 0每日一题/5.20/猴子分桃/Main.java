import java.util.Scanner;
  
public class Main {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(sc.hasNext()){
            n = sc.nextInt();
            if(n == 0)
                break;
            long a = (long)Math.pow(5, n);
            long b = (long)Math.pow(4, n);
            System.out.println((a-4)+" "+(b-4+n));
        }
    }
}

//注意必须要用long类型的数据来接收计算的结果，不然可能会导致计算结果过大，从而输出错误的答案，但是也不能使用double类型，因为输出就会有小数0，不符合题目要求