class Solution {

    public boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public boolean validPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {

                // Try removing left character
                if (isPalindrome(s, left + 1, right)) {
                    return true;
                }

                // Try removing right character
                if (isPalindrome(s, left, right - 1)) {
                    return true;
                }

                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}