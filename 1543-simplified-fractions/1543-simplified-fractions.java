class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> res = new ArrayList<>();
        List<Float> stor = new ArrayList<>();
        for(int i=1;i<n;i++){
            for(int j=i+1;j<=n;j++){
                float f = (float)i/j;
                if(!stor.contains(f)){
                stor.add(f);

                res.add(""+i+"/"+j);
                }
                
            }
        }
        return res;
    }
}