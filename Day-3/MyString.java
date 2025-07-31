public class MyString {
    private char[] data;

    public MyString(String input) {
        data = new char[input.length()];
        for (int i = 0; i < input.length(); i++) data[i] = input.charAt(i);
    }

    public int length() {
        return data.length;
    }

    public char charAt(int index) {
        return data[index];
    }

    public boolean equals(MyString other) {
        if (other.length() != length()) return false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != other.charAt(i)) return false;
        }
        return true;
    }

    public MyString toUpperCase() {
        char[] newData = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            newData[i] = (data[i] >= 'a' && data[i] <= 'z') ? (char) (data[i] - 32) : data[i];
        }
        return new MyString(newData);
    }

    public MyString toLowerCase() {
        char[] newData = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            newData[i] = (data[i] >= 'A' && data[i] <= 'Z') ? (char) (data[i] + 32) : data[i];
        }
        return new MyString(new MyString(newData).toString());
    }

    public MyString substring(int start, int end) {
        char[] newData = new char[end - start];
        for (int i = start; i < end; i++) newData[i - start] = data[i];
        return new MyString(new MyString(newData).toString());
    }

    public MyString concat(MyString other) {
        char[] newData = new char[data.length + other.length()];
        for (int i = 0; i < data.length; i++) newData[i] = data[i];
        for (int i = 0; i < other.length(); i++) newData[data.length + i] = other.charAt(i);
        return new MyString(new MyString(newData).toString());
    }

    public boolean contains(MyString sub) {
        for (int i = 0; i <= data.length - sub.length(); i++) {
            boolean found = true;
            for (int j = 0; j < sub.length(); j++) {
                if (data[i + j] != sub.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) return true;
        }
        return false;
    }

    public int indexOf(char ch) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == ch) return i;
        }
        return -1;
    }

    public MyString replace(char oldChar, char newChar) {
        char[] newData = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            newData[i] = (data[i] == oldChar) ? newChar : data[i];
        }
        return new MyString(new MyString(newData).toString());
    }

    public String toString() {
        return new String(data);
    }

    public static void main(String[] args) {
        MyString s1 = new MyString("Hello");
        MyString s2 = new MyString("World");
        System.out.println(s1.length());
        System.out.println(s1.charAt(1));
        System.out.println(s1.equals(new MyString("Hello")));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.substring(1, 4));
        System.out.println(s1.concat(s2));
        System.out.println(s1.contains(new MyString("ell")));
        System.out.println(s1.indexOf('l'));
        System.out.println(s1.replace('l', 'p'));
    }
}