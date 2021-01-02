import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //打印x图形
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 1;
        int m = 1;
        for (n = 1; n <= num ; n++){
            for (m = 1; m <= num ; m++){
                if (n == m ){
                    System.out.printf("*");
                } else if (n + m == num +1){
                    System.out.printf("*");
                }else {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
    }

    public static void main1(String[] args) {
        //根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 18){
            System.out.println("少年");
        }else if (age < 28){
            System.out.println("青年");
        }else if (age < 55){
            System.out.println("中年");
        }else{
            System.out.println("老年");
        }
    }
}
