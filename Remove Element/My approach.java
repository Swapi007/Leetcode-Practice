class Solution {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int len=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                nums[i]=nums[len-1];
                len--;
            }
        }
        return len;
    }
}
