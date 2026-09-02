class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<emails.length;i++){
            String s=emails[i];
            int at=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='@'){
                    at=j;
                }
            }
            String local="";
            for(int k=0;k<at;k++){
                if(s.charAt(k)=='+'){
                    break;
                }
                if(s.charAt(k)!='.'){
                    local=local+s.charAt(k);
                }
            }
            String domain=s.substring(at);
            String email=local+domain;

            set.add(email);
        }
        return set.size();
    }
}