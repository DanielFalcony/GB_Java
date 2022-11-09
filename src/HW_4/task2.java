// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package HW_4;


public class task2 {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.enqueue(3);
        list.enqueue(5);
        list.enqueue(8);
        System.out.println(list.first());
        System.out.println(list.first());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
//        System.out.println(list.dequeue()); - Exception
    }
}
