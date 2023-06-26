/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.paster.mathutil.core.test;

import static com.tuanpaster.mathutil.core.MathUtility.getFactorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ADMIN
 */
public class MathUtilityTesst {
    
    @Test
    public void testFactorialGivenRightArgumentReturnWell(int n, long expected){
        assertEquals(69,69);
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));
}
    // DDT là phần mở rộng của các UNIT test FRAMEWORK
    // DATA DRIVEN TESTING
    // KO NHẦM VỚI TĐ : TEST DRIVEN DEVELOPMENT
                            // VIẾT CODE VÀ VIẾT TEST CASE SONG HÀNH
    /*                      VỚI NHAU, ĐÃ HỌC XONG
    NHƯNG CODE TETS 
                            
    */
}
