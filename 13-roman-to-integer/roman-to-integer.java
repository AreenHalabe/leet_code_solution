class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> RomanMap = new HashMap<>();
        RomanMap.put('I', 1);
        RomanMap.put('V', 5);
        RomanMap.put('X', 10);
        RomanMap.put('L', 50);
        RomanMap.put('C', 100);
        RomanMap.put('D', 500);
        RomanMap.put('M', 1000);
        
        int result = 0;
        int length = s.length();
      
        for (int i = 0; i < length; i++) {
            int current = RomanMap.get(s.charAt(i));
            if (i < length - 1 && current < RomanMap.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }
        
        return result;
    }
}