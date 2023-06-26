/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuanpaster.mathutil.core;

/**
 *
 * @author ADMIN
 */
// class này clone lại cái class huyền thoại java.util.Math

public class MathUtility {
    
    public static final double PI = 3.1415;
    // class này chứa hàm static, chấm sài luôn
    //tính n giai thừa n! 
    /*
    quy ước thiết kế này như sau 0! = 1! =1
   không có giai thừa số âm , nếu đưa số âm . Chửi
    giai thừa tăng nhanh, 20! vừa khớp full kiểu long
    do đó 21~ ko dùng kiểu long đc. nếu đưa >21, chửi
    
    CHỬI ko trả về giá trị cả mà ném ra ngoại lệ exception
*/
    public static long getFactorial(int n){
        
        long product = 1 ;
         if (n<0 || n>20)  throw new IllegalArgumentException("Invalid n. n must be between 0-> 20, plz...");
        
        if (n == 0 || n == 1) return 1;
        for (int i = 2; i <= n; i++) product *= i;
        return product;
        
        
//        if (n == 0 || n == 1 ) {
//            return 1;
//        } else return product*getFactorial(n-1);
//        
        /*
        
        
        def tinh_giai_thua(n):
    if n == 0:  # Trường hợp cơ bản: giai thừa của 0 là 1
        return 1
    else:
        return n * tinh_giai_thua(n - 1)
        
        
        
        
        
        */
        
    }
    /*
    TTD : test Dreven Development phát triển p/m theo phong cách 
    code đến đâu kiểm thử đến đó, viết code và viết test case / test run
    diễn ra song song đan xen
    
    cứ có hàm là có test case
    viết ra các test case đủ bao quát các tình huống xài hàm
    
    test case là vộ sữ liệu dùng để đưa vào app / hàm để mô phỏng lại 
    1 tình huống xài app / hàm. nó có input data, giải thích cách 
    dùng hàm/ app  và có giá trị trả về expected
    lát hồi run ( test run/ test excution) để luận đúng sai 
    
    dân DEV giống QC ở chỗ này:
    Đều phải viết/ tạo ra test case, đều phải tiến hành/ run chạy test
    và đều  phải đọc kết quả đúng sai
    DEV khác tester là phải viết CODE làm APP
    
    test case ko viết tự domaf viết theo template 
    viết tự do : 0! -> 1; 1! -> 1; 2! -> 2; 3! -> 6; 5! -> 120;
    viết chuẩn lại test case (XUẤT HIỆN TRONG THI PE, KHÓA LUẬN T/N VÀ ĐI LÀM)
    
    test case #1 : mục tiêu test check getF() with n=0
    step-procedures (cách tiến hành test - input/output ..)
            1. given n=0
            2.call the gatF(n) ( getF(0) )
    Expected results:( kết quả kì vọng )
            getF(0) must return 1
    
        test case #2 : mục tiêu test check getF() with n=1
    step-procedures (cách tiến hành test - input/output ..)
            1. given n=1
            2.call the gatF(n) ( getF(1) )
    Expected results:( kết quả kì vọng )
            getF(1) must return 1
    */
}
