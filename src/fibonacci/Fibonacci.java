/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Edgaras
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = sc.nextInt();
        System.out.println("Enter second number");
        int second = sc.nextInt();
        System.out.println("Enter max number");
        int max = sc.nextInt();
        System.out.println("Your fibonacci:");
        fib(first,second,max);
        
    }    
    public static void fib(int first, int second, int max) {
        System.out.println(first);
        
        int next = first + second;
        if(next >=0 && max >= 0) {
            if (next > max) {
                System.out.println(second);
            } else {
                fib(second, next, max); 
            }
        } else if (next < 0 && max > 0) {
            next = next - 2 * next;
            if (next > max) {
                System.out.println(second);
            } else {
                next = next - 2 * next;
                fib(second, next, max); 
            }
        } else if (max < 0) {
            if (next > max){
                fib(second, next, max);
            } else {
                System.out.println(second);
            }
        } 
    }
}
