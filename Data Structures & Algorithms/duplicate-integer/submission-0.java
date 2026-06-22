class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> map = new HashSet<Integer>();

        for( int i : nums){

            if(map.contains(i)){
                return true;
            }

            map.add(i);
        }
        return false;
 
    }
}
