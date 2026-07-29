class Solution {
    public double findMaxAverage(int[] nums, int k) {
            int start=0;
            int end=k;
            int MaxSum=Integer.MIN_VALUE;
          while(end<=nums.length){
            int sum=0;
            for(int j=start;j<end;j++){
                sum=sum+nums[j]; 
            }
            if(MaxSum<sum){
                    MaxSum=sum;
                }
            start++;
            end++;
           }
            double res=(double)MaxSum/k;
        return res;
    }
}