public class Solution {
    public int Sum_Solution(int n) {
        boolean flag = (n > 0) && ((n += Sum_Solution(n-1)) > 0);   //与运算，一旦前面的条件为假，后面的代码就不会继续执行了
        return n;
    }
}