package Collection;

import com.sun.glass.ui.Size;

/**
 * Created by Administrator on 2017/4/11.
 * 尝试自己做一个linkedList
 */
public class MyLinkedList {
    class Node { // node 节点\ [nəʊd]

        String element;
        Node prev; // prev previous 以前的\ ['priːvɪəs]
        Node next;
        public Node(String element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

    }

    private Node first;
    private Node last;
    private int size;
    public boolean add(String element) {
        if (first == null) {
            Node node = new Node(element, null, null);
            first = node;
            last = node;
        } else {
            Node node =new Node(element,last,null);
            last.next=node;
            last=node;

        }
        size++;
        return true;
    }
    public String first() {
        return first.element;
    }
    public  String last() {
        return last.element;
    }
    public int sizi() {
        return size;
    }


    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            System.out.println("error");
            System.exit(0);
        }
        Node node = first;
        for (int i = 0; i <index ; i++) {
            node=node.next;
        }
        return  node;
    }

    public String remove(int index) {
        Node node =getNode(index);
        String element =node.element;
        Node prev=node.prev;
        Node next=node.next;

        if (prev == null && next == null) {
            node.element = null;
        } else if (prev == null) {
            first = next;
            next.prev = null;
            node.next = null;
            node.element = null;
        } else if (next == null) {
            last = prev;
            prev.next = null;
            node.prev = null;
            node.element = null;
        }else {
            prev.next = next;
            next.prev = prev;
            node.prev = null;
            node.next = null;
            node.element = null;
        }

        size--;
        return element;
    }

    public String get(int index) {

        return getNode(index).element;
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("hello");
        myLinkedList.add("hi");
        myLinkedList.add("last");
        System.out.println(myLinkedList.first());
        System.out.println(myLinkedList.last());
        System.out.println(myLinkedList.sizi());
        System.out.println(myLinkedList.get(1));
        myLinkedList.remove(0);
        myLinkedList.remove(0);
        System.out.println(myLinkedList.sizi());
        System.out.println(myLinkedList.get(1));
    }
}
