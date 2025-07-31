public class ZohoPattern {
    public static void main(String[] args) {
      
        System.out.println("Pascal Triangle:");
        int totalRows = 5;
        int row = 0;

        do {
            int space = totalRows - row;
            do {
                System.out.print(" ");
                space--;
            } while (space > 0);

            int num = 1;
            int col = 0;

            do {
                System.out.print(num + " ");
                num = num * (row - col) / (col + 1);
                col++;
            } while (col <= row);

            System.out.println();
            row++;
        } while (row < totalRows);

        
        System.out.println("\nZOHO Pattern:");
        String text = "ZOHO CORPORATIONS";
        text = text.replace(" ", ""); // Remove spaces

        int index = 0;

        do {
            int count = 0;
            do {
                if (index + count < text.length()) {
                    System.out.print(text.charAt(index + count));
                }
                count++;
            } while (count < 4);
            System.out.println();
            index += 4;
        } while (index < text.length());
    }
}
