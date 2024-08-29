class Solution {
    public String reverseWords(String s) {
        String res="",t="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(!t.isEmpty()){

                res+=t+" ";
                t="";
                }
            }
            else{
            t=""+s.charAt(i)+t;
            }
        }
        res+=t;
        res=res.trim();
        return res;
    }
}