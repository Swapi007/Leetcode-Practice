class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int element=0;
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]))
                hm.put(nums[i],2);
            else
                hm.put(nums[i],1);
        }
        for(Map.Entry<Integer,Integer> set: hm.entrySet()){
            if(set.getValue()==1)
                element=set.getKey();
        }
        return element;
    }
}
