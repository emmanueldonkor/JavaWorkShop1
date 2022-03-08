package com.company;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SimpleCalculator {

    public static void main(String[] args) throws IOException{

        float firstNumberTawana, secondNumberTawana, sum , subtraction, product, quotient;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The program calculates sum , difference , product and quotient for two numbers.");
        System.out.println("Enter the first number(and press Enter): ");
        firstNumberTawana= Float.parseFloat(br.readLine());
        System.out.println("Enter the second number (and press Enter): ");
        secondNumberTawana= Float.parseFloat(br.readLine());

        sum = firstNumberTawana + secondNumberTawana;
        subtraction = firstNumberTawana - secondNumberTawana;
        product= firstNumberTawana * secondNumberTawana;
        quotient = firstNumberTawana / secondNumberTawana ;

        System.out.printf("You've entered two numbers , the first is : " + "%2.2f" , firstNumberTawana);
        System.out.printf(" and the Second number is: " + "%2.2f" , secondNumberTawana);


        System.out.println(); //blank area

        System.out.printf("Sum = " + "%2.2f, \n", + sum);
        System.out.printf("Difference = " + "%2.2f, \n", + subtraction);
        System.out.printf("Product = " + "%2.2f, \n", + product);
        System.out.printf("Quotient = " + "%2.2f, \n", +  quotient);

    }

}
