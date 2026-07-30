class Solution {
    public boolean checkRecord(String s) {
            int A_count=0;
        for(int i=0;i<s.length();i++){
            
         if(s.charAt(i)=='A'){
                A_count++;
                 if(A_count>=2){
                    return false;
                }
                
            }
           
            else if(i>=2 && s.charAt(i)=='L'&& s.charAt(i-1)=='L' && s.charAt(i-2)=='L'){
            
                    return false;
             
            }
        }
        return true;
    }
}