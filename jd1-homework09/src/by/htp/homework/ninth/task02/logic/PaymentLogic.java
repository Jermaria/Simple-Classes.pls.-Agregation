package by.htp.homework.ninth.task02.logic;

import by.htp.homework.ninth.task02.bean.Payment;

public class PaymentLogic {
    
    public void addProductToTheCart(Payment payment, Payment.Product product) {
        
        if (product != null) {
            
            payment.getProductList().add(product);
            
            payment.setTotalPrice(payment.getTotalPrice() + product.getPrice());
        }
    }
    
    public void removeProductFromTheCart(Payment payment, Payment.Product product) {
        
        if (product != null) {
            
            payment.getProductList().remove(product);
            
            payment.setTotalPrice(payment.getTotalPrice() - product.getPrice());
        
        }
    }
}
