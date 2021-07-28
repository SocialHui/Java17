class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        //遍历S，如果这个字母J里面存在，就将拥有宝石的个数++
        int num = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.contains(stones.charAt(i)+"")) {
                num++;
            }
        }
        return num;
    }
}