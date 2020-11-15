package com.main;

/**
 * 
 * Read the partially completed code in the editor and complete it. 
 * You just need to write the MyCalculator class only
 * 
 * @author Kavya Madhurima
 */

import java.util.Scanner;
import com.pojo.AdvancedArithmetic;
import com.pojo.MyCalculator;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        AdvancedArithmetic myCalculator=new MyCalculator(); 
        int sum=myCalculator.divisorSum(n);
        System.out.println("I implemented: AdvancedArithmetic\n"+sum);
        
        myCalculator=null;
        sc.close();
    }
}