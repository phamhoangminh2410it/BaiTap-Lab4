class Circle
{
	private double radius;
	private String color;

	public Circle(double radius, String color)
	{
		this.radius = radius;
		this.color = color;
	}
	public double getRadius()
	{
		return this.radius;
	}
	public String getColor()
	{
		return this.color;
	}
	public double getArea(double area)
	{
		return area;
	}
	public String toString()
	{
		return "Radius: " + radius + "\nColor: " + color;
	}
}

class Cylinder extends Circle
{
	private double height;

	public Cylinder(double radius, String color, double height)
	{
		super(radius, color);
		this.height = height;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	public double getHeight()
	{
		return this.height;
	}
	public double getVolume()
	{
		return getArea()*height;
	}
}

public class BaiTapLab4
{
	public static void main(String[] args)
	{
		Cylinder data1 = new Cylinder(1.2, "Red", 2.5);
		data1.getArea(5);
		System.out.println(data1.toString());
	}
}