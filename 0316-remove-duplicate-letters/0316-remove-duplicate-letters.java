class Solution {
    public String removeDuplicateLetters(String s) {

        int[] frequency = new int[26];
        boolean[] visited = new boolean[26];

        for (char ch : s.toCharArray()) {
            frequency[ch - 'a']++;
        }

        StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {
            frequency[ch - 'a']--;

            if (visited[ch - 'a']) {
                continue;
            }
            while (stack.length() > 0 &&
                   stack.charAt(stack.length() - 1) > ch &&
                   frequency[stack.charAt(stack.length() - 1) - 'a'] > 0) {

                visited[stack.charAt(stack.length() - 1) - 'a'] = false;
                stack.deleteCharAt(stack.length() - 1);
            }

            stack.append(ch);
            visited[ch - 'a'] = true;
        }

        return stack.toString();
    }
}