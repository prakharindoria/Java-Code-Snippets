/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack.collectionsLinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author prakhar patidar
 */
public class MyStack<E> {
    List<E> l1=new LinkedList<E>();
    int count=0,peekcount=0;
    
    void push(E e)
    {
        count++;peekcount++;
    l1.add(e);
    
    }
    
    
    E pop()throws Exception{
        if(l1.isEmpty()){
         throw new Exception("Popping From Empty not allowed");
        }
        count--;peekcount--;
        return l1.remove(count);
    }
    
    
     E peek()throws Exception{
        if(l1.isEmpty()){
         throw new Exception("Peeking From Empty not allowed");
        }
        peekcount--;
        return l1.get(peekcount);
    }    
    
}
