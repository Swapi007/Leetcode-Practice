class Solution {
    public int[] twoSum(int[] nums, int target) {
        int idx[]=new int[2];
        for(int i=0;i<nums.length-1;i++){
            int a=nums[i];
            int b=target-a;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==b){
                    idx[0]=i;
                    idx[1]=j;
                }
            }
        }
        return idx;
    }
}
