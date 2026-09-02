class Solution {
    public boolean isPalindrome(String s) {
      int left=0;
      int right=s.length()-1;
      while(left<right){
        while(left<right){
            char ch=s.charAt(left);
            if((ch>=97 && ch<=122)||(ch>=65 && ch<=90)||(ch>=48 && ch <=57)){
                break;
            }
            left++;
        }
        while(left<right){
            char ch=s.charAt(right);
            if((ch>=97 && ch<=122)||(ch>=65 && ch<=90)||(ch>=48 && ch <=57)){
                break;
            }
            right--;
        }
        char ch1=s.charAt(left);
        char ch2=s.charAt(right);

        if(ch1>=65 && ch1<=90){
            ch1=(char)(ch1 + 32);
        }
        if(ch2>=65 && ch2<=90){
            ch2=(char)(ch2+32);
        }

        if(ch1!=ch2){
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