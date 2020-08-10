class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]))
                hm.put(nums[i],hm.get(nums[i])+1);
            else
                hm.put(nums[i],1);
        }
        int majority=hm.get(nums[0]);
        int majority_element=nums[0];
        for(Map.Entry<Integer,Integer> set : hm.entrySet()){
            if(set.getValue()>majority){
                majority=set.getValue();
                majority_element=set.getKey();
                }
        }
        return majority_element;
    }
}
