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
class LargestNumberMy
{
	public static void main(String args[])
	{       System.out.println("How many nums: ");
                Scanner kb=new Scanner(System.in);
                int num=kb.nextInt();
                System.out.println("Enter num in array");
		int[] a = new int[num];
		int max=a[0];
                int  index =0;
		for(int i = 0; i < a.length;i++)
		{   a[i]=kb.nextInt();
                   
                    if(a[i] > max)
                    {
                        max = a[i];
                        index=i;
                     }
                }
		System.out.println("From The Array Element Largest Number is at :" + (index+1)+"  And Num is "+max);
	}
}
