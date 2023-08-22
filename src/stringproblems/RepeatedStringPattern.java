package stringproblems;

/**
 * Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abab"
 * Output: true
 * Explanation: It is the substring "ab" twice.
 * Example 2:
 *
 * Input: s = "aba"
 * Output: false
 * Example 3:
 *
 * Input: s = "abcabcabcabc"
 * Output: true
 * Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
 */
public class RepeatedStringPattern {

    public static void main(String args[]) {
        System.out.println(" repeatedSubstringPattern : "+ repeatedSubstringPattern("abc abc abc"));

    }

    public static boolean repeatedSubstringPattern(String s) {
        for (int size=1;size<=s.length()/2;size++) {
            if (s.length()%size==0) {
                String curr=s.substring(0,size);
                int j=size;
                while (j<s.length() && s.substring(j,j+size).equals(curr)) {
                    j+=size;
                }
                if (j==s.length()) return true;
            }
        }
        return false;

    }
}
