import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int i = 0;
            while (i < n) {
                arr[i++] = sc.nextInt();
            }
            List<ArrayList<Integer>> list = new ArrayList<>();
            int left = -1;
            int right = -1;
            for (int m = 0; m < arr.length; m++) {
                ArrayList<Integer> list1 = new ArrayList<>();
                int number = arr[m];
                int j = m-1;
                //判断左边有没有
                while (j >= 0) {
                    if (arr[j] < number) {
                        left = j;
                        break;
                    }
                    j--;
                }
                list1.add(left);
                left = -1;

                //判断右边有没有比他小的
                j = m+1;
                while (j < arr.length) {
                    if (arr[j] < number) {
                        right = j;
                        break;
                    }
                    j++;
                }
                list1.add(right);
                right=-1;
                list.add(list1);
            }
            int x = 0;
            while (x != list.size()) {
                ArrayList<Integer> list2 = list.get(x++);
                System.out.print(list2.get(0));
                System.out.print(" ");
                System.out.print(list2.get(1));
                System.out.println();
            }
        }
    }
}