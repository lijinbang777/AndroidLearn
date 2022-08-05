package com.example.myapplication;

import java.lang.reflect.Array;
import java.util.Arrays;

class Node{
    private Node next;
    private  int value;
    public Node (int value){
        this.value = value;
    }
    public Node(Node node,int value){
        this.next = node;
        this.value = value;
    }
}
public class Algorithm {

    /*
    交换两个数
    * */
    private static void swapOp1(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static void swapOp2(int[] arr,int a, int b){
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }
    /*
    选择排序
    * */
    public static void selectSort(int[] arr){
        System.out.println("选择排序前" + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]){
                    swapOp1(arr,j,minIndex);
                }
            }
        }
        System.out.println("选择排序后的结果为" + Arrays.toString(arr));
    }
    /*
    插入排序
    * */
    public static void insertSort(int[] arr){
        System.out.println("插入排序前" + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j >= 0 && arr[j] > arr[j+1] ; j--) {
                swapOp1(arr,j,j+1);
            }
        }
        System.out.println("插入排序后的结果为" + Arrays.toString(arr));
    }
    /*
    冒泡排序
    * */
    public static void  buddleSort(int[] arr){
        System.out.println("冒泡排序前" +Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j+1]){
                    swapOp1(arr,j,j+1);
                }
            }
        }
        System.out.println("冒泡排序后的结果为" + Arrays.toString(arr));
    }
}
