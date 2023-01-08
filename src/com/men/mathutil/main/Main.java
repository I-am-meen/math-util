/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.men.mathutil.main;

import com.men.mathutil.core.MathUtill;

/**
 *
 * @author asus
 */
public class Main {
    public static void main(String[] args) {
        
        //thử nghiệm hàm tính giai hừa coi có chạy đúng nhue thiết kế hay không
        //ta phải đưa các tình huống sử dụng hàm trong  thực tế
        //vd: -5 có tính đc k
        // 0 coi tính ra mấy
        // 20 coi tính ra mấy
        // 21 coi tính ra mấy
        // ==> TEST CASE: một tình huống hàm/app/màn hình/tính năng dc đưa vào sử dụng 
        //giả lập hành vi xài của ai đó
        
        //TEST CASE: LÀ 1 TÌNH HUỐNG SỬ DỤNG, XÀI APP HAY XÀI (HÀM)MÀ NÓ BAO GỒM:
        //INPUT:DATA ĐẦU VÀO CỤ THỂ NÀO ĐÓ
        //OUTPUT: ĐẦU RA ỨNG VỚI XỬ LÍ CỦA HÀM/CHỨC ANNWG CỦA APP, DĨ NHIÊN DÙNG ĐẦU
        //VÀO ĐẺ XỬ LÍ
        //KÌ VỌNG: MONG HÀM SẼ TRẢ VỀ VALUE NÀO ĐÓ ỨNG VỚI INPUT Ở TRÊN
        // SO SÁNH ĐỂ XEM KẾT QUẢ CÓ NHƯ KÌ VỌNG HAY K
      
        
        
        long expected = 120; //kì vọng hàm trả về 120 nếu 5!
        int n=5;  //input
        long actual = MathUtill.getFactorial(n);
        System.out.println("5!= "+expected + " expected " );
        System.out.println("5!= " + actual + " actual" );

    }
}
