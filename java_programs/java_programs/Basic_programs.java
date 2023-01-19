package java_programs;

import java.util.*;
public class Basic_programs {
//         static void LCM(int num1,int num2){
//             int lcm=0;
//             int max = (num1>num2) ? num1 : num2 ;
//             
//             for (int i = max; i <= num1 * num2; i++)
//      {
//     if (i % num1 == 0 && i % num2 == 0)
//        {
//         lcm = i;
//         break;
//        }
//      }
//    System.out.println ("The LCM: " + lcm);
//             System.out.println(lcm);
//         }
//         static void HCF(int a,int b){
//             int hcf=0;
//             for(int i=1;i<=a || i<=b;i++){
//                 if(a%i==0 && b%i==0){
//                     hcf=i;
//                 }
//             }
//             System.out.println(hcf);
//         }
//       static void automorphicNumber(int n){
//           
//            double x;
//            x = Math.pow(n, 2);
//            
//            if(x%10==n){
//                System.out.print("number is automorphic Number");
//            }
//            else{
//                System.out.print("number is not automorphic Number");
//            }
//            
//       }
//     static void perfectNumber(int n){
//         
//         int sum=0;
//         for(int i=1;i<n;i++){
//             if(n%i==0){
//                 sum+=i;
//             }
//         }
//         if(sum==n){
//             System.out.print("number is perfect");
//         }
//         else{
//             System.out.print("number is not  perfect");
//         }
//     }
//    static int factorial(int n){
//        if(n==0){
//            return 1;
//        }
//        return n*factorial(n-1);
//    }
//    static void strongNumber(int n){
//        int d=n;
//        int sum=0;
//        while(d!=0){
////            int r=d%10;
//            sum+=factorial(d%10);
//            d/=10;
//        }
//        if(sum==n){
//            System.out.println(n+" is a Strong number");
//        }else{
//            System.out.print(n+" is not a strong number");
//        }
//    }
//    static void fibonacci_Series(int n){
//        int a=0,b=1;
//        System.out.print(a+" "+b+" ");
//        int c;
//        
//        for(int i=2;i<n;i++){
//            c=a+b;
//            a=b;
//            b=c;
//            
//            System.out.print(c+" ");
//        }
//    }
//    static int count(int d){
//        int c=0;
//        while(d!=0){
//            c++;
//            d/=10;
//        }
//        return c;
//    }
//    static void Armstrong_upto_n(int n){
//        for(int i=1;i<=n;i++){
//            int d=i;
//            int len=count(i);
//            int sum=0;
//            while(d!=0){
//                int r=d%10;
//                sum+=Math.pow(r, len);
//                d/=10;
//            }
//            if(i==sum){
//                System.out.println(i);
//            }
//        }
//    }
//    static void Armstrong(int n){
//        int count=0;
//        int d=n;
//        int m=n;
//        while(d!=0){
//            count++;
//            d=d/10;
//        }
//        int sum=0;
//        
//        while(m!=0){
//            int r = m%10;
//            sum+=Math.pow(r, count);
//            m/=10;
//        }
//        if(sum==n){
//            System.out.println("number is armstrong");
//        }else{
//            System.out.println("number is not armstrong");
//        }
//    }
//    static void palindrome(int n){
//        int d=n;
//        int sum=0;
//        while(d!=0){
//            int r=d%10;
//            sum=sum*10+r;
//            d=d/10;
//        }
//        if(sum==n){
//            System.out.print("number is palindrome");
//        }
//        else{
//            System.out.print("not palindrome");
//        }
//    }
    
//    static void reverse(int n){
//        int sum=0;
//        while(n!=0){
//            int r=n%10;
//            sum=sum*10+r;
//            n=n/10;
//        }
//        System.out.print(sum);
//    }
//    static void Sum_of_digits(int n){
//        int sum =0;
//        while(n!=0){
//            int r =n%10;
//            sum = sum+r;
//            n=n/10;
//        }
//        System.out.println(sum);
//    }
//          static void prime_upto_n(int n){
//              for(int i=1;i<=n;i++){
//                  int count=0;
//                  for(int j=1;j<=i;j++){
//                      if(i%j==0){
//                          count++;
//                      }
//                  }
//                  if(count==2){
//                      System.out.println(i);
//                  }
//              }  
//          }
//        static void prime(int n){
//            int count=0;
//            for(int i=1;i<=n;i++){
//                if(n%i==0){
//                    count++;
//                }
//            }
//            if(count==2){
//                System.out.print(n+" is prime\n");
//            }
//            else{
//                System.out.print(n+"is not a prime\n");
//            }
//        }
//      static void leap_year(int n){
//          if((n%4==0 && n%100!=0) || n%400==0){
//              System.out.println(n +" is a leap year");
//          }
//          else{
//              System.out.println(n + " is not a leap");
//          }
//      }
//    static void greater_of_three(int a,int b,int c){
//        
//        if(a>b && a>c){
//            System.out.println(a+" is greater");
//        }
//        else if(b>a && b>c){
//            System.out.println(b+" is greater");
//        }
//        else{
//            System.out.println(c+" is greater");
//        }
//    }
//    static int sum_of_first_n_numbers(int n) {
////        int sum = 0;
////        for(int i=1;i<=n;i++){
////            sum+=i;
////        }
////        System.out.println("using simple for loop"+sum);
//        
//        if(n==0){
//            return n;
//        }
//        return n+ sum_of_first_n_numbers(n-1);
//    }
//    static void even_or_odd(int n){
//        if(n==0){
//            System.out.println("even");
//        }
//        if(n%2==0){
//            System.out.println("even");
//        }else{
//            System.out.println("odd");
//        }
//    }

//    static void checkpositive_or_negative(int n){
//        if(n>0){
//            System.out.println("positive");
//        }
//        else if(n<0){
//            System.out.println("negative");
//        }
//        else{
//            System.out.println("zero");
//        }
//    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
//      checkpositive_or_negative(n);
//      even_or_odd(n);
//      int p=sum_of_first_n_numbers(n);
//      System.out.println("using recurstion :"+p);
//      greater_of_three(14,13,11);

//        leap_year(n);

//        prime(n);
//          prime_upto_n(n);
//          Sum_of_digits(n);
//        reverse(n);
//        palindrome(n);
//        Armstrong(n);
//        Armstrong_upto_n(n);
//        fibonacci_Series(n);
                
//        strongNumber(n);
//        perfectNumber(n);
//        automorphicNumber(n);
//        HCF(36,60);
//        LCM(36,60);
        sc.close();
    }
}
