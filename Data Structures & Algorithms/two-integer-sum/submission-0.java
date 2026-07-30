class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hashMap.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(target - nums[i])){
                int value = hashMap.get(target - nums[i]);
                if(value == i) continue;
                return new int[]{i, value};
            }
        }
        return new int[]{-1, -1};
    }
}
