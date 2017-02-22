package com.company;

import com.company.classes.Customer;
import com.company.classes.Employee;
import com.company.classes.Person;

public class Main {
    public static void main(String[] args) {

/*
        Person test = new Person();
        Customer testOne = new Customer("Wall","E");
        Employee testTwo = new Employee("Avengers", "Infinity Wars");

        System.out.println(" * * * * * * *  Introduction * * * * * * * ");


        System.out.println(test.introduceYourself("Avatar", "Aang"));
        System.out.println(test.introduceYourself("Momo ", 106));
        System.out.println(test.introduceYourself("Firenation","Firelord","Ozai", 46));
        System.out.println(testOne.introduceYourself("Cabbage","Man"));
        System.out.println(testTwo.introduceYourself("Gandalf","the Grey!!!"));
        }


        System.out.println("\tMy favorite customer is " + testOne.getfName() + " "+ testOne.getlName());
        System.out.println("\t The new movie which will be released next yr: "+ "\n \t \t" + testTwo.getfName() + testTwo.getlName());
        }
*/

        int x = 1;
        {
           System.out.println("****WHILE-LOOP HERE****");
       }
       while (x <= 10) {
           System.out.print("[" + x + "]");
           x++;
           // Unsa  ako i-comment ani  -.- LOL
       }
       {
           System.out.println("\n\n#####DO-WHILE-LOOP HERE #####");
       }
       int y = 1;
       do {
           System.out.print("[" + y + "]");
           y++;
       }while (y <= 10);

       {
           System.out.println("\n\n$$$$$$$ FOR-LOOP  HERE $$$$$$");
       }

       for(int z = 1; z <= 10; z++){
           System.out.print("[" + z + "]");
       }

       System.out.println("\n\n====Static method here====\n\n Sum of the loop is = " + StaticMethods.myMethodSum(6));

       //System.out.println("\n\n" + fibonacciSeq.fibonacci());



    int j, fact = 2;
        int numb = 3;
        for(j = 1; j <= numb; j++) {
            fact *=  j;
        }
         System.out.print("\n\nfactorial of 7 is " + fact);
        }

}



