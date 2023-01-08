 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.men.mathutil.test.core;
//

import com.men.mathutil.core.MathUtill;
import java.beans.ExceptionListener;
import org.junit.Assert;
import org.junit.Test;





/**
 *
 * @author asus
 */ 
public class MathUtilityTest {
    
    //Đây là class sẽ sử dùng các hàm của thư viện framework JUnit
    // để kiểm thử/ kiểm tra code chính - hàm giai thừa bên 
    //class core.MathUtil
    //Viết code để test code chính bên kia
    
    
    //có nhiều quy tắc đặt tên hàm kiểm thử
    //nhưng thường sẽ nói lên mục đích của các case/ tình huống kiểm thử
    // tình huống xài làm thàm theo kiểu thành công hay thất bại
    
    
    
    //hàm dưới đây là tình huống test hàm chạy thành công, trả về ngon
    //ta sẽ xài hàm kiểu well đưa 5!,... còn -5!,30! ... thì k đưa vào
    
    //@Test JUnit sẽ phối hợp với JVM để chạy hàm này
    // @Test phía hậu trường là public static void main()
    //có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa
     @Test
     public void testGetFactorialGivenRightArgumentReturnsWell(){
         int n = 0; //test thử tình huống tử tế đầu vào, mày phải chạy đúng
         long expected = 1; //hy vọng 0! = 1
         //long actual = ; // gọi hàm cần test bên core/ code chính
         long actual = MathUtill.getFactorial(n);
         
         // so sánh expected vói actual dùng xanh xanh đỏ đỏ, framework
         Assert.assertEquals(expected, actual);
         //hàm giúp so sánh 2 giá trị nào đó có giống nhau hay k
         // nếu giống nhau --> màu xanh lá -> code ngon ít nhất cho case đang test
         // nếu khác nhau --> màu đỏ -> hàm ý expected và actual k giống nhau
     
         
         //gọp thêm vài case thành công/ đưa đầu vào ngon!!!tính ngon
         Assert.assertEquals(1, MathUtill.getFactorial(1)); // tui muốn 1!=1
          Assert.assertEquals(2, MathUtill.getFactorial(2)); // tui muốn 2!=2
           Assert.assertEquals(6, MathUtill.getFactorial(3)); // tui muốn 3!=6
           Assert.assertEquals(24, MathUtill.getFactorial(4)); // tui muốn 4!=24
           Assert.assertEquals(120, MathUtill.getFactorial(5)); // tui muốn 5!=120
      Assert.assertEquals(720, MathUtill.getFactorial(6)); // tui muốn 6!=720
     
     }
     
    //hàm getF() ta thiết kế có 2 tình huống xử lý
     // 1. đưa vào tử tế
     //2. đưa vào data cà chớn : âm, hoặc >20, thiết kế hàm là ném ra các ngoại lệ
     //N<0 || N>20
     //rất momg ngoại lệ xuất hiện với n cà chớn 
     
     //nếu hàm nhận vào n<0 || n>20 và hàm ném ra ngoại lệ  
    //-> Hàm CHẠY ĐÚNG NHƯ THIẾT KẾ => hiển thị màu xanh
        // Nếu hàm nhận vào n<0 hoặc n>20 và KHÔNG ném ra ngoại lệ
     //--> Hàm chạy SAI thiết kế => Hiển thị màu đỏ
     
     
     //TEST CASE:
     //input: -5
     //expected: IllegaArgumentException xuất hiện
     //những tình huống bất thường, ngoại lệ, ngoài dự tíh
     //là những thứ k thể đo lường = cách chuhnsg có xuất hiện hay k
     //assertEquals() k dùng để so sánh 2 ngoại lệ
     //        equals() là bằng nhau hay k trên value
     
     
     //Màu đỏ đó, do hàm đúng là ném ngoại lệ thật
     // nhưng k phải ngoại lệ như kì vọng - kì vọng sai chứ k phải ném sai
//     @Test(expected = NumberFormatException.class)
//     public void testGetFactorialGivenWrongArgumentThrowsException(){
//         MathUtill.getFactorial(-5); //hàm @Test chạy, hay hàm getF() chạy sẽ ném về ngoại lệ NumberFormat...
//         
//         
//     }
     
     
       @Test(expected = IllegalArgumentException.class)
     public void testGetFactorialGivenWrongArgumentThrowsException(){
         MathUtill.getFactorial(-5); //hàm @Test chạy, hay hàm getF() chạy sẽ ném về ngoại lệ NumberFormat...
         
     }

     
     // cách khác để bắt ngoại lệ 
     //XÀi LAMBDA
     //TestCase: hàm sẽ ném về ngoại lệ nếu ném vào 21
     //Thấy màu xanh khi 21!
     @Test
     public void testGetFactorialGivenWrongArgumentThrowsException_LamdabVesion(){
         //Assert.assertThrows(tham số 1: loại ngoại lệ muốn so sánh,
          //                     tham số 2:đoạn code chạy văng ra ngoại lệ )
          
          Assert.assertThrows(IllegalArgumentException.class, 
                        () -> { MathUtill.getFactorial(-5);}
          );
          
       
         
     }
     
     
     
     //BẮT ngoại lệ, xem hàm có ném về ngoại lệ hay k khi n cà chớn
     //có ném, tức là hàm chạy đúng thiết kế -> xanh
     @Test
     public void testGetFactorialGivenWrongArgumentThrowsException_Trycatch(){
          
         //chủ động kiểm soát ngoại lệ!!!
         try {
               MathUtill.getFactorial(-5); 

         } catch (Exception e) {
             // bắt try-catch là JUnit sẽ ra màu xanh do đã chủ động kiểm soát ngoại lệ
             //nhưng k chắc ngoại lệ mình cần có xuất hiện hay k ???
             //có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException xuất hiện
             
             Assert.assertEquals("Invalid argument. N must be between 0..20", e.getMessage());
         }
         
     }
     
}
