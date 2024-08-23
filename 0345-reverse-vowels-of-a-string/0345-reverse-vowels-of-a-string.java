class Solution {
    public String reverseVowels(String s) {
        String vo = s.replaceAll("[^aeiouAEIOU]", "");
        StringBuilder res = new StringBuilder(s.length());
        int j = vo.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1) {
                res.append(vo.charAt(j--));
            } else {
                res.append(s.charAt(i));
            }
        }

        return res.toString();
    }
}
