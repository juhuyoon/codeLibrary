package Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class isValid {
    static Map<Character, Character> mappings = new HashMap<>();
    static {
        mappings.put('(', ')');
        mappings.put('{', '}');
        mappings.put('[', ']');
    }

    public boolean isValid(String s) {
        Stack<Character> parenthesis = new Stack();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(mappings.containsKey(c)) {
                parenthesis.push(mappings.get(c));
            } else if (mappings.containsValue(c)) {
                if(parenthesis.isEmpty() || parenthesis.pop() != c) {
                    return false;
                }
            }
        }
        return parenthesis.isEmpty();
    }
}