package by.htp.homework.ninth.task02.view;

import by.htp.homework.ninth.task02.bean.Payment;
import by.htp.homework.ninth.task02.bean.Payment.Product;

public class View {
    
    void showPaymentDetails(Payment payment) {
        
       System.out.println("List of goods: ");
       
       for(Product product : payment.getProductList()) {
           
           System.out.println("Product: " + product.getName() + " price: " + product.getPrice());
       }
       
       System.out.println("Total: " + payment.getTotalPrice());
    }

}
