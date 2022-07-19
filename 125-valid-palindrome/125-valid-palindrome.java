class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        
        // 공백이나 특수문자등을 걸러내어 StringBuilder에 append()시킴
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                sb.append(Character.toLowerCase(ch));
            }
            else if(ch >= 'a' && ch <= 'z') {
                sb.append(ch);
            }
            else if(ch >= '0' && ch <= '9') {
                sb.append(ch);
            }
            else {
                continue;
            }
        }
        System.out.println(sb);
        return checkPalindrome(sb.toString());
    }
    
    public boolean checkPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        
        // 처음값과 끝값을 비교해서 다르다면 회문이 아니기 때문에 false를 리턴한다.
        while(start < end) {
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}