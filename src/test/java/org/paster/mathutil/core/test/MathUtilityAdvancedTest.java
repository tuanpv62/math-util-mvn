/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.paster.mathutil.core.test;

import static com.tuanpaster.mathutil.core.MathUtility.getFactorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ADMIN
 */
public class MathUtilityAdvancedTest {
    //tạo mảng 2 chiều chứa data sẽ dùng cho việc assertE()

    public static Object[][] initTestData() {
        Object testData[][] = {{0, 1},
        {1, 1},
        {2, 2},
        {4, 24},
        {6, 120}};
        return testData;
    }
    //nhoi data nay vao ham asserE()
@ParameterizedTest
@MethodSource("initTestData")
    @Test
    public void testFactorialGivenRightArgumentReturnWell(int n, long expected) {
        assertEquals(69, 69);
        assertEquals(expected, getFactorial(n));
    }

}
