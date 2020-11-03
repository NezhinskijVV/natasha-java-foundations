package ru.itsjava.collections.list.linkedlist;


public class MyLinkedList {
    private Node head;

    public int size() {
        return 3;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }

    //1 -> 2 -> 3 -> null
    public boolean add(Object o) {
        //пустой список
        if (head == null) {
            head = new Node(o, null);
            return true;
        }
        //есть голова списка
        //пробежали весь список до последнего элемента
        Node curNode = head;
        while (curNode.getNext() != null) {
            curNode = curNode.getNext();
        }
        //вставили узел в конец списка
        curNode.setNext(new Node(o, null));
        return true;
    }

    //1 -> null
    //1 -> 2 -> 3 -> null
    public boolean remove(Object o) {
        if (head == null) return false;
        if (head.getValue().equals(o)) {
            head = head.getNext();
            return true;
        }
        if (head.getNext() == null) return false;

        Node curNode = head;
        Node prevNode = head;

        while ((curNode = curNode.getNext()) != null) {
            if (curNode.getValue().equals(o)) {
                break;
            }
            prevNode = prevNode.getNext();
        }

        if (curNode == null) return false;

        prevNode.setNext(curNode.getNext());
        return true;
    }

    public void clear() {

    }

    public Object get(int index) {
        checkIndex(index);

        if (index == 0) return head.getValue();
        Node curNode = head;
        int count = 0;
        while ((curNode = curNode.getNext()) != null) {
            count++;
            if (index == count) return curNode.getValue();
        }
        return null;
    }

    private void checkIndex(int index) {
        if ((index >= size()) || (index < 0)) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    public Object set(int index, Object element) {
        return null;
    }

    //1 -> 2 -> 3 -> 4 -> null
    public void add(int index, Object element) {
//        checkIndex(index);
        Node curNode = head;
        Node prevNode = head;
        int count = 0;

        if (index == 0) {
            head = new Node(element, head);
            return;
        }
        while ((curNode = curNode.getNext()) != null) {
            count++;
            if (count == index) {
                break;
            }
            prevNode = prevNode.getNext();
        }
        prevNode.setNext(new Node(element, curNode));
    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
