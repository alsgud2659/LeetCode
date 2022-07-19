class Solution {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '('){
				stack.push(')');
			}else if(s.charAt(i) == '['){
				 stack.push(']');
			}else if(s.charAt(i) == '{'){
				 stack.push('}');
			}else{
                // 닫는 괄호가 스택에서 pop()하는 괄호와 다르다면 닫는괄호에 해당하는 여는 괄호가 없다는 뜻이므로 false리턴
				if(stack.isEmpty() || stack.pop() != s.charAt(i)){
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}