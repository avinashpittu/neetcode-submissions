class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> dict = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int t = target - nums[i];
            if(dict.containsKey(nums[i])){
                return(new int[]{dict.get(nums[i]), i });
            }
            dict.put(t,i);
        }
        return new int[]{};
    }
}
