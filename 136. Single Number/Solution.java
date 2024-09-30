class Solution {
    public int singleNumber(int[] nums) {
        int singleElement = 0;
        for (int i = 0; i < nums.length; i++) {
            singleElement ^= nums[i];
        }
        return singleElement;
    }
}
