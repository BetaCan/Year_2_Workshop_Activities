package week_1.Ex1_p2_gold;

public class Circle
{	  	  	  	       		   	      	
  private double radius, x, y;	  	  	  	       		   	      	
	  	  	  	       		   	      	
  public Circle()	  	  	  	       		   	      	
  {	  	  	  	       		   	      	
    this(1.0, 1.0, 1.0);	  	  	  	       		   	      	
  }	  	  	  	       		   	      	
	  	  	  	       		   	      	
  public Circle(double x, double y, double radius)	  	  	  	       		   	      	
  {	  	  	  	       		   	      	
    this.x = x;	  	  	  	       		   	      	
    this.y = y;	  	  	  	       		   	      	
    if (radius < 0)	  	  	  	       		   	      	
    {	  	  	  	       		   	      	
      this.radius = 1.0;	  	  	  	       		   	      	
    }	  	  	  	       		   	      	
    else	  	  	  	       		   	      	
    {	  	  	  	       		   	      	
      this.radius = radius;	  	  	  	       		   	      	
    }	  	  	  	       		   	      	
  }	  	  	  	       		   	      	
	  	  	  	       		   	      	
  public Circle(double x, double y)	  	  	  	       		   	      	
  {	  	  	  	       		   	      	
    this(x, y, 1.0);	  	  	  	       		   	      	
  }	  	  	  	       		   	      	
	  	  	  	       		   	      	
  public Circle(double radius)	  	  	  	       		   	      	
  {	  	  	  	       		   	      	
    this(1.0, 1.0);	  	  	  	       		   	      	
    if (radius < 0)	  	  	  	       		   	      	
    {	  	  	  	       		   	      	
      this.radius = 1.0;	  	  	  	       		   	      	
    }	  	  	  	       		   	      	
    else	  	  	  	       		   	      	
    {	  	  	  	       		   	      	
      this.radius = radius;	  	  	  	       		   	      	
    }	  	  	  	       		   	      	
  }	  	  	  	       		   	      	
	  	  	  	       		   	      	
  public double getRadius()	  	  	  	       		   	      	
  {	  	  	  	       		   	      	
    return this.radius;	  	  	  	       		   	      	
  }	  	  	  	       		   	      	
	  	  	  	       		   	      	
  public void setRadius(double radius)	  	  	  	       		   	      	
  {	  	  	  	       		   	      	
    if (radius < 0)	  	  	  	       		   	      	
    {	  	  	  	       		   	      	
	  	  	  	       		   	      	
      }	  	  	  	       		   	      	
    else	  	  	  	       		   	      	
    {	  	  	  	       		   	      	
      this.radius = radius;	  	  	  	       		   	      	
    }	  	  	  	       		   	      	
  }	  	  	  	       		   	      	
	  	  	  	       		   	      	
  public double getX()	  	  	  	       		   	      	
  {	  	  	  	       		   	      	
    return this.x;	  	  	  	       		   	      	
  }	  	  	  	       		   	      	
	  	  	  	       		   	      	
  public void setX(double x)	  	  	  	       		   	      	
  {	  	  	  	       		   	      	
    this.x = x;	  	  	  	       		   	      	
  }	  	  	  	       		   	      	
	  	  	  	       		   	      	
  public double getY()	  	  	  	       		   	      	
  {	  	  	  	       		   	      	
    return this.y;	  	  	  	       		   	      	
  }	  	  	  	       		   	      	
	  	  	  	       		   	      	
  public void setY(double y)	  	  	  	       		   	      	
  {	  	  	  	       		   	      	
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