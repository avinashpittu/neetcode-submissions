class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int max=0;
        int left =0;

        for (char c: s.toCharArray()){
            
            
           while(set.contains(c)){ 
                set.remove(s.charAt(left));
                left=left+1;

            }
            set.add(c);
            max = Math.max(max, set.size());

        }
        return max;
    }
}
