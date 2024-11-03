class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }

        if(nums[0]==0){
            return false;
        }
     int maxJump = 0;

        for(int i=0 ; i<nums.length ; i++){
            if (i > maxJump) {
            return false;
        }

            if(nums[i]+i > maxJump){
                maxJump = nums[i]+i;
            }

            if(maxJump >= nums.length-1 ){
                return true;
            }
            
        }

        return false;
    }
}