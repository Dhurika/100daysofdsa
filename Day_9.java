package com.dhurika;
//rotated binary Search


import java.util.Arrays;

public class Day_9 {
//    public static void main(String[] args){
//        int[] arr={5,6,7,10,12,13,2,4,5,7,8,9};
//        int target=13,result;
//        int pivot=findPivot(arr);
//        System.out.println("The Pivot of the array is "+arr[pivot]);
//        if(pivot==-1){
//            result=binarySearch(arr,target,0,arr.length-1);
//        }
//        else if(arr[pivot]==target){
//            result=pivot;
//        }
//        else{
//            result=binarySearch(arr,target,0,pivot-1);
//            if(result==-1){
//                result=binarySearch(arr,target,pivot+1, arr.length-1);
//            }
//        }
//        System.out.println("The target element is found at the index "+result);
//
//        int[] arr2={2,2,2,3,4,4,4,4,4,5,1,2,3,4};
//        int pivot=findPivotWithDuplicates(arr2);
//        System.out.println("The Pivot in array containing duplicate elements "+arr2[pivot]);
//    }
//
//    static int findPivot(int[] arr){  //without duplicates
//        int start=0;
//        int end=arr.length-1;
//
//        while(start<=end){
//            int mid=start+(end-start)/2;
//
//            if(mid<end && arr[mid]>arr[mid+1]){
//                return mid;
//            }
//            if(start<mid && arr[mid]<arr[mid-1]){
//                return mid-1;
//            }
//            if(arr[start] > arr[mid]){
//                end=mid-1;
//            }
//            else{
//                start=mid+1;
//            }
//        }
//        return -1;
//    }
//    static int findPivotWithDuplicates(int[] arr){
//        int start=0;
//        int end=arr.length-1;
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if(mid<end && arr[mid]>arr[mid+1]){
//                return mid;
//            }
//            if(start<mid && arr[mid]<arr[mid-1]){
//                return mid-1;
//            }
//            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
//                if(start<end && arr[start]>arr[start+1]){
//                    return start;
//                }
//                start++;
//
//                if(end>start && arr[end]<arr[end-1]){
//                    return end-1;
//                }
//                end--;
//            }
//            else if(arr[start] < arr[mid] || (arr[start]==arr[mid] && arr[mid] > arr[end])){
//                start=mid+1;
//            }
//            else{
//                end=mid-1;
//            }
//        }
//        return -1;
//    }
//    static int binarySearch(int[] arr,int target,int start,int end){
//        while(start<=end){
//            int mid=start+(end-start)/2;
//
//            if(arr[mid]>target){
//                end=mid-1;
//            }
//            else if(arr[mid]<target){
//                start=mid+1;
//            }
//            else{
//                return mid;
//            }
//        }
//        return -1;
//    }

    //Binary Search in 2D Array

    // 1.Matrix which is sorted in row wise as well as column wise

//    public static void main(String[] args){
//        int[][] matrix={
//                {10,20,30,40},
//                {15,21,32,45},
//                {17,32,44,51}
//        };
//        int target=21;
//        int[] result=searchInMatrix(matrix,target);
//        System.out.println("The element is found at "+ Arrays.toString(result));
//    }
//
//    static int[] searchInMatrix(int[][] matrix,int target){
//        int row=0;
//        int column=matrix[row].length-1;
//
//        while(row<matrix.length && column>=0){
//            if(matrix[row][column]==target){
//                return new int[] {row,column};
//            }
//            else if(matrix[row][column] > target){
//                column--;
//            }
//            else{
//                row++;
//            }
//        }
//        return new int[] {-1,-1};
//    }

    public static void main(String[] args){
        int[][] matrix={
                {1, 2, 3},
                {4, 5 ,6},
                {7, 8, 9}
        };
        int target=5;
        int[] result=searchInSortedArray(matrix,target);
        System.out.println("The element is found at the position "+Arrays.toString(result));
    }

    static int[] binarySearch(int[][] matrix,int target,int row,int cStart, int cEnd){
        while(cStart<=cEnd){  //similar to binary search
            int mid=cStart+(cEnd-cStart)/2;
            if(matrix[row][mid] == target){
                return new int[] {row,mid};
            }
            if(matrix[row][mid] < target){
                cStart=mid+1;
            }
            else{
                cEnd=mid-1;
            }
        }
        return new int[] {-1,-1};
    }

    static int[] searchInSortedArray(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        if(cols==0){ //nothing exists
            return new int[] {-1,-1};
        }
        if(rows==1){ //if only one row presents
            return binarySearch(matrix,target,0,0,cols-1);
        }

        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;

        while(rStart < (rEnd-1)){ //this loop will run until only two rows are remaining
            int mid=rStart+(rEnd-rStart)/2;

            if(matrix[mid][cMid] == target){
                return new int[] {mid,cMid};
            }
            if(matrix[mid][cMid]  < target){
              rStart=mid;
            }
            else{
                rEnd=mid;
            }
        }

        if(matrix[rStart][cMid] == target){
            return new int[] {rStart,cMid};
        }
        if(matrix[rStart+1][cMid] == target){
            return new int[] {rStart+1,cMid};
        }

        if(target <= matrix[rStart][cMid-1]){
            return binarySearch(matrix,target,rStart,0,cMid-1);
        }
        if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1]){
            return binarySearch(matrix,target,rStart,cMid+1,cols-1);
        }
        if(target <= matrix[rStart+1][cMid-1]){
            return binarySearch(matrix,target,rStart+1,0,cMid-1);
        }
       else{
            return binarySearch(matrix,target,rStart+1,cMid+1,cols-1);
        }
    }
}
