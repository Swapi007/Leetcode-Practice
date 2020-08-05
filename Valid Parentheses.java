//class Solution {
//    public boolean isValid(String s) {
//        Stack<Character> st=new Stack<>();
//        for(int i=0;i<s.length();i++){
//            char c=s.charAt(i);
//            if(c=='(')
//                st.push(')');
//            else if(c=='[')
//                st.push(']');
//            else if(c=='{')
//                st.push('}');
//            else if((st.isEmpty())||(st.pop()!=c))
//                return false;
//        }
//        return st.isEmpty();
//    }
//}


class Solution {
    public boolean isValid(String s) {
        if(s.length()==0)
            return true;
        else if((s.charAt(0)==')')||(s.charAt(0)==']')||(s.charAt(0)=='}'))
            return false;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if((c=='(')||(c=='[')||(c=='{'))
                st.push(c);
            else if((c==')')&&(!st.isEmpty())){
                if(st.peek()=='(')
                    st.pop();
                else
                    return false;
            }
            else if((c==']')&&(!st.isEmpty())){
                if(st.peek()=='[')
                    st.pop();
                else
                    return false;
            }
            else if((c=='}')&&(!st.isEmpty())){
                if(st.peek()=='{')
                    st.pop();
                else
                    return false;
            }
            else
                return false;
        }
        return st.isEmpty();
    }
}
