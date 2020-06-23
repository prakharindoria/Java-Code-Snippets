/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack.collectionsLinkedList;

import java.util.Scanner;

/**
 *
 * @author prakhar patidar
 */
public class MainClass {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws Exception{
        MyStack<Integer> ms=new MyStack<>();
        Scanner kb=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {System.out.println("Enter a number");
        Integer e=kb.nextInt();
        ms.push(e);
        System.out.println("Pushed "+e);
        }
        System.out.println();
        
        Integer t=ms.peek();
        System.out.println("Peeked "+t);
       
        
        System.out.println();
        
        for(int i=0;i<5;i++)
        {
        Integer e=ms.pop();
        System.out.println("Popped "+e);
        }
        
        
    
        
                
        
    }
    
}
