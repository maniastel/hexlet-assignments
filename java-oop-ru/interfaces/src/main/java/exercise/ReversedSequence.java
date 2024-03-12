package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    String text;

    ReversedSequence(String text) {
        StringBuilder s = new StringBuilder(text);
        this.text = s.reverse().toString();
    }

    public String toString() {
        return text;
    }

    public char charAt(int i) {
        return text.charAt(i);
    }

    @Override
    public int length() {
        return text.length();
    }

    public String subSequence(int begin, int end) {
        return text.substring(begin, end);
    }
}
// END
