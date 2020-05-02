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
public class SalesmanJaggedArray {
    public static void main(String[] args) {
        System.out.println("How many Salesman? ");
        Scanner kb=new Scanner(System.in);
        int numOfSalesman=kb.nextInt();
        int [][] arr=new int[numOfSalesman][];
        double [] average=new double[numOfSalesman];
        double [] sum_arr=new double[numOfSalesman];
        float sum=0,count=0;
        double avg=0;
        int index=0;
        
        for (int i = 0; i < numOfSalesman; i++) {
            System.out.println("How many Sales for Salesman "+(i+1));
            int sales=kb.nextInt();
            arr[i]=new int[sales];
            System.out.println("Enter sale values for "+(i+1));
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=kb.nextInt();
               }
            }
        
       
             System.out.println("Values are: ");
       
        for (int i = 0; i < arr.length; i++) {
                System.out.print("Salesman "+(i+1)+" Values  : ");
            for (int j = 0; j < arr[i].length; j++) {
                sum=sum+arr[i][j];
                count++;
                
                System.out.print(arr[i][j]+" ");
                sum_arr[i]=sum;
                avg=sum_arr[i]/arr[i].length;
                average[i]=avg;
            }
                
                
                System.out.print("Sum is : "+sum+" and Avg is :"+avg);
                sum=0;
                System.out.println();
                
            }
                
        
        
        double max=average[0];
       
        for (int z = 0; z < average.length; z++) 
            {
                       if(average[z]>max)
                       { 
                           max=average[z];
                           index=z;
                       }
            
            }
        
            System.out.println("Best Salesman is: Salesman "+(index+1)); 
            
            
            
        
    }
}
    
    
