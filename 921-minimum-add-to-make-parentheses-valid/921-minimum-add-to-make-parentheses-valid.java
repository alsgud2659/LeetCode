class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();          
        int result = 0;                         
        
        
        for(int i = 0; i < s.length(); i++){
            // 여는 괄호라면 여는괄호를 스택에 push
            if(s.charAt(i) == '('){             
                st.push('('); 
            }
            // 스택이 비어있다면 짝이 안맞는다는 뜻이므로 result를 하나 증가
            else if(st.empty()){               
                result ++;
            }
            // 닫는 괄호라면 스택에 들어있는 여는 괄호를 pop시킴
            else if(s.charAt(i) == ')'){
                st.pop();
            }
        }
                
        return result + st.size();              
    }
}