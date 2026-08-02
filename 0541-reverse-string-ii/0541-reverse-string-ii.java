class Solution {
    public String reverseStr(String s, int k) {
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i=i+2*k){
            reverse(arr,i,Math.min(arr.length-1,i+k-1));
        }

    return new String(arr);
    }
        public void reverse(char[] arr,int start, int end){
            while(start<end){
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
    
}