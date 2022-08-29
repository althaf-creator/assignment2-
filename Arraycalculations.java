package source;
import java.util.*;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;
//import java.lang.reflect.Array;
//import java.util.Scanner;

public class Arraycalculations {
	 static int numbers[] = new int[] {47,84,75,21,14,14,79};    
	public static void main(String args[]) 
    { 
	
	   int numbers[] = new int[] {47,84,75,21,14,14,79};
	   
	  
	   // Sort the Arrray
	    Arrays.sort(numbers);
	    System.out.println("Sorted Array: ");
	    for(int x : numbers)
	    {
		   System.out.println(x + "");
		  
	    }
	    System.out.println("");
	   
	   // Calculate the median 
	   double median = 0;
	   double position1 = Math.floor((numbers.length - 1.0) / 2.0);
	   double position2 = Math.ceil((numbers.length - 1.0) / 2.0);
	   if(position1 == position2 )
	   {
		   median = numbers[(int)position1];
	   }else
	   {
		   median = numbers[(int)position2] + numbers[(int)position2];
	   }
	   // call the median 
	   System.out.println("Median: " + median);
	   //call the highest  number 
	   System.out.println("Highest Number: " + highets());
	   
	   //find the mode 
	   ArrayList<Integer> list = new ArrayList<Integer>();
	   TreeSet<Integer> tree = new TreeSet<Integer>();
	   
	   for(int i = 0; i < numbers.length; i++)
	   {
		   tree.add(numbers[i]);
		   list.add(numbers[i]);
	   }
	 	   System.out.println("Tree : " + tree);
	   
	   ArrayList<Integer> mode = new ArrayList<Integer>();
	   
	   int highmark = 0;
	   for(Integer x : tree)
	   {
		   int freq = Collections.frequency(list, x);
		   if (freq == highmark)
		   {
			   mode.add(x);
		   }
		   if(freq > highmark)
		   {
			   mode.clear();
			   mode.add(x);
			   highmark = freq;
		   }
		   
	   }
	   //call the mode 
	   System.out.println("Mode: " + mode);
	   
	   // find the prime number 
	   
	   for(int i = 0; i < numbers.length; i++)
	   {
		   boolean isPrime = true;
		   if(numbers[i] == 1)
				   {
			             isPrime = false;
				   }
		   else 
		   {
			   for(int j =2; j <= numbers[i] / 2; j++)
			   {
				   if(numbers[i] % j == 0)
				   {
					   isPrime = false;
					   break;
				   }
			   }
		   }
		   if(isPrime)
		   {
			   if(numbers[i] == 0)
			   {
				   
			   }else 
			   {
				   System.out.println("Prime Number: " +numbers[i]+"");
			   }
		   }
	   }
	   
	  	   
	   
	   
 }	
	// logic part for find the highest number 
	static int highets()
	   {
		   int i;
		   int max = numbers[0];
		   
		   for(i = 1; i < numbers.length; i++)
		   {
			   if(numbers[i] > max)
			   {
				   max = numbers[i];
				   
			   }
		   }
		return max;
	   }
}