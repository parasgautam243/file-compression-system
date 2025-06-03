public class ByteFrequency implements Comparable<ByteFrequency>{
    Byte data;
    int frequency;

    ByteFrequency left;
    ByteFrequency right;

    public ByteFrequency(Byte data, int weight)
    {
        this.data=data;
        this.frequency=weight;
    }
    public int compareTo(ByteFrequency o)
    {
        return this.frequency - o.frequency;
    }
}