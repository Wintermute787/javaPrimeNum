package com.company;

public class Main {

    public static void main(String[] args) {
       int myNum = 3909;
        allFactors(myNum);

    }
    private static void allFactors(int num) {
        for(int i = num; i > 0; i--) {
            if(num % i == 0){
                System.out.println(i + " is a factor of " + num);
            }
        }
    }
}
