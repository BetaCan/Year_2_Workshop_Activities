package week_1.Ex1_p2_gold;

public class CircleTest
{	  	  	  	       		   	      	
  public static void main(String[] args)	  	  	  	       		   	      	
  {	  	  	  	       		   	      	
    Circle c1 = new Circle(100, 100, 10.0);	  	  	  	       		   	      	
    c1.setRadius(-5.0);	  	  	  	       		   	      	
	  	  	  	       		   	      	
    System.out.println("the radius is " + c1.getRadius());	  	  	  	       		   	      	
    System.out.println("the circumference is " + c1.calculateCircumference());	  	  	  	       		   	      	
    System.out.println("the surfacearea is " + c1.calculateSurfaceArea());	  	  	  	       		   	      	
    printCircle(c1);	  	  	  	       		   	      	
  }	  	  	  	       		   	      	
	  	  	  	       		   	      	
  public static String printCircle(Circle c)	  	  	  	       		   	      	
  {	  	  	  	       		   	      	
    String plswork = "The circle is at x = " + c.getX() + " and y = " + c.getY() + " with a radius of " + c.getRadius();	  	  	  	       		   	      	
    System.out.println(plswork);	  	  	  	       		   	      	
    return plswork;	  	  	  	       		   	      	
  }	  	  	  	       		   	      	
}