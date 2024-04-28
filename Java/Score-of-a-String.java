class Solution {
    public int scoreOfString(String s) {
        int score = 0;
    
    for (int i = 1; i < s.length(); i++) {
        char currentChar = s.charAt(i);
        char prevChar = s.charAt(i - 1);
        
        int asciiDiff = Math.abs((int) currentChar - (int) prevChar);
        score += asciiDiff;
    }
    
    return score;
    }
}
