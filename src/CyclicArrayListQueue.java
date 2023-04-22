import java.util.ArrayList;
import java.util.List;

public class CyclicArrayListQueue<E> implements MyQueue<E> {
    private ArrayList<E> queue;
    private int f = 0, r = 0; //front, rear

    public CyclicArrayListQueue(int n) {
        queue = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            queue.add(null);
        }
    }

    @Override
    public void enqueue(E elem) throws FullException {
        if (isFull())
            throw new FullException("Full queue");
        else {
            queue.set(r, elem);
            r = (r + 1) % queue.size();
        }
    }

    @Override
    public void dequeue() {
        if (!isEmpty())
            f = (f + 1) % queue.size();
    }

    @Override
    public E first() throws EmptyException {
        if (isEmpty())
            throw new EmptyException("Empty queue");
        else
            return queue.get(f);
    }
    @Override
    public boolean isEmpty() {
        return f == r;
    }

    @Override
    public boolean isFull() {
        return (r + 1) % queue.size() == f;
    }
}

