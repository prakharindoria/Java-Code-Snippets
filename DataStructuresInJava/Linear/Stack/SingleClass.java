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
public class SingleClass {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter length of Stack:");
        int len =kb.nextInt();
        int arr[]=new int[len];
        int tos=-1;
        int x;
        for(int i=0;i<len;i++){
            System.out.println("Enter "+(i+1)+" number in Stack");
        x=kb.nextInt();
        tos=tos+1;
        arr[tos]=x;
        }
        System.out.println();
        for(int i=0;i<len;i++){
            System.out.println(arr[tos]);
            tos=tos-1;
            
        }
        
        
    }
}
