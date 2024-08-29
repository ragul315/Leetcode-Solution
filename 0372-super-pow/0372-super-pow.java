import java.math.BigInteger;
class Solution {
    public int superPow(int a, int[] b) {
        String pow="";
        for(int i=0;i<b.length;i++){
            pow+=b[i];
        }
        BigInteger exponent=new BigInteger(pow);
        BigInteger base=BigInteger.valueOf(a);
        BigInteger result=base.modPow(exponent, BigInteger.valueOf(1337));
        return result.intValue();
    }
}