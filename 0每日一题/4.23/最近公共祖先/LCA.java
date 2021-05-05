import java.util.*;

public class LCA {
    public int getLCA(int a, int b) {
        // write code here
        //注意判断两个数字的祖先可能时其中的一个节点
        if (a<b) {
            b /= 2;
        } else if (a>b) {
            a /= 2;
        } else {
            //代表是两个数的公共祖先
            return a;
        }
        return getLCA(a,b);
    }
}