class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    //   for(int i=1;i<nums.length;i++){
    //     for(int j=0;j<nums.length;j++){
    //         if()
    //     }
    //   }
    }
}