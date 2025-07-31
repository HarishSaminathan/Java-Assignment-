public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int xor = 0;
        for (char c : s.toCharArray()) xor ^= c;
        for (char c : t.toCharArray()) xor ^= c;
        return (char) xor;
    }

    public static void main(String[] args) {
        FindTheDifference solution = new FindTheDifference();
        System.out.println(solution.findTheDifference("abcd", "abcde"));
        System.out.println(solution.findTheDifference("", "y"));
    }
}