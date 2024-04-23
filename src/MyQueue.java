public class MyQueue<T> extends MyLinkedList {
    private int size;

    public boolean empty() {
        return empty();
    }

    public int getSize() {
        return size;
    }

    public T peek() {
        return (T) get(0);

    }
    public T enqueue(T newItem){
        addLast(newItem);
    }
    public T dequeue(){

    }
}