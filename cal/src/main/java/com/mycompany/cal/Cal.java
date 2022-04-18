/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cal;
import java.util.Scanner;
import java.text.*;

class calculation{
	
	Scanner sc = new Scanner(System.in);
        private static final DecimalFormat df = new DecimalFormat("0.00");
	double tot,sub,mul,div,num1,num2;

	void setData(){
		System.out.print("\nEnter your first number: ");
		num1 = sc.nextDouble();
		System.out.print("\nEnter your second number: ");
		num2 = sc.nextDouble();
	}
	
	void addition(){
		tot = num1+num2;
		System.out.println("\nAddition is: "+df.format(tot));
	}
	
	void substraction(){
		sub = num1-num2;
		System.out.println("\nSubstraction is: "+df.format(sub));
	}
	
	void multiplication(){
		mul = num1*num2;
		System.out.println("\nMultiplication is: "+df.format(mul));
	}
	
	void division(){
		div = num1/num2;
		System.out.println("\nDivision is: "+df.format(div));
	}
}

public class Cal {

    public static void main(String[] args) {
                
                double a;
		Scanner sc = new Scanner(System.in);
		calculation c = new calculation();
		
		System.out.println("\n\t\t1: Addition\t\t2: Substraction\t\t3: Multiplication\t\t4: Division");

		System.out.print("\nEnter your option: ");
		a = sc.nextDouble();
		
		
		c.setData();
		if(a==1){
			c.addition();
		}
		else if(a==2){
			c.substraction();
		}
		else if(a==3){
			c.multiplication();
		}
		else if(a==4){
			c.division();
		}
    }
}
