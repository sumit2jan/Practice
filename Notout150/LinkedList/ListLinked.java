package Notout150.LinkedList;
public class ListLinked {
    private Node head;
    private Node tail;
    private int length;

    // representation of the Node class
    public class Node{
        int value;
        Node next;
        // constructor of Node class
        Node(int value){
            this.value = value;
        }
    }
    // constructor of the ListNode class.
    ListLinked(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    // getters and setters for the Head,tail and length.
    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    // method to print the Linked list.

    public void PrintList(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    // Method to empty the List.
    public void emptyList(){
        head = null;
        tail = null;
        length = 0;
    }

    // now we are creating the append method.
    public void append(int value){
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;    
        }
        length++;
    }

    // now we are going to make the method to remove the last element of the list.
    public Node removeLast(){
        if (length == 0) {
            return null;
        }
        Node pre = head;
        Node temp = head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;

        if(length==0){
            head = null;
            tail = null;
        }
        return temp;
    }

    //now i am going to write the code for the prepend value

    public void prepend(int value){
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else{
        newNode.next = head;
        head = newNode;}
        length++;
    }

    // Now we are going to implement the removefirst method.

    public Node removeFirst(){
        if (length == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }
    // Implementing the get method
    public Node get(int index){
        if(index < 0 || index >= length){
            return null;
        }

        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }
    //implementing the set Method
   public boolean set(int index, int value){
    Node temp = get(index);
    if (temp != null) {
        temp.value = value;
        return true;
    }
    return false;
   }

    // Implementing the Insert Method
    public boolean insert(int index, int value){
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }   
       Node newNode = new Node(value);
       Node temp =  get(index-1);
       newNode.next = temp.next;
       temp.next = newNode;
       length++;
       return true;
    }

    // Implementing the remove Funtion From here

    public Node remove(int index){
        if(index < 0 || index >= length){
            return null;
        }
        if (index == 0) {
            removeFirst();
        }
        if(index == length-1){
            removeLast();
        }

        Node temp = get(index-1);
        Node prev = temp.next;
        temp.next = prev.next;
        prev.next = null;
        length--;
        return prev;
    }

    // Implementing the reverse Method most important

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }








    public static void main(String[] args) {
        ListLinked list1 = new ListLinked(5);
        list1.append(4);
        list1.append(7);
        list1.PrintList();
        //System.out.println(list1.removeLast()); 
        //list1.PrintList();
        System.out.println("we are Implementing the prepend method from here");
        list1.prepend(8);
        list1.PrintList();

        System.out.println("we are implementing the removefirst from here");
        list1.removeFirst();
        list1.PrintList();

        System.out.println("we are implementing the get funtion from here");
        System.out.println(list1.get(2).value);

        System.out.println("Implementing the set funtion from here");
        list1.set(2, 9);
        list1.PrintList();
        System.out.println("Implementing the Insert funtion from here");
        list1.insert(2,8);
        list1.PrintList();
        list1.getLength();

        System.out.println("Implementing the remove funtion from here");
        list1.remove(2);
        list1.PrintList();

        System.out.println("implementing the reverse method");
        list1.reverse();
        list1.PrintList();
    }
}

/*A Linked List is a linear data structure where elements (nodes) are connected using pointers (links).
Each node contains:
data → actual value
next → reference to the next node*/