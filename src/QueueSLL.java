public class QueueSLL<T> {
    private SinglyLinkedList<T> list;

    QueueSLL() {
        list = new SinglyLinkedList<>();
    }

    public boolean isEmpty() { return list.isEmpty(); }
    public int size() { return list.size(); }

    public void offer(T elem) {
        list.addLast(elem);
    }

    public T poll() {
        return list.removeFirst();
    }

    public T peek() {
        return list.getHeadData();
    }
}