package by.htp.homework.ninth.task02.view;

import by.htp.homework.ninth.task02.bean.Payment;
import by.htp.homework.ninth.task02.logic.PaymentLogic;

public class Main {
    
   public static void main(String[] args) {
       
       Payment payment = new Payment();
       
       Payment.Product product = payment.new Product ("surgical scalpel", 70.55);
       
       PaymentLogic logic = new PaymentLogic();
       
       logic.addProductToTheCart(payment, product);
       
       View view = new View();
       
       view.showPaymentDetails(payment);
   }
    

}
