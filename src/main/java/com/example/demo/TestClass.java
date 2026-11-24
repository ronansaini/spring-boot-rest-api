package com.example.demo;

public class TestClass {    

        private final int i ;
        private final int j;
        private String str;
        
     

        public TestClass(int i, int j){
            this.i = i;
            this.j = j;
        }   
   
        public TestClass(int i, int j, String str) {
            this.i = i;
            this.j = j;
            this.str = str;
        }
        public int getmultiply(){
            return i * j;
        } 

        public int getFactorial(){
            int factorial = 1;
            for (int k = 1; k <= i; k++) {
                factorial *= k;
            }
            return factorial;
        } 


        public int getIntValue(){
            return i;
        }   
        public String getStringValue(){
            return str;
        } 
    }