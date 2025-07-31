public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        int upper = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) upper++;
        }
        return upper == word.length() || upper == 0 || (upper == 1 && Character.isUpperCase(word.charAt(0)));
    }

    public static void main(String[] args) {
        DetectCapital solution = new DetectCapital();
        System.out.println(solution.detectCapitalUse("USA"));
        System.out.println(solution.detectCapitalUse("FlaG"));
    }
}