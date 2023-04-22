public class Main {
    public static void main(String[] args) throws FullException, EmptyException {
        MyQueue<Integer> queue = new CyclicArrayListQueue<>(3);
        System.out.println(queue.isEmpty() == true);
        //queue.first();
        queue.enqueue(12);
        queue.enqueue(23);
        System.out.println(queue.isEmpty() == false);
        queue.enqueue(34);
        System.out.println(queue.isFull() == true);
        System.out.println(queue.first() == 12);
        queue.dequeue();
        queue.enqueue(45);
        System.out.println(queue.first() == 23);
        queue.dequeue();
        queue.enqueue(56);
        System.out.println(queue.first() == 34);
        //queue.enqueue(67);
    }

}
