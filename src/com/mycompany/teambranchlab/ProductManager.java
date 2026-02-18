/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teambranchlab;

/**
 *
 * @author patel
 */
public class ProductManager {
    public String getProductName() {
        return "Sample Product, in starting code.";
    }
    public double calculateDiscount(double price, double discountPercent) {
    return price - (price * discountPercent / 100);
}

}
