package com.dhurika;
import java.util.Scanner;
public class Assignment_2 {

    //factors of  a number
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n=in.nextInt();
//        System.out.println("The factors of "+n+" is: ");
//        for(int i=1;i<=n;i++){
//            if(n%i==0){
//                System.out.println(i);
//            }
//        }
//    }


    //THE SUM OF N NUMBERS
// public static void main(String[] args){
//     Scanner in = new Scanner(System.in);
//     int a,sum=0;
//     do{
//         System.out.print("Enter number: ");
//         a=in.nextInt();
//         sum+=a;
//     }while(a!=0);
//     System.out.println("The sum of all the numbers you entered is "+sum);
// }


    //largest among all the numbers you entered
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a, max = 0;
//        do {
//            System.out.print("Enter number: ");
//            a = in.nextInt();
//            if (a > max) {
//                max = a;
//            }
//        } while (a != 0);
//        System.out.println("The largest among all the numbers you entered is " + max);
//
//    }

    //factorial
//    public static  void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n=in.nextInt();
//        int product=1;
//        for(int i=1;i<=n;i++){
//            product*=i;
//        }
//        System.out.println("The Factorial of "+n+" is "+product);
//    }

//Average of n numbers
//    public static void main(String[] args){
//        Scanner in =new Scanner(System.in);
//        int n,count=0,sum=0;
//        do{
//          System.out.print("Enter the number: ");
//          n=in.nextInt();
//          sum+=n;
//          count++;
//        }while(n!=0);
//        int avg=sum/(count-1);
//        System.out.println("The average is "+avg);
//    }

    //power in java
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter base: ");
//        int base=in.nextInt();
//        System.out.print("Enter Exponent: ");
//        int exp=in.nextInt();
//        int prod=1;
//        for(int i=0;i<exp;i++){
//            prod*=base;
//        }
//        System.out.println(base+" to the power "+exp+" is "+prod);
//    }


    //ncr and npr
    /*
      ncr=n!/r!(n-r)!
      npr=n!/(n-r)!
     */

    //creating function for finding factorial make it easier

//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        int n=in.nextInt();
//        System.out.print("Enter r: ");
//        int r=in.nextInt();
//        int ncr= factorial(n)/(factorial(r)*factorial(n-r));
//        int npr=factorial(n)/factorial(n-r);
//        System.out.println("The nCr is "+ncr);
//        System.out.println("The nPr is "+npr);
//    }
//    static int factorial(int n){
//        int prod=1;
//        for(int i=1;i<=n;i++){
//            prod*=i;
//        }
//        return prod;
//    }


    //number is palindrome or not

//    public static void main(String[] args) {
//        Scanner in= new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num=in.nextInt();
//        int temp=num,sum=0;
//        while(temp>0){
//            int digit=temp%10;
//            sum=sum*10+digit;
//            temp/=10;
//        }
//        if(sum==num){
//            System.out.println("The given number is a Palindrome");
//        }
//        else{
//            System.out.println("The given number is not a palindrome");
//        }
//    }

    //hcf
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        for (int j = num1; j > 0; j--) {
            if (num1 % j == 0) {
                if (num2 % j == 0) {
                    System.out.println("The HCF is " + j);
                    break;
                }
            }
        }
    }


}

