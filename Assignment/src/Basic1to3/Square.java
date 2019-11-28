package Basic1to3;
public class Square extends Shape{
	private Point topLeft;
	private double width;
	
	//create a constructor
	public Square(Point topLeft, double width ){
	super("Square");
	this.topLeft = topLeft;
	
	this.width = width;
	}
	
	//set width
	public void setWidth(double width){
	this.width = width;
	}
	
	//set topleft
	public void settopLeft(Point topLeft){
	this.topLeft = topLeft;
	}
	
	//get width
	public double getWidth(){
	return width;
	}
	
	//get topleft
	public Point getTopLeft(){
		return topLeft;
	}
	//get the area of square
	public double getArea(){
		return width*width;
	}
	
	//print the topleft, width and area
	public String toString(){
		return "TopLeft ="  + getTopLeft() + "; Width = " + getWidth() + "; area ="  + getArea();
	}

}//End of Square