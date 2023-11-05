import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyTestStudent {

	@Test
    public void testDefaultConstructor() {
        Property property = new Property();
        assertEquals("", property.getPropertyName());
        assertEquals("", property.getCity());
        assertEquals("", property.getOwner());
        assertEquals(0.0, property.getRentAmount(), 0.01);
        assertEquals(new Plot(), property.getPlot());
    }
    
    @Test
    public void testParameterizedConstructor() {
        Property property = new Property("MyHouse", "MyCity", 1500.0, "John Doe");
        assertEquals("MyHouse", property.getPropertyName());
        assertEquals("MyCity", property.getCity());
        assertEquals("John Doe", property.getOwner());
        assertEquals(1500.0, property.getRentAmount(), 0.01);
        assertEquals(new Plot(), property.getPlot());
    }
    
    @Test
    public void testPlotParameterizedConstructor() {
        Property property = new Property("MyHouse", "MyCity", 1500.0, "John Doe", 2, 3, 4, 5);
        assertEquals("MyHouse", property.getPropertyName());
        assertEquals("MyCity", property.getCity());
        assertEquals("John Doe", property.getOwner());
        assertEquals(1500.0, property.getRentAmount(), 0.01);
        Plot expectedPlot = new Plot(2, 3, 4, 5);
        assertEquals(expectedPlot.getX(), property.getPlot().getX());
        assertEquals(expectedPlot.getY(), property.getPlot().getY());
        assertEquals(expectedPlot.getWidth(), property.getPlot().getWidth());
        assertEquals(expectedPlot.getDepth(), property.getPlot().getDepth());
    }
    
    @Test
    public void testCopyConstructor() {
        Property original = new Property("MyHouse", "MyCity", 1500.0, "John Doe");
        Property copy = new Property(original);
        assertEquals(original.getPropertyName(), copy.getPropertyName());
        assertEquals(original.getCity(), copy.getCity());
        assertEquals(original.getOwner(), copy.getOwner());
        assertEquals(original.getRentAmount(), copy.getRentAmount(), 0.01);
        assertEquals(original.getPlot(), copy.getPlot());
    }
    
    @Test
    public void testToString() {
        Property property = new Property("MyHouse", "MyCity", 1500.0, "John Doe");
        String expected = "MyHouse,MyCity,John Doe,1500.0";
        assertEquals(expected, property.toString());
    }
    
    @Test
    public void testSetters() {
        Property property = new Property();
        property.setPropertyName("NewHouse");
        property.setCity("NewCity");
        property.setOwner("NewOwner");
        property.setRentAmount(2000.0);
        Plot newPlot = new Plot(2, 3, 4, 5);
        property.setPlot(newPlot);
        
        assertEquals("NewHouse", property.getPropertyName());
        assertEquals("NewCity", property.getCity());
        assertEquals("NewOwner", property.getOwner());
        assertEquals(2000.0, property.getRentAmount(), 0.01);
        assertEquals(newPlot, property.getPlot());
    }

}
