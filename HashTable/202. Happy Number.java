class Solution {
    public boolean isHappy(int n) {
        int x=n,y=n;
        while(x>1){
            x=sqofdig(x);
            if(x==1)
                return true;
            y=sqofdig(sqofdig(y));
            if(y==1)
                return true;
            if(x==y)
                return false;
        }
        return true;
    }
    public int sqofdig(int n){
        int sum=0;
        while(n>0){
            sum+=Math.pow(n%10,2);
            n/=10;
        }
        return sum;
    }
}
