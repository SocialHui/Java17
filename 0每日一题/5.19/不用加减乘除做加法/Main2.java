public class Solution {
    public int Add(int num1,int num2) {
        while (num2 != 0) {
            int tmp = num1&num2;
            tmp <<= 1;
            num1 = num1^num2;
            num2 = tmp;
        }
        return num1;
    }
}