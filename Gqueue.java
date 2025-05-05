
    import java.util.Arrays;
    public class Gqueue<T> {
        T[] que;
        static int size;

        public Gqueue() {
            que = (T[]) new Object[2];
            size = 0;
        }

        public void enqueue(T element) {
            if (size == que.length) {
                int newCapacity = que.length * 2;
                que = Arrays.copyOf(que, newCapacity);
            }
            que[size++] = element;
        }

        public T dequeue() {
            if (size == 0) {
                System.out.println("Queue is empty");
            }
            T del_element = que[0];
            System.arraycopy(que, 1, que, 0, size - 1);
            que[--size] = null;
            return del_element;
        }

        public void display() {
            for (T element : que) {
                System.out.println(element);
            }
        }

        public static void main(String[] args) {
            Gqueue<Integer> integerQueue = new Gqueue<>();
            integerQueue.enqueue(10);
            integerQueue.enqueue(20);
            integerQueue.enqueue(30);
            System.out.println("ELements in the queue are:");
            integerQueue.display();
            int dequeuedElement = integerQueue.dequeue();
            System.out.println("Dequeued element: " + dequeuedElement);
            System.out.println("Queue size: " + (++size));
        }
    }


