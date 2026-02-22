/**
This class represents a rectangle 
Class 2

@author TR Masalesa - 45312222
@version 20260219
*/

import java.util.Scanner;

public class RectangularTest
{
	public static void main(String [] args)
    {

	    Scanner input = new Scanner(System.in);
	
	    System.out.print("Enter the color: ");
	    String colorInput = input.nextLine();
		
	    System.out.print("Enter the length: ");
	    int lengthInput = input.nextInt();
		
	    System.out.print("Enter the width: ");
	    int widthInput = input.nextInt();
		
		RectangularThing rt2 = new RectangularThing();
		
		rt2.setColor(colorInput);
		rt2.setLength(lengthInput);
		rt2.setWidth(widthInput);
		
		System.out.println(rt2);
	
    }
	
}