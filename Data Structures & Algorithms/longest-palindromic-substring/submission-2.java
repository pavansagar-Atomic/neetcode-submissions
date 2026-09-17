class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int maxlen=1;
        int start=0;
        if(n<=1){
            return s;
        }
        for(int i=0;i<n;i++){
            int left=i;
            int right=i;
            while(left>=0 && right<n &&s.charAt(left)==s.charAt(right)){
                if(right-left+1>maxlen){
                    start=left;
                    maxlen=right-left+1;
                }
                left--;
                right++;
            }
            left=i;
            right=i+1;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                if(right-left+1>maxlen){
                    start=left;
                    maxlen=right-left+1;
                }
                left--;
                right++;
            }
        }
        return s.substring(start,start+maxlen);
        
    }
}
