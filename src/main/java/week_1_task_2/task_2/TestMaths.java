package week_1_task_2.task_2;

import java.util.Scanner;

public class TestMaths	  	  	  	       		   	      	
{	  	  	  	       		   	      	
  public static void main(String[] args)	  	  	  	       		   	      	
  {	  	  	  	       		   	      	
      Scanner myScan = new Scanner(System.in);	  	  	  	       		   	      	
      int v=0;	  	  	  	       		   	      	
      int b =0;	  	  	  	       		   	      	
      System.out.println("Type in an integer");	  	  	  	       		   	      	
      v = myScan.nextInt();	  	  	  	       		   	      	
      System.out.println("Type in another integer");	  	  	  	       		   	      	
      b = myScan.nextInt();	  	  	  	       		   	      	
      System.out.println("The greatest integer is "+ Maths.max(v,b));
  }	  	  	  	       		   	      	
}