
import java.util.ListIterator;

public class Exercise24_03 {

    public static void main(String[] args) {
        TwoWayLinkedList<Integer> list = new TwoWayLinkedList<>();

        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);
        list.add(3, 4);
        list.add(4, 5);

        System.out.println("Initial list: " + list);
        System.out.println("Size: " + list.size());

        list.addFirst(0);
        list.addLast(6);
        System.out.println("After addFirst and addLast: " + list);

        System.out.println("Element at index 3: " + list.get(3));
        System.out.println("Index of 4: " + list.indexOf(4));
        System.out.println("Last index of 4: " + list.lastIndexOf(4));

        list.removeFirst();
        list.removeLast();
        System.out.println("After removeFirst and removeLast: " + list);

        list.set(2, 99);
        System.out.println("After set(2, 99): " + list);

        System.out.print("Forward traversal: ");
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.print("Backward traversal: ");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();

        System.out.print("Traversal starting at index 2: ");
        ListIterator<Integer> iterator2 = list.listIterator(2);
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }
        System.out.println();
    }
}
