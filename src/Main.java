import java.util.Queue;
import java.util.Stack;

public class Main {
        public static void main(String[] args) {
            System.out.println("Testing MyArrayList:");
            MyArrayList<Integer> arrayList = new MyArrayList<>();
            arrayList.add(0);
            arrayList.add(3);
            arrayList.add(38);
            System.out.println("Size of list: " + arrayList.size());
            System.out.println("Element at index 1: " + arrayList.get(1));
            arrayList.remove(2);
            System.out.println("Size of list after removal: " + arrayList.size());
            arrayList.clear();
            System.out.println("Size of list after clear: " + arrayList.size());
//            System.out.println("Is list empty: " + arrayList.exists(new Object()));
            System.out.println("\nTesting MyLinkedList:");
            MyLinkedList<String> linkedList = new MyLinkedList<>();
            linkedList.add("A");
            linkedList.add("B");
            linkedList.add("C");
            System.out.println("Size of list: " + linkedList.size());
            System.out.println("Element at index 1: " + linkedList.get(1));
            linkedList.remove(0);
            System.out.println("Size of list after removal: " + linkedList.size());
            linkedList.clear();
            System.out.println("Size of list after clear: " + linkedList.size());
//            System.out.println("Is list empty: " + linkedList.exist();
            System.out.println("\nTesting MyStack:");
            MyStack<Integer> stack = new MyStack<>();
            stack.push(81);
            stack.push(77);
            stack.push(90);
//            stack.getSize();
//            System.out.println(stack.getSize());
            System.out.println("\nTesting MyQueue:");
            MyQueue<Integer> queue = new MyQueue<>();
            queue.addLast(88);
            queue.addLast(91);
            queue.dequeue();
            System.out.println(queue.size());    }
    }

