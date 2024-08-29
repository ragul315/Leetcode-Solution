class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        String v="aeiouAEIOU";
        int cnt=0;
        for(int i=left;i<=right;i++){
            if(v.indexOf(words[i].charAt(0)) != -1 && v.indexOf(words[i].charAt(words[i].length() - 1)) != -1){
                cnt++;
            }
        }
        return cnt;
    }
}