
import java.util.*;
public class TestDemo {
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

            int count=1;
            int flag=0;   //表示位：0表示相等，1表示递增，-1表示递减；
            for(int j=1;j<arr.length;j++){
                if(arr[j]>arr[j-1]){
                    if(flag==0){
                        flag=1;
                    }else if(flag==-1){
                        flag=0;    //表示不符合条件,count++，回复初始值，进行下次循环判断;
                        count++;
                    }
                }
                if(arr[j]<arr[j-1]){
                    if(flag==0){
                        flag=-1;
                    }else if(flag==1){
                        flag=0;   //表示不符合条件,count++，回复初始值，进行下次循环判断;
                        count++;
                    }
                }
            }
            System.out.println(count);




        }
    }
}

