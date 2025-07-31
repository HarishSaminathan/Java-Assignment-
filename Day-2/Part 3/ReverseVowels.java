public class ReverseVowels {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !isVowel(chars[i])) i++;
            while (i < j && !isVowel(chars[j])) j--;
            char temp = chars[i];
            chars[i++] = chars[j--];
            chars[j + 1] = temp;
        }
        return new String(chars);
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        ReverseVowels solution = new ReverseVowels();
        System.out.println(solution.reverseVowels("hello"));
        System.out.println(solution.reverseVowels("leetcode"));
    }
}