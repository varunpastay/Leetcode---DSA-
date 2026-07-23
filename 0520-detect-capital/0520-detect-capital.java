class Solution {
    public boolean detectCapitalUse(String word) {

        int upper=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);

        if(ch>=65 && ch<=90){
            upper++;
        }
        }
        if(upper==word.length()){
            return true;
        }
        else if(upper==0){
            return true;
        }

        else if(upper==1 && word.charAt(0)>=65 && word.charAt(0)<=90){
            return true;
        }

    return false;
        
    }
}