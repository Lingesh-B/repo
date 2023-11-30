/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Calculates Bonus
 * Due: 11/29/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Lingesh Babu
*/


public class HolidayBonus 
{
	final double HIGHEST_BONUS = 5000.0;
	final double LOWEST_BONUS = 1000.0;
	final double REST_BONUS = 2000.0;

	public HolidayBonus()
	{
		
	}
	
	public static double[] calculateHolidayBonus(double[][] dataSet) 
	{
        double[] holidayBonus = new double[dataSet.length];

        for (int i = 0; i < dataSet.length; i++) 
        {
            holidayBonus[i] = TwoDimRaggedArrayUtility.getRowTotal(dataSet, i);

            // Apply bonus rules
            if (holidayBonus[i] > 0) 
            {
                if (holidayBonus[i] > 10000) 
                {
                    holidayBonus[i] += 5000.0;
                } 
                else if (holidayBonus[i] >= 5000 && holidayBonus[i] <= 10000) 
                {
                    holidayBonus[i] += 2000.0;
                } 
                else
                {
                    holidayBonus[i] += 1000.0;
                }
            }
        }

        return holidayBonus;
    }

    public static double calculateTotalHolidayBonus(double[][] dataSet) 
    {
        double totalHolidayBonus = TwoDimRaggedArrayUtility.getTotal(dataSet);

        // Apply bonus rules for the total
        if (totalHolidayBonus > 0) 
        {
            if (totalHolidayBonus > 10000)
            {
                totalHolidayBonus += 5000.0;
            } 
            else if (totalHolidayBonus >= 5000 && totalHolidayBonus <= 10000)
            {
                totalHolidayBonus += 2000.0;
            } 
            else 
            {
                totalHolidayBonus += 1000.0;
            }
        }

        return totalHolidayBonus;
    }

}
