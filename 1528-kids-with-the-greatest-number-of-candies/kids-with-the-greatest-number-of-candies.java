class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int maxCandy=0;
        for(int candy : candies){
            if(candy>maxCandy){
                maxCandy=candy;
            }
        }

         List<Boolean> finalResult = new ArrayList<>();

        for(int candy : candies){
            finalResult.add(candy+extraCandies >= maxCandy);
        }

        return finalResult;
    }
}