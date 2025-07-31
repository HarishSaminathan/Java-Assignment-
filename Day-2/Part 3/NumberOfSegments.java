public class NumberOfSegments {
    public int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOfSegments solution = new NumberOfSegments();
        System.out.println(solution.countSegments("Hello, my name is John"));
        System.out.println(solution.countSegments("Hello"));
    }
}