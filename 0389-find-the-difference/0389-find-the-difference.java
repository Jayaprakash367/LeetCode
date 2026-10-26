
class Solution {
    public char findTheDifference(String s, String t) {
        int[] frequency = new int[26];
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            frequency[t.charAt(i) - 'a']--;
            if (frequency[t.charAt(i) - 'a'] < 0) {
                return t.charAt(i);
            }
        }
        return ' ';
    }
}
