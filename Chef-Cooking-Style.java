/*
Chef Gusteau is one of the finest chefs in Paris. Let's understand how he cooks!

Chef's Ingredients
1. The chief receives exactly 1 ingredient per day from the market. The ingredients never repeat. 
2. Every ingredient belongs to 1 of the 3 categories FIBER, FAT & CARB.
3. Every ingredient has a unique ingredient id. 
4. The ingredient id always starts with the category name (ex: FIBERBroccoli, FATCheese, CARBRice)

Chef's Dishes
1. All of the chef's dishes have exactly 3 ingredients.
2. All the ingredients used will be fully used in a dish. The chef doesn't use some part/quantity of an indgredient. 
3. All of the chef's must have at least 2 of the ingredients from a singlecategory (i.e. At least 2 FAT ingredients OR at least 2 FIBER ingredients OR at least 2 CARB ingredients)

Chef's Cooking Style
1. If the chef has multiple options ingredients for the dish, then he takes the oldest possible ones to cook in the order of thei arrival.
2. After the chef prepares a dish, the ingredients used can NOT be re-used as they've been already used. 
3. The chef prepares a maximum of 1 dish per day. 
4. If the chef doesn't have enough ingredients to cook the dish with above-mentioned rules, then he doesn't cook on that day. 

Given the input array of ingredient id that the chef receives every day (i'e' array index is the day number)

Write a program to print when does chef cook a dish and when he doesn't.


INPUT
Line 1: The total number of days for the scope of the problem (1 <= input <= 20)
Line 2: The space separated ingredient ids                    (6 <= length(ingredientsid) <=20)


OUTPUT:
Print the "1" if the chef cooks on that day and print "0" if the chef doesn't cook anything on that day. Print the output as a single string. 

Example INPUT 1:
5
FATOil FIBERSpinach CARBRice FATCheese FIBERBeans

Example OUTPUT 1:
00010


Example INPUT 2:
6
FATOil FATCheese FATEgg FIBERSpinach CARBRice FIBERBeans

Example OUTPUT 2:
001001


Example INPUT 3:
12
FATOil FIBERSpinach CARBRice FATCheese FIBERBeans FATEgg FIBERBroccoli
CARBPotato CARBCorn FATOlive FIBERCarrot CARBBeetroot

Example OUTPUT 3:
000100101000

*/

import java.util.*;
import java.util.Scanner;

public class myone
{
	public static void main (String[] args)
	{
        Scanner sc = new Scanner(System.in);
        
        int numberofDays = sc.nextInt(); //number of days
        String[] arr = new String[numberofDays];
        
        char[] chars = new char[numberofDays];
        Arrays.fill(chars, '0');
        String s = new String(chars);

        StringBuilder sb = new StringBuilder(s);
        
        for(int i=0; i<numberofDays; i++)
        {
            arr[i] = sc.next(); //get the input 
        }
        
        for(int j=0; j<numberofDays-1; j++)
        {
            if(arr[j].regionMatches(0, arr[j+1], 0, 3))
            {
                System.out.println(""+arr[j].regionMatches(0, arr[j+1], 0, 3));
                System.out.println(""+arr[j]);
                sb.setCharAt(j+2, '1');
            }
        }
        s = sb.toString();
        System.out.println(""+s);
        sc.close();
    }
}


