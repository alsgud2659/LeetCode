class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> code = new HashMap<>();
        int k=0;
        
        for(int i = 0; i < key.length(); i++) {
            if(!code.containsKey(key.charAt(i)) && key.charAt(i) != ' ') {
                code.put(key.charAt(i), (char)(97 + k));
                k++;
            }
        }

        String result = "";
        
        for(int i = 0; i < message.length(); i++) {
            if(message.charAt(i) == ' '){
                result += ' ';
            }else {
                result += code.get(message.charAt(i));
            }
        }
        
        return result;

    }    
}