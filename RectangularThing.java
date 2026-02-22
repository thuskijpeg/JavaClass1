/**
This class represents a rectangle 
Class 1

@author TR Masalesa - 4531222
@version 20260219
*/

import java.util.Scanner;

public class RectangularThing
{
	private String color;
	private int length;
	private int width;
	
	public RectangularThing()
	{
		this("", 0, 0);
	}
	/**
	*Creates a RectangularThing object
    *@param color The color of the rectangle	
	*@param length The length of the rectangle	
	*@param width The width of the rectangle	
	*/
	
	public RectangularThing(String color, int length, int width)
	{
		setColor(color);
		setLength(length);
		setWidth(width);
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setLength(int length)
	{
		this.length = length;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	/**
	*Returns rectangle's color
	*
	*@return the color of rectangle
	*/
	
	public String getColor()
	{
		return color;
	}
	
	/**
	*Returns rectangle's length
	*
	*@return the length of rectangle
	*/
	
	public int getLength()
	{
		return length;
	}
	
	/**
	*Returns rectangle's width
	*
	*@return the width of rectangle
	*/
	
	public int getWidth()
	{
		return width;
	}
	
	public String toString()
	{
		return "Color: " + color + ", Length: " + length + ", Width: " + width;
	}
	
	public static void main (String []args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the color: ");
		String colorInput = input.nextLine();
		
		System.out.print("Enter the length: ");
		int lengthInput = input.nextInt();
		
		System.out.print("Enter the width: ");
		int widthInput = input.nextInt();
		
		RectangularThing rt1 = new RectangularThing(colorInput, lengthInput, widthInput);
		
		System.out.println(rt1);
	}
}