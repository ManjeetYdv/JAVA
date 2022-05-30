package com.company;

import java.util.PriorityQueue;

public class priority_queue {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();   //Min-Heap by default
        pq.add(10);
        pq.add(5);
        pq.add(25);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());       //output ->5 , 10 , 25
            pq.poll();
        }

//        pq.add(-10);                          For Max-Heap
//        pq.add(-5);
//        pq.add(-25);
//
//        while(!pq.isEmpty()){
//            System.out.println(-pq.peek());      output -> 25 , 10, 5
//            pq.poll();
//        }
    }

    public 
}
