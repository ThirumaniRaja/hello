package DSA;

public class LinkListArr {
   private Node head;
   private Node tail;
   private int length;

    class Node {
        int value;
        Node next;

       public Node(int value){
            this.value = value;
        }
    }

    public LinkListArr(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null){
//            System.out.println(temp.value +" pointer "+ temp.next);
            System.out.println(temp.value );
            temp = temp.next;
        }
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i = 0; i < length; i++){
             after = temp.next;
             temp.next = before;
             before = temp;
             temp = after;
        }
    }



    public static void main (String[] args){
        LinkListArr myLinkList = new LinkListArr(2);
        myLinkList.append(4);
        myLinkList.append(3);
        myLinkList.append(1);

        myLinkList.printList();
        System.out.println("after reverse");
        myLinkList.reverse();
        myLinkList.printList();


    }
}
