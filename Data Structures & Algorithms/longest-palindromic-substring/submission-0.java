class Solution {

    public boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int n = s.length();

        if (n == 0) return "";

        String ans = "";

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                String sub = s.substring(i, j + 1);

                if (isPalindrome(sub)) {
                    if (sub.length() > ans.length()) {
                        ans = sub;
                    }
                }
            }
        }

        return ans;
    }
}