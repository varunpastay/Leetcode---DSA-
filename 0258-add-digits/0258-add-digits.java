class Solution {
    public int addDigits(int num) {
     if(num==0){
        return 0;
     }
        while(count(num)!=1){
        int sum=0;
            while(num>0){
            int rem=num%10;
            sum=sum+rem;
            num/=10;
        }
    num=sum;
        }
        return num;

    }
    public int count(int num){
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }
}