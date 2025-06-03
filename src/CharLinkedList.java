public class CharLinkedList {
    private CharNodeFrequency head=null, tail = null;
    private int size=0;

    public boolean isEmpty(){
        return head==null;
    }

    public int size() {
        return size;
    }

    public void add(char ch, String code, int frequency) {
        CharNodeFrequency newest = new CharNodeFrequency(ch, code, frequency);
        if(isEmpty()) head = tail = newest;
        else {
            tail.next = newest;
            tail = newest;
        }
        size++;
    }

    public CharNodeFrequency getCharNode(char ch) {
        if(isEmpty())
            return null;
        CharNodeFrequency trav = head;
        while(trav != null) {
            if(trav.ch == ch) break;
            trav = trav.next;
        }
        return trav;
    }

    public CharNodeFrequency getLink() {
        return head;
    }
}