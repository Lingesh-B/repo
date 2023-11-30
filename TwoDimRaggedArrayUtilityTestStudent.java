import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilityTestStudent 
{

    private double[][] testData;

    @Before
    public void setUp() {
        testData = new double[][] { { 1.0, 2.0, 3.0 }, { 4.0, 5.0 }, { 6.0, 7.0, 8.0 } };
    }

    @Test
    public void testGetTotal() {
        double expectedTotal = 36.0; // 1+2+3+4+5+6+7+8
        double actualTotal = TwoDimRaggedArrayUtility.getTotal(testData);
        assertEquals(expectedTotal, actualTotal, 0.0001);
    }

    @Test
    public void testGetAverage() {
        double expectedAverage = 4.5; // (1+2+3+4+5+6+7+8)/8
        double actualAverage = TwoDimRaggedArrayUtility.getAverage(testData);
        assertEquals(expectedAverage, actualAverage, 0.0001);
    }

    @Test
    public void testGetColumnTotal() {
        int col = 1;
        double expectedColumnTotal = 14.0; // 2+5+7
        double actualColumnTotal = TwoDimRaggedArrayUtility.getColumnTotal(testData, col);
        assertEquals(expectedColumnTotal, actualColumnTotal, 0.0001);
    }
    
    @Test
    public void testGetRowTotal() {
        int row = 1;
        double expectedRowTotal = 9.0; // 4+5
        double actualRowTotal = TwoDimRaggedArrayUtility.getRowTotal(testData, row);
        assertEquals(expectedRowTotal, actualRowTotal, 0.0001);
    }


    @Test
    public void testWriteToFile() throws FileNotFoundException {
        File outputFile = new File("testOutput.txt");
        TwoDimRaggedArrayUtility.writeToFile(testData, outputFile);

        assertTrue(outputFile.exists());
        outputFile.delete();
    }
    
    @Test
    public void testGetHighestInArray() {
        double expectedHighest = 8.0; // Highest value in the test data
        double actualHighest = TwoDimRaggedArrayUtility.getHighestInArray(testData);
        assertEquals(expectedHighest, actualHighest, 0.0001);
    }

    @Test
    public void testGetLowestInArray() {
        double expectedLowest = 1.0; // Lowest value in the test data
        double actualLowest = TwoDimRaggedArrayUtility.getLowestInArray(testData);
        assertEquals(expectedLowest, actualLowest, 0.0001);
    }

    @Test
    public void testGetHighestInColumn() {
        int col = 2;
        double expectedHighestInColumn = 8.0; // Highest value in column 2
        double actualHighestInColumn = TwoDimRaggedArrayUtility.getHighestInColumn(testData, col);
        assertEquals(expectedHighestInColumn, actualHighestInColumn, 0.0001);
    }

    @Test
    public void testGetLowestInColumn() {
        int col = 0;
        double expectedLowestInColumn = 1.0; // Lowest value in column 0
        double actualLowestInColumn = TwoDimRaggedArrayUtility.getLowestInColumn(testData, col);
        assertEquals(expectedLowestInColumn, actualLowestInColumn, 0.0001);
    }

    @Test
    public void testGetHighestInRow() {
        int row = 2;
        double expectedHighestInRow = 8.0; // Highest value in row 2
        double actualHighestInRow = TwoDimRaggedArrayUtility.getHighestInRow(testData, row);
        assertEquals(expectedHighestInRow, actualHighestInRow, 0.0001);
    }

    @Test
    public void testGetLowestInRow() {
        int row = 0;
        double expectedLowestInRow = 1.0; // Lowest value in row 0
        double actualLowestInRow = TwoDimRaggedArrayUtility.getLowestInRow(testData, row);
        assertEquals(expectedLowestInRow, actualLowestInRow, 0.0001);
    }

    @Test
    public void testGetHighestInColumnIndex() {
        int col = 2;
        int expectedHighestIndex = 2; // Index of the highest value in column 2
        int actualHighestIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(testData, col);
        assertEquals(expectedHighestIndex, actualHighestIndex);
    }

    @Test
    public void testGetLowestInColumnIndex() {
        int col = 0;
        int expectedLowestIndex = 0; // Index of the lowest value in column 0
        int actualLowestIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(testData, col);
        assertEquals(expectedLowestIndex, actualLowestIndex);
    }

    @Test
    public void testGetHighestInRowIndex() {
        int row = 2;
        int expectedHighestIndex = 2; // Index of the highest value in row 2
        int actualHighestIndex = TwoDimRaggedArrayUtility.getHighestInRowIndex(testData, row);
        assertEquals(expectedHighestIndex, actualHighestIndex);
    }

    @Test
    public void testGetLowestInRowIndex() {
        int row = 0;
        int expectedLowestIndex = 0; // Index of the lowest value in row 0
        int actualLowestIndex = TwoDimRaggedArrayUtility.getLowestInRowIndex(testData, row);
        assertEquals(expectedLowestIndex, actualLowestIndex);
    }
}
