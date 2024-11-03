class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0){
            return 0;
        }
        Set<Integer> numSet = new HashSet<>();

        for(int num : nums){
            numSet.add(num);
        }

        int longestSequence = 0;

 
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentSequence = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentSequence++;
                }
                if(currentSequence>longestSequence){
                    longestSequence=currentSequence;
                }
            }
        }

        return longestSequence;
    }
}