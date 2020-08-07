class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> list1=new ArrayList<>();
            list1.add(1);
            for(int j=1;j<i;j++){
                list1.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            if(i!=0)
                list1.add(1);
            list.add(list1);
        }
        return list.get(rowIndex);
    }
}
