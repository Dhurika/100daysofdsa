package com.dhurika;

public class Day_6 {
    //binary search
//    public static void main(String[] args) {
//        int[] arr={2,14,15,27,30,34,56,72,89,95};
//        int target=30;
//        int start=0,end=arr.length-1;
//        int result=binarySearch(arr,target,start,end);
//        if(result==-1){
//            System.out.println("The Element you searched doesn't found!");
//        }
//        else{
//            System.out.println("The Element you searched is available at the index "+result);
//        }
//    }
//    static int binarySearch(int[] arr,int target,int start,int end){
//        while(start<=end) {
//            int mid = (start + (end - start)) / 2;
//             if (arr[mid] > target) {
//                end = mid - 1;
//            } else if (arr[mid] < target) {
//                start = mid + 1;
//            }
//             else{
//                 return mid;
//             }
//        }
//        return -1;
//    }
    public static void main(String[] args) {
        //orderagnostic binary search

        int[] arr = {213, 99, 87, 74, 54, 30, 21, 11, 4};
        int target = 30;
        int result = orderAgnosticBS(arr, target);
        if (result == -1) {
            System.out.println("The Element you have searched not found!");
        } else {
            System.out.println("The Element you have searched is available at the index " + result);
        }
    }

    static int orderAgnosticBS(int[] arr, int target) {
        if (arr[0] <= arr[arr.length - 1]) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
            return -1;
        } else {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] < target) {
                    end = mid - 1;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
    }
}


