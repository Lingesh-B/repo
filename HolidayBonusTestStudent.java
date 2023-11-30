import static org.junit.Assert.*;

import org.junit.Test;

public class HolidayBonusTestStudent 
{

    @Test
    public void testCalculateHolidayBonus() 
    {
        double[][] dataSet = {
                { 1000, 2000, 3000 },
                { 4000, 5000, 6000 },
                { 7000, 8000, 9000 }
        };

        double[] expected = { 6000, 15000, 24000 };
        double[] result = HolidayBonus.calculateHolidayBonus(dataSet);

        assertArrayEquals(expected, result, 0.001);
    }

    @Test
    public void testCalculateTotalHolidayBonus() 
    {
        double[][] dataSet = {
                { 1000, 2000, 3000 },
                { 4000, 5000, 6000 },
                { 7000, 8000, 9000 }
        };

        double expected = 45000.0;
        double result = HolidayBonus.calculateTotalHolidayBonus(dataSet);

        assertEquals(expected, result, 0.001);
    }

   
}
