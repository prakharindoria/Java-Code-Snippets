/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prakhar patidar
 */
import java.util.*;
public class LinkedListVsArrayListDemo {
    public static void main(String[] args) {
        List<Integer> ll=new LinkedList<>();
        List<Integer> al=new ArrayList<>();
        getTimeDiff(ll);
        getTimeDiff(al);

        
    }
    //Time to execute in both cases
    static void getTimeDiff(List <Integer> list){
    long starti=System.currentTimeMillis();
    
        for (int i = 0; i < 100000; i++) {
            list.add(0,i);
            
        }
    long endi=System.currentTimeMillis();
    
    long starte=System.currentTimeMillis();
        
        for (int i = 0; i < 100000; i++) {
            list.get(78899);
            
        }
    long ende=System.currentTimeMillis();
    
       
        System.out.println(list.getClass().getName()+" --> Insertion  At Zero Index -->"+ (endi-starti));
         //Time in MilliSeconds,Array performs Shifting Operations
        
        System.out.println(list.getClass().getName()+" --> Fectching -->"+ (ende-starte));
        //Array performs two operations BaseAddress+Index*sizeOf() whereas LinkedList traverses All elements from index 0.
    
    }
}
