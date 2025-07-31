import java.util.*;

public class GraduationSearch {
    public static void main(String[] args) {
        int[] years = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        Arrays.sort(years);
        int result = Arrays.binarySearch(years, key);

        if (result >= 0) {
            System.out.println("record exists");
        } else {
            System.out.println("record does not exist");
        }


    }
}
