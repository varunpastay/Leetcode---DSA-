class Solution {
    public boolean isHappy(int n) {
        int res=0;
        while(res!=1 && res!=4){
            res=0;
        while(n>0){
            int rem=n%10;
            res=res+(int)Math.pow(rem,2);
            n=n/10;
        }
        n=res;
        }
        if(res==1){
            return true;
        }
        return false;
    }
}