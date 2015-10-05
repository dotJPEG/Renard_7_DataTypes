/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renard_7_datatypes;

/**
 *
 * @author dotJPEG
 */
public class Renard_7_DataTypes {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //space for comments
        //used to explain code
        //code explanation is and expectation
        //in D22
        int i = 1;
        float a = 2.5f;
        double b = 3.87f;
        short c = 16;
        char d1 = ':';
        char d2 = 'a';
        char d3 = 42;
        char d4 = 145;
        String e = d4+"";
        String e1 = "amanda is the best";
        boolean f = true;
        boolean g = i%2 == 0;
        /*
        here we will look at some mathematical operators
        */
        // + this adds two numbers and more
        // - this subracts two numbers and more
        // * this multiplies two numbers and more
        // / this divides two numbers and more
        // % this is modulo. shows you the remainder
        System.out.println(i + " an integer");
        System.out.println(a + " a float");
        System.out.println(b + " a double");
        System.out.println(c + " a short");
        System.out.println(d1 + " a char");
        System.out.println(d2 + " a char");
        System.out.println(d3 + " a char");
        System.out.println(d4 + " a char");
        System.out.println(e + " a string");
        System.out.println(e1 + " a string");
        System.out.println(f + " a boolean");
        System.out.println(g + " a boolean");
        for(i = -123; i < 123; i++);{
            System.out.println(i % 3 == 0);
    }
    /* % checks for the remainder
        i % 2 checks if a number is even or odd */
        // a number value for char
        // maps to a character
    i = 7;
    a = 0;
    e = "ninja";
    System.out.println(e + i + " string plus an integer");
    /* if a conditional (flow)
    statenebt. If a condition is true
    the following command will be exicture */
    if (i % 2 == 0) {
        System.out.println(i + " is even");
    }  else {
        System.out.println(i + " is odd");
                }
    }
}
