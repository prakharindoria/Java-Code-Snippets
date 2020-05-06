/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyJavaPackage;

import java.util.Scanner;

/**
 *
 * @author wweeeeeee
 */
public class UseOopsDemo {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        double r;
        double a,c;
        System.out.println("Enter Radius: ");
        r=kb.nextDouble();
        OopsDemo obj =new OopsDemo();
        obj.setRadius(r);
        a=obj.calcArea();
        c=obj.calcCircum();
        System.out.println("Area is : "+a);
        System.out.println("Circumference is : "+c);
    }
    
}
