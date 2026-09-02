class Solution {
    public boolean isPalindrome(String s) {
    s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
         for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        String str=sb.toString();
        sb=sb.reverse();
        String rev=sb.toString();
    if(str.equals(rev)){
        return true;
    }
        // int left=0;
        // int right=str.length()-1;
        // while(left<right){
        //     if(str.charAt(left)!=str.charAt(right)){
        //         return false;
        //     }
        //     left++;
        //     right--;

        // }
        // return true;
        return false;
    }
}