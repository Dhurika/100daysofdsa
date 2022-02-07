package com.dhurika;
//find the element in infinite array
//infinite array : we actually assume it to be infinite and avoid using length function

public class Day_8 {
//    public static void main(String[] args){
//        int[] arr={2,3,4,5,6,7,8,12,15,17,21,24,29,30};
//        int target= 17;
//        int result=startEndFinder(arr,target);
//        System.out.println("The Position of the target element in the infinite array is "+result);
//    }
//    static int startEndFinder(int[] arr,int target){
//        int start=0;
//        int end=1;
//        int result=binarySearch(arr,target,start,end);
//        while(result ==-1){
//            start=end+1;
//            end=2 * start +1;
//            result=binarySearch(arr,target,start,end);
//        }
//        return result;
//
//    }
//    static int binarySearch(int[] arr,int target,int start,int end) {
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (arr[mid] > target) {
//                end = mid - 1;
//            } else if (arr[mid] < target) {
//                start = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }

    //find the peak index in mountain array/bitonic array
    //mountain array:first the array increases then it decreases

//    public static void main(String[] args){
//        int[] arr={0,1,2,3,6,5,2,1};
//        int result=peakElement(arr);
//        System.out.println("The Peak element in this bitonic array is "+arr[result]);
//    }
//
//    static int peakElement(int[] arr){
//        int start=0;
//        int end=arr.length-1;
//        while(start<end) {
//            int mid = start + (end - start) / 2;
//            if(arr[mid]>arr[mid+1]){
//                end=mid;
//            }
//            else{
//               start=mid+1;
//            }
//        }
//      return end;
//    }

    public static void main(String[] args){
        int[] arr={2,3,4,5,8,7,6,1};
        int target=1,result;
        int peak=findPeakElement(arr);
        if(arr[peak]==target) {
            result = peak;
        }
        else{
            result=orderAgnosticBS(arr,target,0,peak-1);
            if(result==-1){
                result=orderAgnosticBS(arr,target,peak+1,arr.length-1);
            }
        }
        if(result==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("The Element is found at the index "+result);
        }

    }

    static int orderAgnosticBS(int[] arr,int target,int start,int end) {
        if (arr[start] <= arr[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        } else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
    }

    static int findPeakElement(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
               end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
