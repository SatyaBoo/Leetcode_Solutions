class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLen = 0;

        Map<Character, Integer> map = new HashMap<>();

        for(int right=0; right<s.length(); right++){
            char currentChar = s.charAt(right);

            if(map.getOrDefault(currentChar, -1) >= left){
                left = map.get(currentChar) + 1;
            }
            
            map.put(currentChar, right);
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
        
    }
}