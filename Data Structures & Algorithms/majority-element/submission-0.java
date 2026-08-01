class Solution {
    public int majorityElement(int[] nums) {
        int[] bits = new int[32];
        for(int num: nums){
            for(int i = 0; i < 32; i++){
                bits[31 - i] += (num >>> i) & 1;
            }
        }
        int element = 0;
        for(int i = 0; i < 32; i++){
            if(bits[i] > nums.length / 2){
                element |= 1 << 31 - i;
            }
        }
        return element;
    }
}