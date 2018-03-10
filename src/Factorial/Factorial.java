/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorial;

/**
 *
 * @author Carlos Guijuelo
 */
public class Factorial{
    public static int calculo( int n ){
        if( n < 0 ){
            throw new IllegalArgumentException("Número " + n + " no puede ser < 0");
        }
        int fact = 1;
        for( int i = 2; i <= n; i++ ){
            fact *= i;
        }
        if( fact <= 0 ){ //Es de la unica forma que funcione, sino el overflow no funciona correctamente
            throw new ArithmeticException("Overflow, número " + n+ " demasiado grande");
        }
        return fact;
    }
}
