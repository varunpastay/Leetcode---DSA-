class Solution {
    public boolean check(int[]nums,int k){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                return true;
            }

        }
        return false;
    }
    public int missingMultiple(int[] nums, int k) {
        int multiple=k;
        while(check(nums,multiple)){
            multiple+=k;
        }
        return multiple;
    }
}