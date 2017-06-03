package com.onlinecalculator.calculator.maincalc;

import java.util.Scanner;

import com.onlinecalculator.calculator.calctypes.*;

public class MainPgm {
public static void main(String args[]){
        char type;
        type=getType();
        if(type=='a')
        {
        	BasicCalc calc=new BasicCalc();
    		calc.menu();
    		calc.userInputs();
    		calc.performOperation();
        }
        if(type=='b')
        {
        	ScientificCalc scalc=new ScientificCalc();
    		scalc.menu();
    		scalc.userInputs();
    		scalc.performOperation();
       	}
        	
        	if(type=='c')
        	{
        		StatisticCalc scalc=new StatisticCalc();
        		scalc.menu();
        		scalc.userInputs();
        		scalc.performOperation();
        	}
        	if(type=='d'){
        		System.out.println("wrong input");
        	}
 
    }
        
    static char getType()
    {
    	int ch;
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("*****************MENU********************");
    	System.out.println("**********1. BASIC Calcultor*************");
    	System.out.println("**********2.Scientific Calculator********");
    	System.out.println("**********3.Statistic Calculator*********");
    	System.out.println("Enter Your Choice");
    	ch=sc.nextInt();
    	if(ch==1)
    		return('a');
    	else
    		if(ch==2)
    			return('b');
    		else if(ch==3)
    			return('c');
    		else
    			return ('d');
    	
    	
    	
    }
}