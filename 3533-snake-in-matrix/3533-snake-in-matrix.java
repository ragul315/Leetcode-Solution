class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int cnt =0;
        for(int i=0;i<commands.size();i++){
            switch(commands.get(i)){
                case "RIGHT":
                    cnt+=1;
                    break;
                case "LEFT":
                    cnt-=1;
                    break;
                case "DOWN":
                    cnt+=n;
                    break;
                case "UP":
                    cnt-=n;
                    break;
                default:
                    break;

            }
        }
        return cnt;
    }
}