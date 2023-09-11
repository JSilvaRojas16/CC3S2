/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TareaConversion;

import TareaConversion.StringCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

//Conversion del ejemplo de Ruby(Rspec) a Java (JUnit)
public class StringCalculatorTest {
    
    @Nested
    class addTest {
        StringCalculator stringCalculator1 = new StringCalculator();
        
        @Test
        public void testReturnZero(){
            assertEquals(0,stringCalculator1.add(""));
        }
    }
    
    @Nested
    class addTwoTest {
        StringCalculator stringCalculator2 = new StringCalculator();
        
        @Test
        public void testReturnFour() {
            assertEquals(4,stringCalculator2.addTwo("4"));
        }
        
        @Test
        public void testReturnTen() {
            assertEquals(10,stringCalculator2.addTwo("10"));
        }
    }
    
    @Nested
    class addThreeTest {
        StringCalculator stringCalculator3 = new StringCalculator();
       
        @DisplayName("Given 2,4 it must returns 10")
        @Test
        public void testSumOne() {
            assertEquals(6, stringCalculator3.addThree("2,4"));
        }
        
        @DisplayName("Given 17,100 it must returns 117")
        @Test
        public void testSumTwo() {
            assertEquals(117, stringCalculator3.addThree("17,100"));
        }
    }
    
    
}
