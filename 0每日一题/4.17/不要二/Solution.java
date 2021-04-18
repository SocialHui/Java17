//把所有的行和列排成一行(与原来等价) 那么问题就变成了将蛋糕每隔一个空放一个 可以多少
import java.util.*;
public class Solution{

    public static int deal(int r, int c){
        int n=0;
        if(r%4==0||c%4==0){
            n=r*c/2;
        }else{                     //如果能整除4 那么蛋糕个数为网格个数的一半
             n=r*c/2+1;
        }              //不能被4整除 将蛋糕每隔一个空放一个 可以放多少 奇数的一半+1
        return n;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int r=sc.nextInt();   //列
            int c=sc.nextInt();   //行
            int res=deal(r,c);
            System.out.println(res);
        }
    }

}