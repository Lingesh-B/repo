/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Manager class
 * Due: 11/04/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Lingesh Babu
*/


import java.util.Objects;

public class ManagementCompany 
{
	static final int MAX_PROPERTY = 5; 
    static final int MGMT_WIDTH = 10;
	static final int MGMT_DEPTH = 10; 
	String name, taxID;
	double fee;
	int propertiesCount; 
	Property[] properties; 
	Plot plot = new Plot();
	
	public ManagementCompany()
	{
		name = ""; 
		taxID = "";
		fee = 0; 
		propertiesCount = 0; 
		properties = new Property[0];
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH); 
		
	}
	
	public ManagementCompany(String name, String taxID, int propertiesCount)
	{
		this.name = name;
		this.taxID = taxID; 
		this.propertiesCount = propertiesCount;
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth)
	{
		this.name = name; 
		this.taxID = taxID; 
		this.fee = mgmFee;
		this.plot = new Plot(x, y, width, depth); 
		properties = new Property[0];
	}
	
	public ManagementCompany(ManagementCompany otherCompany)
	{
		this.name = otherCompany.name; 
		this.taxID = otherCompany.taxID; 
		this.fee = otherCompany.fee; 
		this.plot = otherCompany.plot; 
	}
	
	
	public String getName()
	{
		return name; 
	}
	
	public String getTaxID()
	{
		return taxID;
	}
	
	public double getMgmFeePer()
	{
		return fee; 
	}
	
	public Plot getPlot()
	{
		return plot; 
	}
	
	
	
	public int addProperty(Property property) {
		if(propertiesCount == MAX_PROPERTY) {
			return -1;
		}
		
		if(properties == null) {
			return -2;
		}
		
		if(!plot.encompasses(property.getPlot())) {
			return -3;
		}
		
		for(int i = 0; i < propertiesCount; i++) {
			if(property.getPlot().overlaps(properties[i].getPlot())) {
				return -4;
			}
		}
		
		Property prop = new Property(property);
		
		properties[propertiesCount] = prop;
		propertiesCount++;
		
		return propertiesCount-1;
		
	}
	
	public int getPropertiesCount()
	{
		int count = 0; 
		
		for(int i = 0; i < properties.length; i++)
		{
			if(properties[i] != null)
			{
				count++;
			}
		}
		
		return count; 
    }
	
	

}
