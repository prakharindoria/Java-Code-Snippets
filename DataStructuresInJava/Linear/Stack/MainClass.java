/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Scanner;

/**
 *
 * @author prakhar patidar
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Size Of Stack;");
        int len=kb.nextInt();
        Stack s=new Stack(len);
        s.tos=-1;
        int x;
        System.out.println(s.arr.length);
        for(int i=0;i<5;i++){
            System.out.println("Enter "+(i+1)+" number to insert: ");
            x=kb.nextInt();
            s.tos=s.tos+1;
            s.arr[s.tos]=x;
            System.out.println("Pushed: "+x);
        }
        System.out.println();
        
        
        for(int i=0;i<5;i++){
            x=s.arr[s.tos];
            s.tos=s.tos-1;
            System.out.println("Popped"+x);
        }
        
    }
    
}
