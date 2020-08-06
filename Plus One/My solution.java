class Solution {
    public int[] plusOne(int[] digits) {
        return function(digits,digits.length-1);
    }
    public int[] function(int[] digits,int i){
        if((i==0)&&(digits[i]==9)){
            digits[i]=0;
            int arr[]=new int[digits.length+1];
            arr[0]=1;
            for(int j=1;j<arr.length;j++){
                arr[j]=digits[j-1];
            }            
            return arr;
        }
        else if(digits[i]==9){
            digits[i]=0;
            return function(digits,i-1);
        }
        else{
            digits[i]+=1;
            return digits;
        }
    }
}
