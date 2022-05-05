//Extra credit assingment 
//Kevin Carpenter
package com.mycompany.extra_credit_assignment;


public class extra_credit {
    
    public static void main(String[] args) {
        
        
     int[] a={3,5,12,450,1,1,5,6,23,6,8,9,321,2,3};//array provided by Moaath
     
        System.out.print("These are the numbers in the array");
        for (int i = 0; i < a.length; i++) {
            
         System.out.println(a[i]+" "); //showing the array   
            
            
        }
        
        System.out.println("The sum of the two largest numbers didived by the sum of the two smallest number is:    " + (twoLargestNumbers(a)/twoSmallestNumbers(a)) );   
        
        
        
    }
    
    
    
    //Function to get the two largest numbers
    public static double twoLargestNumbers(int [] a){
        int temp1 = 0;//temp value for the largest number
        int counter = 0;//Remebers the location of a varible in the array
        int temp2 = 0;//temp value of the second largest number
        int sum = 0;
               
        for (int i = 0; i < a.length; i++) {//runs the length of the array
            
            if (temp1 < a[i]) {
                temp1 = a[i];
                counter = i;//We set a counter so we know which spot on the array has the higest value
            }
            
            }
        
        for (int i = 0; i < a.length; i++) {//runs the length of the array
            
            if (temp2 < a[i]) {
                
                if(i == counter) {//when we stop at the same spot on the array as the last loop we restart the loop
                    continue;
                    
                }
                else
                temp2 = a[i];
            }
            
            
            }
        
        sum = temp1 + temp2;
        return sum;//returns the sum of the largest and second largest varible
        }
    //Function to get the two smallest numbers
    public static double twoSmallestNumbers(int [] a){
        int temp1 = a[0];//temp value for the smallest number
        int counter = 0;
        int temp2 = a[0];//temp value for the second smallest number
        int sum = 0;
               
        for (int i = 0; i < a.length; i++) {//for loop that runs the length of the array looking for the largest value
            
            if (temp1 > a[i]) {
                temp1 = a[i];
                counter = i;
            }
            
            }
        
        for (int i = 0; i < a.length; i++) {////for loop that runs the length of the array looking for the second smallest value 
            
            if (temp2 > a[i]) {
                
                if(i == counter) {
                    continue;
                    
                }
                else
                temp2 = a[i];
            }
            
            
            }
        
        sum = temp1 + temp2;//returns the sum of the smallest and second smallest varible
        return sum;
        }
    
   
}
    
    
    
    
    
    

