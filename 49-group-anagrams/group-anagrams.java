class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();



        for(String word : strs){
            char[] array=word.toCharArray();
             Arrays.sort(array);

             String sortKey = new String(array);

            if(map.containsKey(sortKey)){
                map.get(sortKey).add(word);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(sortKey,list);
            }
        }

        for (List<String> listInMap : map.values()) {
            result.add(listInMap);
        }

        return result;
    }
}