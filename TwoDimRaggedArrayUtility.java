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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public final class TwoDimRaggedArrayUtility extends Object
{
	
	public TwoDimRaggedArrayUtility()
	{
		 
	}
	
	public static double getTotal(double[][] data)
	{
		double total = 0; 
		
		for(double[] index : data)
		{
			
			for(double value : index)
			{
				total += value; 
			}
		}
		
		return total; 
	}
	
	public static double getAverage(double[][] data)
	{
		int count = 0; 
		double average = 0; 
		double total = 0; 
		
		for(double[] row : data)
		{
			
			for(double value : row)
			{
				total += value; 
				count += 1; 
				
			}
			
			average = total / count; 
		}
		
		return average; 
	}
	
	public static double getColumnTotal(double[][] data, int col)
	{
		double total = 0;
		
		for(double[] row : data)
		{
			total += row[col];  
		}
		
		return total;
	}
	
	public static double getRowTotal(double[][] data, int row)
	{
		double total = 0; 
		
		for(double value : data[row])
		{
			total += value; 
		}
		
		return total; 
	}
	
	public static double getHighestInArray(double[][] data)
	{
		double highest = Double.MIN_EXPONENT; 
		
		for(double[] index : data)
		{
			
			for(double value : index)
			{
				if(value > highest)
				{
					highest = value; 
				}
			}
		}
		
		return highest;
	}
	
	public static double getLowestInArray(double[][] data)
	{
		double lowest = Double.MAX_EXPONENT; 
		
		for(double[] index : data)
		{
			
			for(double value : index)
			{
				if(value < lowest)
				{
					lowest = value; 
				}
			}
		}
		
		return lowest;
	}
	
	public static double getHighestInColumn(double[][] data, int col)
	{
		double highest = Double.MIN_EXPONENT; 
		
		for(double[] row : data)
		{
			if(row[col] > highest)
			{
				highest = row[col];
			}
		}
		
		return highest; 
	}
	
	public static double getLowestInColumn(double[][] data, int col)
	{
		double lowest = Double.MAX_EXPONENT; 
		
		for(double[] row : data)
		{
			if(row[col] < lowest)
			{
				lowest = row[col];
			}
		}
		
		return lowest;
	}
	
	public static double getHighestInRow(double[][] data, int row)
	{
		double highest = Double.MIN_EXPONENT;
		
		for(double value : data[row])
		{
			if(value > highest)
			{
				highest = value; 
			}
		}
		
		return highest; 
		
	}
	
	public static double getLowestInRow(double[][] data, int row)
	{
		double lowest = Double.MAX_EXPONENT;
		
		for(double value : data[row])
		{
			if(value < lowest)
			{
				lowest = value; 
			}
		}
		
		return lowest; 
		
	}
	
	public static int getHighestInColumnIndex(double[][] data, int col)
	{
		int highestIndex = 0; 
		double highest = Double.MIN_EXPONENT; 
		
		for(int i = 0; i < data.length; i++)
		{
			if(data[i][col] > highest)
			{
				highest = data[i][col]; 
				highestIndex = i; 
			}
		}
		
		return highestIndex; 
	}
	
	public static int getLowestInColumnIndex(double[][] data, int col)
	{
		int lowestIndex = 0; 
		double lowest = Double.MAX_EXPONENT; 
		
		for(int i = 0; i < data.length; i++)
		{
			if(data[i][col] < lowest)
			{
				lowest = data[i][col]; 
				lowestIndex = i; 
			}
		}
		
		return lowestIndex; 
	}
	
	public static int getHighestInRowIndex(double[][] data, int row)
	{
		int highestIndex = 0; 
		double highest = Double.MIN_EXPONENT;
		
		for(int i = 0; i < data[row].length; i++)
		{
			if(data[row][i] > highest)
			{
				highest = data[row][i];
				highestIndex = i;
			}
		}
		
		return highestIndex; 
	}
	
	public static int getLowestInRowIndex(double[][] data, int row)
	{
		int lowestIndex = 0; 
		double lowest = Double.MAX_EXPONENT;
		
		for(int i = 0; i < data[row].length; i++)
		{
			if(data[row][i] < lowest)
			{
				lowest = data[row][i];
				lowestIndex = i;
			}
		}
		
		return lowestIndex; 
	}
	
	public static void writeToFile(double[][] data,File outputFile) throws FileNotFoundException
	{
		PrintWriter write = new PrintWriter(outputFile);
				
		for(int i = 0; i < data.length; i++)
		{
			for(int j = 0; j < data[i].length; j++)
			{
				write.print(data[i][j] + " ");
			}
			
			write.println();
		}
	}


}
