class Solution {
    public int[] twoSum(int[] numbers, int target) {
      int[] res=new int [2];
      Map<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<numbers.length;i++){
        int temp=target-numbers[i];
        if(!map.containsKey(temp)){
            map.put(numbers[i],i);
        }
        else{
            res[0]=map.get(temp)+1;
            res[1]=i+1;
        }

      } 
      return res; 
    }
}
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