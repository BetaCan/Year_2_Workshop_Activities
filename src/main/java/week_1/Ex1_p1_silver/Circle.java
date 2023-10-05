package week_1.Ex1_p1_silver;

public class Circle
{	  	  	  	       		   	      	
  public double radius, x, y;	  	  	  	       		   	      	
	  	  	  	       		   	      	
  public Circle(double x, double y, double radius)	  	  	  	       		   	      	
  {	  	  	  	       		   	      	
    this.radius = radius;	  	  	  	       		   	      	
    this.x = x;	  	  	  	       		   	      	
    this.y = y;	  	  	  	       		   	      	
  }	  	  	  	       		   	      	
	  	  	  	       		   	      	
  public double calculateCircumference()	  	  	  	       		   	      	
  {	  	  	  	       		   	      	
    return 2 * Math.PI * radius;	  	  	  	       		   	      	
  }	  	  	  	       		   	      	
	  	  	  	       		   	      	
  public double calculateSurfaceArea()	  	  	  	       		   	      	
  {	  	  	  	       		   	      	
    return Math.PI * radius * radius;	  	  	  	       		   	      	
  }	  	  	  	       		   	      	
	  	  	  	       		   	      	
	  	  	  	       		   	      	
}