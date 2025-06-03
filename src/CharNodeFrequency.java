public class CharNodeFrequency {
    CharNodeFrequency next;
    char ch;
    String bit_size;
    int frequency = 0;

    CharNodeFrequency(final char ch, final String code, final int frequency) {
        this.ch = ch;
        this.bit_size = code;
        this.frequency = frequency;
        next = null;
    }
}