class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<1)
            return 0;
        int elem=1,j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                elem++;
                nums[j]=nums[i];
                j++;
            }
        }
        return elem;
    }
}
