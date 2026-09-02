class Solution {
    public String check(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>=65 && ch <=90){
                ch=(char)(ch+32);
            }
            if((ch>=97 && ch<=122 )||(ch>=48 && ch<=57)){
                res=res+ch;
            }
        }
        return res;
    }
    public boolean isPalindrome(String s) {  
    
    s=check(s);
    int left=0;
    int right=s.length()-1;

    while(left<right){
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
    }
}
    //2
//     public boolean isPalindrome(String s) {  
//     int left=0;
//     int right=s.length()-1;
//     s=s.toLowerCase();
//     while(left<right){
//         char ch1=s.charAt(left);
//         char ch2=s.charAt(right);
//         if(!Character.isLetterOrDigit(ch1)){
//             left++;
//             continue;
//         }
//         if(!Character.isLetterOrDigit(ch2)){
//             right--;
//             continue;
//         }
//         if(ch1!=ch2){
//             return false;
//         }
//         left++;
//         right--;
//     }
//     return true;
//     }
    
// }




//1
 //public boolean isPalindrome(String s) {
    // s=s.toLowerCase();
    //     StringBuilder sb=new StringBuilder();
    //      for(char c:s.toCharArray()){
    //         if(Character.isLetterOrDigit(c)){
    //             sb.append(c);
    //         }
    //     }
    //     String str=sb.toString();
    //     sb=sb.reverse();
    //     String rev=sb.toString();
    // if(str.equals(rev)){
    //     return true;
    // }
    //     // int left=0;
    //     // int right=str.length()-1;
    //     // while(left<right){
    //     //     if(str.charAt(left)!=str.charAt(right)){
    //     //         return false;
    //     //     }
    //     //     left++;
    //     //     right--;

    //     // }
    //     // return true;
    //     return false;
    // }