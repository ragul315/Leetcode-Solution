class Solution {
    public int numberOfSteps(int num) {
        int cnt=0;
        while(num>1){
            if(num%2!=0){
                num-=1;
                cnt++;
            }
            num/=2;
            cnt++;
        }
        if(num==1){
            cnt++;
        }
        return cnt;
    }
}