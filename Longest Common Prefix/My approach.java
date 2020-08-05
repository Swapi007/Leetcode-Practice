class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        if(strs.length<1)
            return s;
        int min_length=strs[0].length();
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min_length)
                min_length=strs[i].length();
        }
        for(int i=0;i<min_length;i++){
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=strs[0].charAt(i))
                    return s;
            }
            s=s.concat(String.valueOf(strs[0].charAt(i)));
        }
        return s;
    }
}
