package com.dhurika;

import java.util.Scanner;

public class Assignment1 {
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = in.nextInt();
//        if(num%2==0){
//            System.out.println("The number is Even");
//        }
//        else{
//            System.out.println("The number is odd");
//        }
//    }


// public static void main(String[] args){
//     System.out.print("Enter your name: ");
//     Scanner in=new Scanner(System.in);
//     String name=in.nextLine();
//     System.out.println("Hello "+ name +"!");
// }

//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter principle: ");
//        int p = in.nextInt();
//        System.out.print("Enter rate: ");
//        float r = in.nextFloat();
//        System.out.print("Enter time: ");
//        int n = in.nextInt();
//        System.out.println("The Simple Interest is "+(p*n*r/100));
//
//    }
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        int a=in.nextInt();
//        System.out.print("Enter Second number: ");
//        int b=in.nextInt();
//        System.out.print("Enter the operator(+/-/*//): ");
//        String op=in.next();
//        if(op.equals("+")){
//            System.out.println("The Sum is "+(a+b));
//        }
//        else if(op.equals("-")){
//            System.out.println("The difference is "+(a-b));
//        }
//        else if(op.equals("*")){
//            System.out.println("The Product is "+(a*b));
//        }
//        else if(op.equals("/")){
//            System.out.println("The Division is "+(a/b));
//        }
//        else{
//            System.out.println("Invalid Operator");
//        }
//    }

//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        int num1=in.nextInt();
//        System.out.print("Enter Second number: ");
//        int num2=in.nextInt();
//        if(num1>num2){
//            System.out.println("The first number is greater!");
//        }
//        else{
//            System.out.println("The Second number is greater!");
//        }
//    }

// public static void main(String[] args){
//  Scanner in = new Scanner(System.in);
//  System.out.print("Enter rupees: ");
//  int rupee = in.nextInt();
//  System.out.println("The Equivalent dollar is "+ (rupee*0.014));
// }

 public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  System.out.print("Enter number of terms: ");
  int n = in.nextInt();
  int count=0;
  int i=0,j=1;

  while(count!=n){
    System.out.print(i+" ");
    int temp=i;
    i=j;
    j+=temp;
    count++;
  }
 }

}