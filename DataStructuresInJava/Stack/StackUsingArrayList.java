/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author prakhar patidar
 */
public class StackUsingArrayList {
     public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter length of Stack:");
        int len =kb.nextInt();
        List<Integer> al=new ArrayList<>();
        int tos=-1;
        int x;
        for(int i=0;i<len;i++){
            System.out.println("Enter "+(i+1)+" number in Stack");
        x=kb.nextInt();
        tos=tos+1;
        al.add(x);
        }
        System.out.println();
        for(int i=0;i<len;i++){
            System.out.println(al.get(tos));
            tos=tos-1;
            
        }
        
        
    }
    
}
