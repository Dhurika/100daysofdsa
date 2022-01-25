package com.dhurika;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day_4 {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        int[] arr = new int[7];
//        //getting array from the user
//        System.out.println("Enter Seven Elements: ");
//        for (int i = 0; i < 7; i++) {
//            arr[i] = in.nextInt();
//        }
        //printing array using for loop

//        System.out.println("The Array you entered is ");
//        System.out.println("Using for loop");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println("\nUsing for each loop");
//        //printing array using for-each loop
//
//        for (int element : arr) {
//            System.out.print(element + " ");
//        }
//        System.out.println("\nUsing toString Method");
//        System.out.print(Arrays.toString(arr));
//        System.out.println();
//        System.out.println("Enter the index to be swapped:");
//        int index1 = in.nextInt();
//        int index2 = in.nextInt();
//        swapping(arr, index1, index2);
//        int max=maximum(arr);
//        System.out.println("The maximun element of the array is "+max);
//        reverse(arr);
//        twoDArray();
//        Arraylist();
        MultiArraylist();
    }
    //swapping

    static void swapping(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        System.out.println("The Swapped Array is ");

        for(int element:arr){
            System.out.print(element+" ");
        }
    }
//maximum of an array
  static int maximum(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
  }
  //reversing an array
  static void reverse(int[] arr) {
      int start = 0;
      int end = arr.length-1;
      System.out.print("The Array is "+Arrays.toString(arr));
      while(start != end) {
          int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
          start++;
          end--;
      }
      System.out.println();
      System.out.print("The Swapped Array is "+Arrays.toString(arr));
  }


  static void twoDArray(){

      Scanner in = new Scanner(System.in);
          // declaration of 2d array
      int[][] arr=new int[3][3];
      System.out.println("Enter the elements: ");
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              arr[i][j]=in.nextInt();
          }
      }
      System.out.println("Printed using for loop");
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              System.out.print(arr[i][j]+" ");
          }
          System.out.println();
      }
      System.out.println("Printing using for-each loop");
      for(int[] element : arr){
          for(int item: element){
              System.out.print(item+" ");
          }
          System.out.println();
      }

      System.out.println("Printing using toString method");
      for (int i = 0; i < 3; i++) {
          System.out.println(Arrays.toString(arr[i]));
      }
    }

    static void Arraylist(){
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(15);
        list.add(30);
        list.add(11);
        list.add(12);
        System.out.print(list+" ");
        System.out.println(list.contains(30));
    }
    static void MultiArraylist(){
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        Scanner in = new Scanner(System.in);
        //initializing the arraylist

        for(int i=0;i<3;i++){
           list.add(new ArrayList<>());
        }

        for(int i=0;i<3;i++){
            for (int j = 0; j < 3; j++) {
               list.get(i).add(in.nextInt());
            }
        }
        System.out.print(list);
    }



}


