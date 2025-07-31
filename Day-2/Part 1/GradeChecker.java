public class GradeChecker {
    public static void main(String[] args) {
        int percent = 82;

       
        if (percent >= 85 && percent <= 100)
            System.out.println("Grade: A");
        else if (percent >= 70)
            System.out.println("Grade: B");
        else if (percent >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Fail");

       
        int gradeLevel = percent / 10;
        switch (gradeLevel) {
            case 10:
            case 9:
            case 8:
            case 7:
                System.out.println("Grade: " + (percent >= 85 ? "A" : "B"));
                break;
            case 6:
            case 5:
                System.out.println("Grade: C");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
