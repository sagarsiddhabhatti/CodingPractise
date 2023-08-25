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
/**
 This Java code defines a method named `repeatedSubstringPattern` that takes a string `s` as input and returns a boolean value. The purpose of the method is to determine whether the input string can be formed by repeating a substring multiple times.

 Let's break down the code step by step:

 1. The method starts with a `for` loop that iterates over possible sizes of substrings. It starts from a substring size of 1 and goes up to half the length of the input string (`s.length()/2`), because a substring cannot be longer than half of the original string's length while still allowing for repetition.

 2. Inside the loop, it checks if the length of the input string is evenly divisible by the current substring size using the modulo operator (`s.length()%size==0`). If it is divisible, it means that the current substring size is a candidate for forming repeated substrings.

 3. If the current substring size is a valid candidate, it extracts the first `size` characters from the input string `s` using the `substring` method and stores it in the `curr` variable.

 4. The code then enters a `while` loop with a variable `j` set to the current substring size. The purpose of this loop is to check if the substring starting from position `j` and ending at position `j+size` is equal to the `curr` substring that we extracted earlier. The loop continues as long as the substring is equal to `curr`.

 5. If the `while` loop finishes and `j` is equal to the length of the input string `s`, it means that the entire input string has been formed by repeating the current substring. In this case, the method returns `true`, indicating that the input string can be formed by repeating a substring.

 6. If the loop completes without finding a repeated substring pattern for the current substring size, the loop continues with the next possible substring size.

 7. If none of the substring sizes yield a repeated substring pattern, the method returns `false` at the end, indicating that the input string cannot be formed by repeating any substring.

 In essence, the method iterates through various substring sizes, checking if any of them can be repeated to form the entire input string. If such a substring is found, the method returns `true`, otherwise, it returns `false`. This approach exhaustively checks all possible substring sizes up to half of the string's length.
 **/
public class RepeatedStringPattern {

    public static void main(String args[]) {
        System.out.println(" repeatedSubstringPattern : "+ repeatedSubstringPattern("abcabcabcabc"));

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
