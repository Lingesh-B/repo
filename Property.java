/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Property class
 * Due: 11/04/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Lingesh Babu
*/

public class Property 
{
	String propertyName, city, owner;
	double rentalAmount; 
	Plot plot = new Plot();
	
	public Property()
	{
		this.propertyName = ""; 
		this.city = ""; 
		this.owner = ""; 
		this.rentalAmount = 0;
	}
	
	public Property(String pName, String c, double rAmount, String o)
	{
		this.propertyName = pName;
		this.city = c; 
		this.rentalAmount = rAmount; 
		this.owner = o; 
	}
	
	public Property(String pName, String c, double rAmount, String o, int x, int y, int w, int d)
	{ 	
		this.propertyName = pName;
		this.city = c; 
		this.rentalAmount = rAmount; 
		this.owner = o; 
		plot.x = x; 
		plot.y = y; 
		plot.width = w;
		plot.depth = d; 
	}
	
	
	public Property(Property otherProperty)
	{ 
		this.propertyName = otherProperty.propertyName; 
		this.city = otherProperty.city; 
		this.rentalAmount = otherProperty.rentalAmount; 
		this.owner = otherProperty.owner; 
		
	}
	

	public String getPropertyName() 
	{
		return propertyName;
	}

	public void setPropertyName(String propertyName) 
	{
		this.propertyName = propertyName;
	}

	public String getCity() 
	{
		return city;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}

	public String getOwner() 
	{
		return owner;
	}

	public void setOwner(String owner) 
	{
		this.owner = owner;
	}

	public double getRentAmount() 
	{
		return rentalAmount;
	}

	public void setRentAmount(double rentalAmount) 
	{
		this.rentalAmount = rentalAmount;
	}

	public Plot getPlot() 
	{
		return plot;
	}

	public void setPlot(Plot plot)
	{
		this.plot = plot;
	}

//	@Override
	public String toString() 
	{
		return propertyName + "," + city + "," + owner + "," + rentalAmount;
	}

	
	
	
	
	

}
