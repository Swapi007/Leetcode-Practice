class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int xabs=Math.abs(x);
        int rev=0;
        while(xabs>0){
            rev=rev*10+xabs%10;
            xabs/=10;
        }
        return (x==rev);
    }
}
