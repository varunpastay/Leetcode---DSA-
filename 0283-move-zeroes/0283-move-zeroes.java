class Solution {
    public void moveZeroes(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]!=0){
            nums[index]=nums[i];
            index++;
           }
        }
        while(index<nums.length){
            nums[index]=0;
            index++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
// class Solution {
//     public void moveZeroes(int[] nums) {
//         int count=0;
//         for(int n=0;n<nums.length;n++){
//              for(int i=0;i<nums.length-1;i++){
//                  if(nums[i]==0){
//                     int temp=nums[i];
//                     nums[i]=nums[i+1];
//                     nums[i+1]=temp;
//                     count++;
//                     }
//              }
//         }

//     }
// }