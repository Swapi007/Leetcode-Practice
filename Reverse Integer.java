class Solution {
    public int reverse(int x) {
        int absx=Math.abs(x);
        long revx=0;
        while(absx!=0){
            revx=revx*10+absx%10;
            if((revx>Integer.MAX_VALUE)||(revx<Integer.MIN_VALUE))
                return 0;
            absx/=10;
        }
        if(x<0)
            return -1*(int)revx;
        else
            return (int)revx;
    }
}
