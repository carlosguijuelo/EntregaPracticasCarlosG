/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorial;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos Guijuelo
 */
public class FactorialTest {
    
    public FactorialTest() {
    }
    private Factorial instance = new Factorial();
    
    /**
     * Test of calculo method, of class Factorial.
     */
    @Test 
    public void testCalculo(){
        instance.calculo(-1);
    }
    
    @Test 
    public void testCalculo1(){
        instance.calculo(1000000000);
    }
    
    @Test 
    public void testCalculo2(){
        instance.calculo(5);
    }
    
    @Test 
    public void testCalculo3(){
        instance.calculo(1);
        
    }
    
   
    
}
