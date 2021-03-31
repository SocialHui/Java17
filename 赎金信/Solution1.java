class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] nums = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            nums[ch-'a']++;
        }
        int[] nums1 = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            nums1[ch-'a']++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums1[i]) {
                return false;
            }
        }
        return true;
    }
}
