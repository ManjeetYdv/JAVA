package com.company;

public class floorVal {

    static int floorVal(int[]arr , int t){

        int res = 0;

        for(int i : arr){

            if(i<=t){
                res = Integer.max(res ,i);
            }
        }

        return res;

    }

    static int ceilingVal(int[]arr , int t){

        int res = 999;

        for(int i : arr){
            if(i>=t){
                res = Integer.min(res , i);
            }
        }
        return res;
    }
    public static void main(String[] args) {

        int[]arr = {4 ,5 ,6, 8,9 };

        System.out.println(floorVal(arr , 7));
        System.out.println(ceilingVal(arr , 7));

    }
}
