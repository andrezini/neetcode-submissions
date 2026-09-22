class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();
        
        for(int i = 0; i<tokens.length; i++){
            String token = tokens[i];
            int result = 0;
            if (
                token.equals("+") ||
                token.equals("-") ||
                token.equals("*") ||
                token.equals("/")
            ) {
                int right = st.pop();
                int left = st.pop();

                if (token.equals("+")) {
                    result=left+right;
                }   else if (token.equals("-")) {
                    result=left-right;   
                } else if (token.equals("*")) {
                    result=left*right;
                } else {
                    result=left/right;
                }
                st.push(result);
            }
           else{
            Integer number = Integer.parseInt(token);
            st.push(number);
           }
        }
        return st.pop();

    }
}

