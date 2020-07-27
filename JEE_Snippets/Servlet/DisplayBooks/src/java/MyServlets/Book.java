/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyServlets;

/**
 *
 * @author prakhar patidar
 */
public class Book {

    @Override
    public String toString() {
        return "Book{" + "bname=" + bname + ", price=" + price + '}';
    }

    public String getBname() {
        return bname;
    }

    public double getPrice() {
        return price;
    }

    public Book(String bname, double price) {
        this.bname = bname;
        this.price = price;
    }
    private String bname;
    private double price;
    
}
