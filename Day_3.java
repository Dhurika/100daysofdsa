package com.dhurika;

import java.util.Scanner;
import java.lang.String;


public class Day_3 {
    //Vowel or consonent
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a character: ");
//        char letter=in.next().trim().charAt(0);
//        //used switch case
//        switch(letter){
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//            case 'A':
//            case 'E':
//            case 'I':
//            case 'O':
//            case 'U':
//                System.out.println(letter +" is a vowel");
//                break;
//            default:
//                System.out.println(letter +" is a consonent");
//        }
//        //enhanced switch
//
//        switch(letter){
//            case 'a','e','i','o','u','A','E','I','O','U' -> System.out.println("Vowel");
//            default -> System.out.println("Consonant");
//        }
//    }

    //perfect number
//    public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num=in.nextInt();
//         int sum=0;
//         for(int i=1;i<num;i++){
//             if(num%i==0){
//                 sum+=i;
//             }
//         }
//         if(sum==num){
//             System.out.println(num+" is a perfect number!");
//         }
//         else{
//             System.out.println(num+" is not a perfect number!");
//         }
//    }

    //Leap year or not
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a year: ");
//        int year=in.nextInt();
//        if(year%4==0){
//            System.out.println(year+" is a leap year");
//        }
//        else{
//            System.out.println(year+" is not a leap year");
//        }
//
//    }


    //sum of the digits
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = in.nextInt();
//        int sum=0;
//        while(num>0){
//            int digit= num%10;
//            sum+=digit;
//            num/=10;
//        }
//        System.out.println("The sum of the digit is: "+sum);
//    }

    //count even days in the month of august
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        System.out.println("In the month of august We have 31 days!");
//        int count=0;
//        for(int i=1;i<=31;i++){
//            if(i%2==0){
//                count++;
//            }
//        }
//        System.out.println("The number of Even days in the month of August is "+count);
//    }
    //a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user.
    // The list terminates when the user enters a zero.

//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter numbers one by one if you want to stop press 0");
//        int negSum=0,PosEven=0,PosOdd=0;
//        int num=0;
//        do{
//            num=in.nextInt();
//            if(num<0){
//                negSum+=num;
//            }
//            if(num>0){
//                if(num%2==0){
//                    PosEven+=num;
//                }
//                else{
//                    PosOdd+=num;
//                }
//            }
//        }while(num!=0);
//        System.out.println("The sum of negative numbers is "+negSum);
//        System.out.println("The sum of Positive Even numbers is "+PosEven);
//        System.out.println("The sum of Positive Odd numbers is "+PosOdd);
//    }

    /*
    Functions/Methods in Java
     */

 //1.Largest and smallest among three numbers
    //main function!
//    public static void main(String[] args) {
//        Scanner in= new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        int num1=in.nextInt();
//        System.out.print("Enter Second number: ");
//        int num2=in.nextInt();
//        System.out.print("Enter third number: ");
//        int num3=in.nextInt();
//        int result=maximum(num1,num2,num3);//returns a value
//        System.out.println("The Largest among the three numbers is "+result);
//        minimum(num1,num2,num3);
//
//    }
//    static int maximum(int a,int b,int c){
//        if(a>b && a>c){
//            return a;
//        }
//        else if(b>a && b>c){
//            return b;
//        }
//        else{
//            return c;
//        }
//    }
//    static  void  minimum(int a,int b,int c){
//        if(a<b && a<c){
//            System.out.println("The Smallest among the three numbers is "+a);
//        }
//        else if(b<a && b<c){
//            System.out.println("The Smallest among the three numbers is "+b);
//        }
//        else{
//            System.out.println("The Smallest among the three numbers is "+c);
//        }
//    }

    //grade of a student

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter your marks out of 100: ");
//        int mark=in.nextInt();
//        String result=gradeCalc(mark);
//        System.out.println("Your grade is "+result);
//    }
//    static String gradeCalc(int mark){
//        if(mark>=91 && mark <=100){
//            return "AA";
//        }
//        else if(mark>=81 && mark <=90){
//               return "AB";
//        }
//        else if(mark>=71 && mark <=80){
//            return "BB";
//        }
//        else if(mark>=61 && mark <=70){
//                 return "BC";
//        }
//        else if(mark>=51 && mark <=60){
//                    return "CD";
//        }
//        else if(mark>=41 && mark <=50){
//              return "DD";
//        }
//        else {
//              return "Fail";
//        }
//
//    }


    //triplet
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter first side: ");
//        int s1=in.nextInt();
//        System.out.println("Enter second side: ");
//        int s2=in.nextInt();
//        System.out.println("Enter third side: ");
//        int s3=in.nextInt();
//        int result = triplet(s1,s2,s3);
//        if(result==0){
//            System.out.println("Not a Triplet!!!");
//        }
//        else if(result==1){
//            System.out.println("Triplet");
//        }
//    }
//    static int triplet(int a,int b, int c){
//       if((a*a)+(b*b)==(c*c)){
//           return 1;
//       }
//       else{
//           return 0;
//       }
//    }


    //prime numbers within a given range
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter starting range: ");
        int Sr=in.nextInt();
        System.out.print("Enter Ending range: ");
        int Er=in.nextInt();
        prime(Sr,Er);
    }
    static void prime(int s,int e){
        int count=0;
        System.out.println("The Prime numbers between "+s+" and "+e+" are ");
        for (int i = s; i <= e ; i++) {
            for (int j = 1; j <= i; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
            count=0;
        }
    }

}
