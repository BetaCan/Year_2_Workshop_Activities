package week_1.do_not_remeber_which_one;

public class CircleTest
{	  	  	  	       		   	      	
  public static void main(String[] args)	  	  	  	       		   	      	
  {	  	  	  	       		   	      	
    Circle c1 = new Circle(100,100,10.0);	  	  	  	       		   	      	
    c1.setRadius(-5.0);	  	  	  	       		   	      	
	  	  	  	       		   	      	
	  	  	  	       		   	      	
    System.out.println("the radius is "+ c1.getRadius());	  	  	  	       		   	      	
    System.out.println("the circumference is "+ c1.calculateCircumference());	  	  	  	       		   	      	
    System.out.println("the surfacearea is "+ c1.calculateSurfaceArea());	  	  	  	       		   	      	
	  	  	  	       		   	      	
	  	  	  	       		   	      	
	  	  	  	       		   	      	
  }	  	  	  	       		   	      	
}