package com.dhurika;
//Binary Search problems


import java.util.Arrays;

public class Day_7 {
    //ceiling of a number:smallest number greater than equal to target
//    public static void main(String[] args) {
//        int[] arr = {2, 3, 5, 9, 14, 16, 18};
//        int target = 15;
//        int result = ceiling(arr, target);
//        System.out.println("The Ceiling of the number is " + result);
//    }
//
//    static int ceiling(int[] arr,int target){
//        int start=0;
//        int end=arr.length-1;
//        while(start<=end){
//            int mid=end+(start-end)/2;
//            if(target>arr[mid]){
//                start=mid+1;
//            }
//            else if(target<arr[mid]){
//                end=mid-1;
//            }
//            else {
//                return arr[mid];
//            }
//        }
//        return arr[start];
//    }

    //floor of a number:largest element less than or equal to target
//    public static void main(String[] args){
//        int[] arr={2,3,4,11,13,17,30};
//        int target=14;
//        int result=floor(arr,target);
//        System.out.println("The Floor of the given number is "+result);
//    }
//
//    static int floor(int[] arr,int target){
//        int start=0;
//        int end=arr.length-1;
//        while(start<=end) {
//            int mid = end + (start - end) / 2;
//            if (target >= arr[mid]) {
//                start = mid + 1;
//            } else if (target <= arr[mid]) {
//                end = mid - 1;
//            } else {
//                return arr[mid];
//            }
//        }
//            return arr[end];
//    }

    //find smallest letter greater than target.Letters should wrap around.
    //similar to ceiling problem
//    public static void main(String[] args){
//        char[] arr={'d','k','t'};
//        char target='t';
//        char result=findingCharacter(arr,target);
//        System.out.println("The Smallest letter greater than target is "+result);
//    }
//
//    static char findingCharacter(char[] arr,char target){
//        int start=0;
//        int end=arr.length-1;
//        while(start<=end){
//            int mid=start +(end-start)/2;
//            if(target<arr[mid]){
//                end=mid-1;
//            }
//            else{
//                start=mid+1;
//            }
//        }
//        return arr[start%arr.length];
//    }


    //find the first and the last position of the element:

    public static void main(String[] args){
        int[] arr={2,3,3,3,7,7,7,7,7,9};
        int target=7;
        int[] result=firstLast(arr,target);
        System.out.println("The first and the last position of the target is "+ Arrays.toString(result));
    }

    static int[] firstLast(int[] arr,int target){
        int[] ans={-1,-1};
        ans[0]=BS(arr,target,true);
        if(ans[0]!=-1){
            ans[1]=BS(arr,target,false);
        }
        return ans;
    }

    static int BS(int[] arr,int target,boolean findingStartindex){
       int ans=-1;
       int start=0;
       int end=arr.length-1;
       while(start<=end){
           int mid=start+(end-start)/2;
           if(target<arr[mid]){
               end=mid-1;
           }
           else if(target>arr[mid]){
               start=mid+1;
           }
           else{
               ans=mid;
               if(findingStartindex){
                   end=mid-1;
               }
               else{
                   start=mid+1;
               }

           }
       }
       return ans;
    }


}


