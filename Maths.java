/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rekenmachine;

public class Maths {

    double add(double a, double b) {
        double answer = a+b;
        return answer;          
    }

    double subtract(double a, double b) {
        double answer = a-b;
        return answer;          
    }

    double multiply(double a, double b) {
        double answer = a*b;
        return answer;          
    }

    double divide(double a, double b) {
        double answer = a/b;
        return answer;          
    }

    double power(double a, double b){
        double answer =a;

        for (int x=2; x<=b; x++){
            answer *= a;
        }

        return answer;
    }

}
