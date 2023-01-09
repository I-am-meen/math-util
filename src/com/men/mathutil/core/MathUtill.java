/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.men.mathutil.core;

/**
 *
 * @author asus
 */
public class MathUtill {
    
    
    //trong class này cung cấp cho ai đó nhiều hàm xử lý toán học
    //clone class Math của JDK
    //hàm thư viện xài chung cho ai đó, k cần lưu lại trạng thái/ giá trị 
    //chọn thiết kế là hàm static

    
    //hàm tính giai thừa!!!
    //n! = 1.2.3.4.....n
    //k có giai thừa cho số âm
    //0!=1!=1 quy ước
    //giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
    //vd: 20! 18 số 0, vừa kịp dùng đủ cho kiểu long của java
    //21! tràn kiểu long
    // bài này quy ước tính n! trong khoảng từ 0->20
    
//    public static long getFactorial(int n){
//        if(n < 0 || n>20)
//            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
//            
//        
//        if(n==0 || n==1)
//            return 1; //kết thúc nếu nhận giá trị đặc biệt
//        
//        
//        long product = 1; //tích nhân dồn
//        for (int i = 2; i <= n; i++) 
//            product *=i;
//        
//        
//        return product;
//       
//}

    public MathUtill() {
    }
    
    //Học đệ quy - RESURION
    //Hiện tượng gọi lại chính mình với quy mô khác 
     //n! = 1.2.3.4.5. .... . n
    //6! = 6*5!
    //5 = 5*4!
    //4! = 4*3!
    //3! = 3*2!
    //2! = 2*1!  điểm dừng
    
    // công thức đệ quy: n! = n*(n-1)!

      public static long getFactorial(int n){
        if(n < 0 || n>20)
            throw new IllegalArgumentException("N must be between 0..20. Plz!");
            
        
        if(n==0 || n==1)
            return 1; //kết thúc nếu nhận giá trị đặc biệt
        
        
        return n * getFactorial(n - 1); //công thức đệ quy
       
        }
    
}  