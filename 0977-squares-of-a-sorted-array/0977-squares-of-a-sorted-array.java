class Solution {
    public int[] sortedSquares(int[] nums) {
      int left=0;
      int right=nums.length-1;
      int [] res =new int[nums.length];
      int k=res.length-1;
      while(left<=right){

        if(nums[right]*nums[right]>nums[left]*nums[left]){
            res[k]=nums[right]*nums[right];
            right--;
        }
        else{
            res[k]=nums[left]*nums[left];
            left++;
    
        }
        k--;
      }  
      return res;
    }
}

// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             nums[i]=nums[i]*nums[i];
//         }
        
//         Arrays.sort(nums);
//         return nums;
    
//     }
// }