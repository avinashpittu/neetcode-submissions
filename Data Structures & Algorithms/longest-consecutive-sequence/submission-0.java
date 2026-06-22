
class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> h = new HashSet<Integer>();

        for(int n : nums){
            if(h.add(n));
        }
        int longest =0;

        for(Integer i: h){
            if(!h.contains(i-1)){
                int count=1;
                while(h.contains(i+count)){
                    count+=1;  
                }

                longest = Math.max(longest, count);
            }
        }
    return longest;

        
    }
}
