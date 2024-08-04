/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ispandrome;

import java.util.Scanner;

/**
 *
 * @author cash
 */
public class IsPandrome 
{

    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        boolean stop = true;
        int choice;
        
        while (stop) {            
            
            System.out.println("Checking palindrome for a number and word");
            System.out.println("Choice below options");
            System.out.println("1: Checking number");
            System.out.println("2: Checking word");
            System.out.println("3: Stop the application");
            
            System.out.println("Choice your option: ");
            choice = input.nextInt();
            
            input.nextLine();
            switch (choice) {
                case 1:
                    int number;
                    
                    System.out.println("Enter a number");
                    number = input.nextInt();
                    
                    if(isPandromeForNumber(number)) {
                        System.out.println(number + " is a palindrome");
                    }
                    else {
                        System.out.println(number + " is not a palindrome");
                    }
                    break;
                case 2:
                    String word;
                    
                    System.out.println("Enter a word: ");
                    word = input.nextLine();
                    
                    if(isPandromeForString(word)) {
                        System.out.println(word + " is a palindrome");
                    }
                    else {
                        System.out.println(word + " is not a palindrome");
                    }
                    break;
                case 3:
                    stop = false;
                    System.out.println("Thanks for stopping the application");
                    break;
                default:
                    System.out.println("Invaild input, please try again!!!");
                    break;
            }
        }
        
        input.close();
    }
    
    public static boolean isPandromeForString(String word) 
    {
        int x = 0;
        int y;
        y = word.length() - 1;
        
        while(y > x) {
            
            if(word.charAt(x) != word.charAt(y)) {
                
                return false;
            }
            
            x++;
            y--;
        }
        
        return true;
    }
    
    public static boolean isPandromeForNumber(int number)
    {
        String name = String.valueOf(number);
        int x = 0;
        int y;
        y = name.length() - 1;
        
        while(y > x) {
            
            if(name.charAt(x) != name.charAt(y)) {
                
                return false;
            }
            
            x++;
            y--;
        }
        
        return true;
    }
}

