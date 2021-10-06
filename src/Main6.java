import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        AsciiCharSequence charSequence = new AsciiCharSequence(new byte[]{50, 68, 69, 99});
        System.out.println(charSequence.toString());
    }
    public static class AsciiCharSequence implements CharSequence {
        byte[] a;

        AsciiCharSequence(byte[] a) {
            this.a = a;
        }

        @Override
        public int length() {
            return a.length;
        }

        @Override
        public char charAt(int index) {
            return (char) a[index];
        }

        @Override
        public String toString() {

            return new String(a);
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            byte[] b = Arrays.copyOfRange(a,start, end);
            return new AsciiCharSequence(b);
        }
    }

}
