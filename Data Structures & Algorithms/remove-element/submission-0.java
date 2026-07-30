class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val || nums[i] == -1){
                if(nums[i] == val){
                    k--;
                }
                boolean found = false;
                int j;
                for(j = i + 1; j < nums.length; j++){
                    if(nums[j] != val && nums[j] != -1) {
                        nums[i] = nums[j];
                        nums[j] = -1;
                        found = true;
                        break;
                    }
                }
                if(!found) nums[i] = -1;
            }
        }
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        System.out.println("Length: "+k);
        return k;
    }
}