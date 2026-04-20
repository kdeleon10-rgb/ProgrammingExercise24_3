
import java.util.Collection;

/**
 * Custom list interface used for Liang exercises.
 */
public interface MyList<E> extends Collection<E> {

    public void add(int index, E e);

    public E get(int index);

    public int indexOf(Object e);

    public int lastIndexOf(E e);

    public E remove(int index);

    public E set(int index, E e);

    @Override
    public default boolean add(E e) {
        add(size(), e);
        return true;
    }

    @Override
    public default boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public default boolean remove(Object e) {
        int index = indexOf(e);
        if (index >= 0) {
            remove(index);
            return true;
        }
        return false;
    }

    @Override
    public default boolean containsAll(Collection<?> c) {
        for (Object e : c) {
            if (!contains(e)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public default boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for (E e : c) {
            add(e);
            modified = true;
        }
        return modified;
    }

    @Override
    public default boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object e : c) {
            while (remove(e)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public default boolean retainAll(Collection<?> c) {
        boolean modified = false;
        Object[] elements = toArray();
        for (Object e : elements) {
            if (!c.contains(e)) {
                remove(e);
                modified = true;
            }
        }
        return modified;
    }
}
