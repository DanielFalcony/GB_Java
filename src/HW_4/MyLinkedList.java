package HW_4;

import java.util.LinkedList;

class MyLinkedList implements Queue{
    private LinkedList<Integer> list;

    public MyLinkedList() {
        list = new LinkedList<>();
    }

    @Override
    public void enqueue(int val) {
        list.add(val);
    }

    @Override
    public int dequeue() {
        return list.pollFirst();
    }

    @Override
    public int first() {
        return list.getFirst();
    }
}