class Solution {
    public String longestCommonPrefix(String[] strs) {
        if((strs.length==0)||(strs==null))
            return "";
        return longestCommonPrefix(strs,0,strs.length-1);
    }
    public String longestCommonPrefix(String[] strs,int l, int r){
        if(l==r)
            return strs[l];
        int mid=(l+r)/2;
        String leftlcp=longestCommonPrefix(strs,l,mid);
        String rightlcp=longestCommonPrefix(strs,mid+1,r);
        return commonPrefix(leftlcp,rightlcp);
    }
    public String commonPrefix(String left, String right){
        int min_length=Math.min(left.length(),right.length());
        for(int i=0;i<min_length;i++){
            if(left.charAt(i)!=right.charAt(i))
                return left.substring(0,i);
        }
        return left.substring(0,min_length);
    }
}
