import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> mb = new HashMap<>();
        mb.put(')', '(');
        mb.put(']', '[');
        mb.put('}', '{');
        for (char c : s.toCharArray()) {
            if (mb.containsKey(c)) {
                if (st.isEmpty() || st.peek() != mb.get(c)) {
                    return false;
                }
                st.pop();
            } else {
                st.push(c);
            }
        }
        return st.isEmpty();
    }
}
