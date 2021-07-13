import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num=sc.nextInt();
            int arr[]=new int[num];
            int i=0;
            while(i<num){
                arr[i]=sc.nextInt();
                i++;
            }
            int j = 1;
            int count = 0;
            while (j < arr.length) {
                if (arr[j] > arr[j-1]) {
//递增
                    while (j < arr.length && arr[j] > arr[j-1]) {
                        j++;
                    }
                    while (j < arr.length && arr[j] == arr[j-1]) {
                        j++;
                    }
                    if (j != arr.length-1) {
                        j++;
                    }
                    count++;
                } else if (arr[j] < arr[j-1]) {
//递减
                    while (j < arr.length && arr[j] < arr[j-1]) {
                        j++;
                    }
                    while (j < arr.length && arr[j] == arr[j-1]) {
                        j++;
                    }
                    if (j != arr.length-1) {
                        j++;
                    }
                    count++;
                } else {
//相等
                    while (j < arr.length && arr[j] == arr[j-1]) {
                        j++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}