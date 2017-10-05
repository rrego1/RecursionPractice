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
        System.out.println(multiplyByAdding(4,8));
        
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
    
    //calculate a*b without multiplying
    public static int multiplyByAdding(int a, int b){
        if(b == 0){
            return 0;
        }else if(b == 1){
            return a;
        }else{
            return a + multiplyByAdding(a, b - 1);
        }
    }
}
