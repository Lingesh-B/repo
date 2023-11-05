/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Plot class
 * Due: 11/04/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Lingesh Babu
*/

public class Plot 
{
	int x, y, depth, width, topRightX, topRightY; 
	
	
	public Plot()
	{
		this.x = 0; 
		this.y = 0; 
		this.depth = 1; 
		this.width = 1;
	}
	
	public Plot(int x1, int y1, int d, int w)
	{
		this.x = x1;
		this.y = y1;
		this.depth = d;
		this.width = w; 
	}
	
	public Plot(Plot p)
	{
		this.x = p.x; 
		this.y = p.y;
		this.depth = p.depth;
		this.width = p.width; 
	}
	
	public String toString()
	{
		return x + "," + y + "," + depth + "," + width; 
	}
	
	public void setX(int x1)
	{
		x = x1; 
	}
	public int getX()
	{
		return x; 
	}
	
	
	public void setY(int y1)
	{
		y = y1;
	}
	public int getY()
	{
		return y;
	}
	
	
	public void setDepth(int d)
	{
		depth = d; 
	}
	public int getDepth()
	{
		return depth;
	}
	
	
	public void setWidth(int w)
	{
		width = w;
	}
	public int getWidth()
	{
		return width;
	}

	
	
	public boolean overlaps(Plot plot) 
	{
		if (this.getY() + this.getDepth() < plot.getY() || this.getY() > plot.getY() + plot.getDepth()) 
		{
	        return false;
	    }

	    // Check for horizontal overlap
	    if (this.getX() + this.getWidth() < plot.getX() || this.getX() > plot.getX() + plot.getWidth()) 
	    {
	        return false;
	    }

	    return true;
	}
	
	public boolean encompasses(Plot plot)
	{
		return true;
	}
	
	
}
