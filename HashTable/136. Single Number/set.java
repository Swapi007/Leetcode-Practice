class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int set_sum=0,nums_sum=0;
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
                set_sum+=nums[i];
            }
            nums_sum+=nums[i];
        }
        return 2*set_sum-nums_sum;   
    }
}
