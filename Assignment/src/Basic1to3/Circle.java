package Basic1to3;
public class Circle extends Shape{
	Point center; //store the center
	double radius; //store the radius
	 
	//create a constructor
	public Circle(Point center, double radius){
	// initialize name, center & radius
	super("Circle");
	this.center = center;
	this.radius = radius;
	}
	
	//Set radius
	public void setRadius(double radius){
	this.radius = radius;
	}
	
	//Set center
	public void setCenter(Point center){
	this.center = center;	}
	
	//Get radius
	public double getRadius() {
	return radius;
	}
	
	//Get Center
	public Point getCenter() {
	return center;
	}
	
	//Get Area
	public double getArea(){
	return (22/7)*radius*radius;
	}
	
	//Print the Center, radius and area
	public String toString()
	{return "center ="  + getCenter() + ", radius = " + getRadius() + "," + "area = " + getArea(); 
	}

	}// End of Circle


