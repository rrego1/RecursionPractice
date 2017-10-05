/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionpractice;

/**
 *
 * @author reggs
 */
public class RecursionPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(factorial(7));
        
    }
    
    //Recursively calculates the nth number of the fibonacci sequence
    public static int fibonacciNumbers(int n){
        if(n <= 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return fibonacciNumbers(n - 1) + fibonacciNumbers(n - 2);
        }
    }
    
    //compute the sum of natural numbers up until n
    public static int sum(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return n + sum(n - 1);
        }
    }
    
    //calculate a*b only using addition and subtraction
    public static int multiplyByAdding(int a, int b){
        if(b == 0){
            return 0;
        }else if(b == 1){
            return a;
        }else{
            return a + multiplyByAdding(a, b - 1);
        }
    }
    
    //find the greatest common divisor
    public static int gcd(int i, int j){
       if(i > j){
           return gcdHelper(i, j, j);
       }else{
           return gcdHelper(j,i, i);
       }
    }
    
    public static int gcdHelper(int i, int j, int k){
        if(i % k == 0 && j % k == 0){
            return k;
        }else{
            return gcdHelper(i, j, k - 1);
        }
    }
    
    //calculates n!
    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }else{
            return n * factorial(n -1);
        }
    }
}
