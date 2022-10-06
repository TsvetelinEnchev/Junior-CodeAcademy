package Exam.restaurant.objects;

import Exam.restaurant.interfaces.ColorAble;

import java.math.BigDecimal;

public class Item implements ColorAble
{

    private String productName;
    private double productAmount;
    private BigDecimal productPrice;

    public Item(String productName, double productAmount, BigDecimal productPrice) {
        this.productName = productName;
        this.productAmount = productAmount;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(double productAmount) {
        this.productAmount = productAmount;
    }

}