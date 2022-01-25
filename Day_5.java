package com.dhurika;

import java.util.Scanner;

public class Day_5 {
    public static void main(String[] args) {
        //linear Search
//        Scanner in = new Scanner(System.in);
//        int[] arr={2,13,25,38,49,56,76,84,90,123};
//        int target=2;
//        int result=LinearSearch(arr,target);
//        System.out.print("Enter the Starting index: ");
//        int index1=in.nextInt();
//        System.out.print("Enter the Ending index: ");
//        int index2=in.nextInt();
//        int result=SearchInRange(arr,index1,index2,target);
        int[][] Arr2D = {
                {1, 11, 23},
                {23, 45, 87},
                {34, 22, 98}
        };
        int target = 22;
        int[] result = SearchIn2D(Arr2D, target);
        if (result[0] == -1 && result[1] == -1) {
            System.out.println("The Element you searched is not found");
        } else {
            System.out.println("The Element you searched is found at the row " + result[0] + " and column " + result[1]);
        }
//        int result=StringSearch();
//        if(result==-1){
//            System.out.println("The Character you searched not found");
//        }
//        else{
//            System.out.println("The Character you searched is found at the index: "+ result);
//        }


    }


//    static int LinearSearch(int[] arr,int target){
//        if(arr.length==0){
//            return -1;
//        }
//        else{
//            for (int i = 0; i < arr.length; i++) {
//                if(arr[i]==target){
//                    return i;
//                }
//            }
//            return -1;
//        }
//    }


    //search in string

    static int StringSearch() {
        String name = "Dhurika";
        char target = 'D';
        if (name.length() == 0) {
            return -1;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

    static int SearchInRange(int[] arr, int i1, int i2, int target) {
        if (arr.length == 0) {
            return -1;
        } else {
            for (int i = i1; i < i2 + 1; i++) {
                if (target == arr[i]) {
                    return i;
                }
            }
            return -1;
        }
    }

    static int[] SearchIn2D(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}


