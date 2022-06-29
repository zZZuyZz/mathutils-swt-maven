/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kduy.mathutil.core;

import static com.kduy.mathutil.core.MathUtil.*;
// import static la ky thuat danh rieng cho nhung ham static
// goi ham ma bo qua ten class MathUtil
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author delll
 */
public class MathUtilTest {
    // choi DDT, tach data ra khoi cau lenh kiem thu, tham so hoa data nay
    // vao trong cau lenh kiem thu
    
// chuan bi bo data
public static Object[][] initData(){
    return new Integer[][]{
                        {1, 1},
                        {2, 2},
                        {5, 120},
                        {6, 720},
    };
}    
    
    @ParameterizedTest
    @MethodSource(value = "initData") // ten cua ham cung cap data, ngam dinh thu tu
    //cua cac phan tu mang, map vao tham so hoa
    public void testGetFactorialGivenRightArgReturnsWell(int input, long expected){
        assertEquals(expected, getFactorial(input));
    }
    @Test
    public void testGetFactorialGivenWrongArgThrowException(){
        // xai bieu thuc Lamda
        //ham nhan tham so thu 2 la 1 cai object/co code implement cai
        //functional interface ten la executable-co 1 ham duy nhat
        // khong co code ten la execute()
        // choi cham
//        Executable exObject = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactorial(-5);
//            }
//        };

//        Executable exObject = () -> getFactorial(-5);

        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5) );
    }
    
}
