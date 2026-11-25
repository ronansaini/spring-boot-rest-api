package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    
    
    public static void testUserInputScanner() {
        System.out.println("------------- Testing User Input with Scanner --------------");
         Scanner scanner = new Scanner(System.in);
        // 3. Prompt the user and read different data types
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine(); // Reads a full line of text
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Reads an integer
  // 4. Display the collected input
        System.out.println("\n--- Summary ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        scanner.close();
    }

    public static void testPayment() {
        UPIPayment payment = new UPIPayment();
        payment.pay(100.0);
        Refundable refundable = new UPIPayment();
        refundable.refund(50.0);
    }  

    static void printMatrix(){
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };  
    System.out.println("------------- Printing 2D Matrix --------------");
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println(); // Move to the next line after each row
    }   
}

public int sum(int k) {
        // if (k <= 0) {
        //     return 0;
        // } else {
        //     return k + sum(k - 1);
        // }

    if(k <=0) 
        return 0;
    else 
        return k + sum(k-1);
}

    public static void main(String[] args) {

        testUserInputScanner();
        System.out.println("-------------------");
        testPayment();
        System.out.println("-------------------");
        printMatrix();
        System.out.println("-------------------");


        int i = 1;
        int j ;
        while(i<9){
                System.out.println("i = " + i);
            i++;
            if(i==5){
                System.out.println("i is 5, breaking the loop");
                break;
            } else if(i==3){
                System.out.println("i is 3, continuing to next iteration");
                continue;
            }
            
        }
        System.out.println("-------------------");
        for(i=0;i<5;i++){
            System.out.println("i = " + i);
        }   
        System.out.println("-------------------");  
        for(i=1;i<3;i++){
            System.out.println("i = " + i);
                    for(j=1;j<5;j++){
                System.out.println("j = " + j);
                System.out.println("Multiply i*j = " + (i * j));
            }
        }

         System.out.println("-------------------");

         String names[] = {"John", "Alice", "Bob", "Eve"};
        for(int k=0; k<names.length; k++){
            System.out.println("names["+k+"] = " + names[k]);
        }

        int arr[] = {1,2,3,4,5};
        // for(int k=0; k<arr.length; k++){
        //     System.out.println("arr["+k+"] = " + arr[k]);
        // }  
        System.out.println("array length = " + arr.length);
        for(int k=0; k<arr.length; k++){    
           
            System.out.println("arr["+k+"] = " + arr[k]);
        }

        System.out.println("-------------------"); 
        //for each loop
        for(int num: arr){
            System.out.println("num = " + num);
        } 
        System.out.println("-------------------");

        TestClass methodTest = new TestClass(5,3);
    
        System.out.println("Multiply = " + methodTest.getmultiply());
        System.out.println("Factorial = " + methodTest.getFactorial());
        System.out.println("Recursive Factorial = " + methodTest.getRecursiveFactorial());


        TestClass test1 = new TestClass(2,3,"Hello");
        System.out.println("String Value = " + test1.getStringValue());


          
        System.out.println("-------------------");
         
    String[] flights = {"Indigo","Spicejet","Air India","Qatar", "Emirates"};
    
    for(String flight:flights){
    System.out.println("Flight: "+ flight );
    }
        System.out.println("-------------------");

        if (i == 3) {
            System.out.println("i is 3");
        } else if (i == 5) {
            System.out.println("i is 5");
        } else {
            System.out.println("i is neither 3 nor 5");
        }
        System.out.println("-------------------");

        switch(i) {
            case 1:
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 2");
                break;
            default:
                System.out.println("i is neither 1 nor 2");
        }

        SpringApplication.run(DemoApplication.class, args);        
    }
}