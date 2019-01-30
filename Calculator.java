/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekenmachine;

import java.util.Scanner;

public class Calculator {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    Maths Maths = new Maths();

    double answer = 0;
    double inputA, inputB;
    char operator;
    boolean done = false;

     while (done == false) {
        System.out.println("Vul je som hier in: ");

        inputA = input.nextDouble();
        operator = input.next().charAt(0);
        inputB = input.nextDouble();        

        switch (operator) {
            case '+': answer = Maths.add(inputA, inputB);
                      break;
            case '-': answer = Maths.subtract(inputA, inputB);
                      break;
            case '*': answer = Maths.multiply(inputA, inputB);
                      break;
            case '/': answer = Maths.divide(inputA, inputB);
                      break;
            case '^': answer = Maths.power(inputA, inputB);
                      break;
        }
            System.out.println(" ");
            System.out.println("Antwoord: ");
            System.out.print(inputA + " ");
            System.out.print(operator + " ");
            
            System.out.print(inputB + " ");
            System.out.println(" = " + answer);
            System.out.println(" ");
            System.out.println("------------------ ");
            System.out.println(" ");
            
     }

    input.close();

  }

}