import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagementCompanyTestStudent 
{

	@Test
    public void testGetName() 
	{
        ManagementCompany company = new ManagementCompany("Test Company", "12345", 5);
        assertEquals("Test Company", company.getName());
    }

    @Test
    public void testGetTaxID()
    {
        ManagementCompany company = new ManagementCompany("Test Company", "12345", 5);
        assertEquals("12345", company.getTaxID());
    }

    @Test
    public void testGetMgmFeePer() 
    {
        ManagementCompany company = new ManagementCompany("Test Company", "12345", 5.0, 0, 0, 10, 10);
        assertEquals(5.0, company.getMgmFeePer(), 0.001); // Using delta for double comparison
    }

    @Test
    public void testGetPlot() 
    {
        ManagementCompany company = new ManagementCompany("Test Company", "12345", 5.0, 0, 0, 10, 10);
        Plot plot = company.getPlot();
        assertEquals(0, plot.getX());
        assertEquals(0, plot.getY());
        assertEquals(10, plot.getWidth());
        assertEquals(10, plot.getDepth());
    }

    @Test
    public void testAddProperty() 
    {
        ManagementCompany company = new ManagementCompany("Test Company", "12345", 5.0, 0, 0, 10, 10);
        Property property1 = new Property("Property 1", "City 1", 1000, "Owner 1", 1, 1, 5, 5);
        Property property2 = new Property("Property 2", "City 2", 2000, "Owner 2", 6, 6, 5, 5);
        
        int result1 = company.addProperty(property1);
        int result2 = company.addProperty(property2);

        assertEquals(0, result1); // Property 1 should be added successfully (index 0).
        assertEquals(1, result2); // Property 2 should be added successfully (index 1).
    }


    

}
