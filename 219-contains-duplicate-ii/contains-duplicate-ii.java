class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      HashMap<Integer,Integer> indices = new HashMap<Integer , Integer>();
      int index;
      for(int i=0 ; i<nums.length ; i++){
        
        if(indices.containsKey(nums[i])){
            index = indices.get(nums[i]);

            if (i - index <= k) {
                return true;
            }
        
        }
        
            indices.put(nums[i],i);
        
      }

      return false;  
    }
}