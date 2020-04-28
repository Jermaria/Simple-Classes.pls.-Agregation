package by.htp.homework.ninth.task02.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Payment implements Serializable {
    
    private String paymentId;
    private List<Product> productList = new ArrayList<Product>();
    
    private double totalPrice;
    
    public Payment() {}

    public Payment(String paymentId, List<Product> productList, double totalPrice) {
        this.paymentId = paymentId;
        this.productList = productList;
        this.totalPrice = totalPrice;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((paymentId == null) ? 0 : paymentId.hashCode());
        long temp;
        temp = Double.doubleToLongBits(totalPrice);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Payment other = (Payment) obj;
        if (paymentId == null) {
            if (other.paymentId != null)
                return false;
        } else if (!paymentId.equals(other.paymentId))
            return false;
        if (Double.doubleToLongBits(totalPrice) != Double.doubleToLongBits(other.totalPrice))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[paymentId=" + paymentId + ", totalPrice=" + totalPrice + "]";
    }
    
    public class Product implements Serializable {
        
        private String name;
        private double price;
        
        public Product() {}

        public Product(String name, double price) {
            super();
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getEnclosingInstance().hashCode();
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            long temp;
            temp = Double.doubleToLongBits(price);
            result = prime * result + (int) (temp ^ (temp >>> 32));
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Product other = (Product) obj;
            if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
                return false;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
                return false;
            return true;
        }

        private Payment getEnclosingInstance() {
            return Payment.this;
        }
        
    }
    
   

}
