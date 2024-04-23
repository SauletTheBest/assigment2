public interface MyList<T> extends Iterable<T> {
    void addElement(T item);
    void set(int index, T item);
    void addElement(int index, T item);
    T get(int index);
    void addFirst(T item);
    void addLast(T item);
    T getFirst();
    T getLast();
    void remove(int index);
    void removeFirst();
    void removeLast();
    void sort();
    int indexOf(Object object);
    int lastIndexOf(Object object);
    boolean exist(Object object);
    public Object[] toArray();
    void clear();
    int size();




}
