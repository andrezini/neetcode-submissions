class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');
        Stack<Character> st = new Stack<>();
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='{'  || s.charAt(i)=='(' || s.charAt(i)=='[' )
                st.push(s.charAt(i));
            else{
                if(!st.isEmpty() && brackets.get(s.charAt(i)) == st.pop()){
                    continue;
                }else{
                    return false;
                }
            }        
        }
        return st.isEmpty();
    }
}
