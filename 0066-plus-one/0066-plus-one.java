class Solution {
    public int[] plusOne(int[] digits) {
        int l=digits.length;
        digits[l-1]=digits[l-1]+1;
       
        if(digits[l-1]==10){
            for (int i=l-1;i>=0;i--){
                if(digits[i]==10){
                    if(i==0){
                        int[] arr=new int[l +1];
                        arr[0]=1;
                        arr[1]=0;
                        for(int j=2;j<arr.length;j++){
                            arr[j]=digits[j-1];
                        }
                    return arr;
                }
                else{
                    digits[i]=0;
                    digits[i-1]=digits[i-1]+1;
                }
                }
                else{
                    break;
                }
            }
        }
        return digits;
    }
}