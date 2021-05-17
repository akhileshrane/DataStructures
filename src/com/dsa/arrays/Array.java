package com.dsa.arrays;
import java.util.Arrays;

public class Array {
    static int length=0;
    static int[] arr;

    public Array (int size) {
        length = size;
        arr = new int[length];
    }


    public static void insert(int element, int index){
       growArray(index);
    
       arr[index] = element;  
       
    }

    public static void delete(int indexesToDelete){
        length = length - indexesToDelete;
        int[] newArr = new int[length];
        for(int i =0 ; i < newArr.length ; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public static void delete(){
        length = length - 1;
        int[] newArr = new int[length];
        for(int i =0 ; i < newArr.length ; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public static int size(){
        return arr.length;
    }

    public static void print(){
        for(int i : arr){
            System.out.println(i);
        }
    }
    public int max(){
        int max = 0;
        for(int i : arr){
            if(i>=max){
                max = i;
            }
        }
        return max;
    }

    public int[] intersect(int[] secondArr){
        int[] common = new int[secondArr.length];

        int index = 0;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < secondArr.length; j++){
                if(arr[i] == secondArr[j]) {
                    common[index++] = arr[i];
                    break;
                }
            }
        }
        return common;
    }

    public int[] reverse(){
        int[] reversed = new int[length];
        int index = 0;
       
        for(int i = length - 1; i >= 0 ; i--) {
           reversed[index++] = arr[i];
        }
        return reversed;
    }

    private static void growArray(int index){
   
        if(index > 0.75*length) {
            System.out.println("Growing");
            length = length*2;
            int[] tmpArr = new int[length];
       
           for(int i =0 ; i<arr.length ; i++) {
            tmpArr[i] = arr[i];
           }

             arr = tmpArr;
        }
    
    }

    public static void main(String[] args) {
        Array newArr = new Array(5);

        
        newArr.insert(5,0);
        newArr.insert(6,1);
        newArr.insert(7,2);
        newArr.insert(10,3);
        
        newArr.insert(87,9);
        newArr.insert(109,16);
        newArr.print();

        System.out.println("Length " + newArr.size());  

        System.out.println(newArr.max());
        System.out.println("Length " + newArr.size());

        int[] secondArr = {5,7,109};
        System.out.println(Arrays.toString(newArr.intersect(secondArr)));
        System.out.println(Arrays.toString(newArr.reverse()));
    }
}