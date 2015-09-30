/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaplan_7_evens;

/**
 * 
 * @author akaplan
 */
public class Kaplan_7_Evens {

    public static void main(String[] args) {
    //what happens in the loop,
    //will happen again and again
    //until the loop exits
    int counter = 0;
    for(int i = 0; i <100; i++) {
        if (isPrime(i)) {
            counter += 1;
            System.out.println(" We have " + counter + " evens ");
            
        }
    }
    System.out.println(" We have "+ counter + " total evens ");
    }
    /* A method is like a little program,
    A method is an action that you want to repeat frequently
    */
    static boolean isEven (int somenumber) {
        return (somenumber % 2 == 0);    
    }
    static boolean isOdd (int someNumber) {
        return (someNumber % 2 != 0);
    }
    static boolean isPrime (int somenumber) {
        int divisor = 0;
        for (int i =2; i < somenumber; i++) {
            if (somenumber % i == 0) {
                divisor += 1;
            }
        }
        return (divisor == 0);
    }
}