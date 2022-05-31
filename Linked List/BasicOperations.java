package com.company;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }


    public void InsertAtFirst(int value){                      //Insert At First
        Node node = new Node(value);
        node.next=head;
        head= node;

        if(tail==null){
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

//        Node node= new Node(value);                  //this takes linear time
//        Node temp = head;
//
//        while(temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next=node;
//        size++;
    }
    public void insert(int value , int index){         //Insert at index

        if(index==0){
            InsertAtFirst(value);
            return;
        }
        if(index==size){
            InsertAtLast(value);
        }
        if(index>size){
            System.out.println("Index is greater than current size: "+size);
            return;
        }

        Node temp = head;
        for(int i=1 ; i<index ;i++){
            temp=temp.next;
        }

        Node node = new Node(value , temp.next);
        temp.next =node;
        size++;



    }

    public void deleteFirst(){                      //Delete first node
        head = head.next;

        if(head==null){  //When list is null after deletion
            tail=null;
        }
        size--;
    }


    public void deleteLast(){                  //Delete Last Node

        if(size<=1){
            deleteFirst();
            return;
        }
        Node prev = get(size-2);
        prev.next=null;
        tail=prev;
        size--;
    }

    public void deleteNode(int index){        // Delete node with index
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size-1){
            deleteLast();
            return;

        }
        Node prev= get(index-1);
        prev.next = prev.next.next;
        size--;


    }

    public Node get(int index){                 //Get indexed node

        Node temp = head;
        for(int i=0 ;i<index ;i++){
            temp = temp.next;
        }
        return temp;
    }

    public Node find(int value){              //Get node with value
        Node node=head;

        while(node!=null){
            if(node.value == value){
                return node;
            }
            else{
                node=node.next;
            }
        }
        return null;
    }

    public void display(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.value+" -> " );
            temp =temp.next;
        }
        System.out.println("END");

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
}
