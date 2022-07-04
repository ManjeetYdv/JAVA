package com.company;

import com.sun.source.tree.Tree;

import java.util.*;

public class Candy {

    public static void main(String[] args) {


        //Sorting map acc to key

        //Map is always sorted acc to key
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(3 , 1);
        map.put(2 ,2 );

        for(int i : map.keySet()){
            System.out.print(i+" ");
        }
        System.out.println();


      //Sorting map acc to value

        HashMap<Integer , Integer> map3 = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a , b)->map3.get(a)-map3.get(b));
        map3.put(6, 5);
        map3.put(5 , 1);
        map3.put(4,1);
        map3.put(7,1);
        map3.put(2 , 2);

       for(int i:map3.keySet()){
           pq.add(i);
       }

       while(!pq.isEmpty()){
            int x = pq.remove();
           System.out.println(x +" : "+map3.get(x));
       }






    }
}
