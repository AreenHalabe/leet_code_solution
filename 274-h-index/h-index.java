class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int size = citations.length;
        int hIndex = 0;
        for (int i = 0; i < size; i++) {
            int h = size - i;  
            if (citations[i] >= h) {
                hIndex = h;
                break;
            }
        }
        return hIndex;
    }
}