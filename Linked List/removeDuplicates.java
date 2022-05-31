package com.company;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
         this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void InsertAtFirst(int value){                      //Insert At First
        Node node = new Node(value);
        node.next=head;
        head= node;

        if(tail==null){                //when first element is inserted.
            tail=head;
        }
        size++;

    }

    public void InsertAtLast(int value){            //Insert At Last
        Node node = new Node(value);                //advantage of maintaining tail is here this takes 0(1) time
        if(tail==null){
            InsertAtFirst(value);
            return;
        }
        tail.next= node;
        tail = node;
        size++;

    }
    

    public void display(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.value+" -> " );
            temp =temp.next;
        }
        System.out.println("END");

    }

    public void removeDuplicates(){
            Node node = head;
            if(head==null || head.next==null){
                return;
            }
            while(node.next!=null){
                if(node.value == node.next.value){
                    node.next = node.next.next;
                }
                else{
                    node = node.next;
                }
            }
          tail = node;
          tail.next = null;

    }

    public void removeDuplicates_unsorted(){
        Node ptr1 =head;
        Node ptr2;

        while(ptr1!=null && ptr1.next!=null){
            ptr2 =ptr1;

            while(ptr2.next!=null){
                if(ptr1.value == ptr2.next.value){
                    ptr2.next = ptr2.next.next;
                }
                else{
                    ptr2 = ptr2.next;
                }
            }
             tail = ptr1;
            ptr1 = ptr1.next;
        }
       
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.InsertAtFirst(4);
        list.InsertAtFirst(3);
        list.InsertAtFirst(2);
        list.InsertAtFirst(1);
        list.InsertAtLast(4);
        list.InsertAtLast(5);
        list.InsertAtLast(5);
        list.InsertAtLast(1);
//        list.removeDuplicates();
        list.removeDuplicates_unsorted();
        list.display();
    }

}
