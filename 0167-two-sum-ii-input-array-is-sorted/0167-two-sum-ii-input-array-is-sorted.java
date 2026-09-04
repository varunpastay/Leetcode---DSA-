class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int left=0;
       int right=numbers.length-1;
       while(left<right){
        int sum=numbers[left]+numbers[right];
        if(sum==target){
            return new int[]{left+1,right+1};
        }
        if(sum>target){
            right--;

        }
        if(sum<target){
            left++;
        }
       } 
       return new int[]{-1,-1};
    }
}
// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//       int[] res=new int [2];
//       Map<Integer,Integer> map=new HashMap<>();
//       for(int i=0;i<numbers.length;i++){
//         int temp=target-numbers[i];
//         if(!map.containsKey(temp)){
//             map.put(numbers[i],i);
//         }
//         else{
//             res[0]=map.get(temp)+1;
//             res[1]=i+1;
//         }

//       } 
//       return res; 
//     }
// }
// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int[] res=new int [2];
//         for(int i=0;i<numbers.length;i++){
//             for(int j=i+1;j<numbers.length;j++){

//             int sum=numbers[i]+numbers[j];
//             if(sum==target){
//                 res[0]=i+1;
//                 res[1]=j+1;
//             }
//             }
//         }
//         return res;
//     }
// }