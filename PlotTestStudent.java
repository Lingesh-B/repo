import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlotTestStudent {

	 @Test
	    public void testDefaultConstructor() {
	        Plot plot = new Plot();
	        assertEquals(0, plot.getX());
	        assertEquals(0, plot.getY());
	        assertEquals(1, plot.getDepth());
	        assertEquals(1, plot.getWidth());
	    }
	    
	    @Test
	    public void testParameterizedConstructor() {
	        Plot plot = new Plot(2, 3, 4, 5);
	        assertEquals(2, plot.getX());
	        assertEquals(3, plot.getY());
	        assertEquals(4, plot.getDepth());
	        assertEquals(5, plot.getWidth());
	    }
	    
	    @Test
	    public void testCopyConstructor() {
	        Plot original = new Plot(2, 3, 4, 5);
	        Plot copy = new Plot(original);
	        assertEquals(original.getX(), copy.getX());
	        assertEquals(original.getY(), copy.getY());
	        assertEquals(original.getDepth(), copy.getDepth());
	        assertEquals(original.getWidth(), copy.getWidth());
	    }
	    
	    @Test
	    public void testToString() {
	        Plot plot = new Plot(2, 3, 4, 5);
	        String expected = "2,3,4,5";
	        assertEquals(expected, plot.toString());
	    }
	    
	    @Test
	    public void testSetX() {
	        Plot plot = new Plot();
	        plot.setX(10);
	        assertEquals(10, plot.getX());
	    }
	    
	    @Test
	    public void testSetY() {
	        Plot plot = new Plot();
	        plot.setY(20);
	        assertEquals(20, plot.getY());
	    }
	    
	    @Test
	    public void testSetDepth() {
	        Plot plot = new Plot();
	        plot.setDepth(6);
	        assertEquals(6, plot.getDepth());
	    }
	    
	    @Test
	    public void testSetWidth() {
	        Plot plot = new Plot();
	        plot.setWidth(7);
	        assertEquals(7, plot.getWidth());
	    }
	    
	    @Test
	    public void testOverlaps() {
	        Plot plot1 = new Plot(2, 3, 4, 5);
	        Plot plot2 = new Plot(6, 7, 4, 5);
	        Plot plot3 = new Plot(7, 8, 2, 3);
	        
	        assertTrue(plot1.overlaps(plot2));
	        assertFalse(plot1.overlaps(plot3));
	    }
	    
	    @Test
	    public void testEncompasses() {
	        Plot plot1 = new Plot(2, 3, 4, 5);
	        Plot plot2 = new Plot(3, 4, 2, 3);
	        Plot plot3 = new Plot(1, 2, 6, 7);
	        
	        assertTrue(plot1.encompasses(plot2));
	        assertFalse(plot1.encompasses(plot3));
	    }

}
