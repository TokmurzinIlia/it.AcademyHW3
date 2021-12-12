package triangleTest;


import dataProvider.DataProviderTriangle;
import org.testng.annotations.Test;
import triangle.Triangle;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class TriangleTest {


        Triangle triangle;


    @Test(dataProvider = "dataProviderWithTruePositiveNumber", dataProviderClass = DataProviderTriangle.class,
        description = "Test check triangle with true positive number",
        groups = {"Test triangle", "Test triangle check triangle"})
    public void testTriangleWithTruePositiveNumber(double a, double b, double c){
        triangle = new Triangle(a, b, c);
        assertTrue(triangle.checkTriangle());
    }


    @Test(dataProvider = "dataProviderWithFalseNumber", dataProviderClass = DataProviderTriangle.class,
         groups = {"Test triangle", "Test triangle check triangle"})
    public void testTriangleWithFalseNumber(double a, double b, double c){
        triangle = new Triangle(a, b, c);
        assertFalse(triangle.checkTriangle());
    }

    @Test(dataProvider = "dataProviderGetMessageWithAEqualsZero", dataProviderClass = DataProviderTriangle.class,
            groups = {"Test triangle", "Test triangle check sides"})
    public void testGetMessageWithAEqualsZero(double a, double b, double c, String expectedSting){
        triangle = new Triangle(a, b, c);
        triangle.checkTriangle();
        assertEquals(triangle.getMessage(), expectedSting);
    }

    @Test(dataProvider = "dataProviderGetMessageWithALessThanZero", dataProviderClass = DataProviderTriangle.class,
            groups = {"Test triangle", "Test triangle check sides"})
    public void testGetMessageWithALessThanZero(double a, double b, double c, String expectedSting){
        triangle = new Triangle(a, b, c);
        triangle.checkTriangle();
        assertEquals(triangle.getMessage(), expectedSting);
    }

    @Test(dataProvider = "dataProviderGetMessageWithBEqualsZero", dataProviderClass = DataProviderTriangle.class,
            groups = {"Test triangle", "Test triangle check sides"})
    public void testGetMessageWithBEqualsZero(double a, double b, double c, String expectedSting){
        triangle = new Triangle(a, b, c);
        triangle.checkTriangle();
        assertEquals(triangle.getMessage(), expectedSting);
    }

    @Test(dataProvider = "dataProviderGetMessageWithBLessThanZero", dataProviderClass = DataProviderTriangle.class,
            groups = {"Test triangle", "Test triangle check sides"})
    public void testGetMessageWithBLessThanZero(double a, double b, double c, String expectedSting){
        triangle = new Triangle(a, b, c);
        triangle.checkTriangle();
        assertEquals(triangle.getMessage(), expectedSting);
    }

    @Test(dataProvider = "dataProviderGetMessageWithCEqualsZero", dataProviderClass = DataProviderTriangle.class,
            groups = {"Test triangle", "Test triangle check sides"})
    public void testGetMessageWithCEqualsZero(double a, double b, double c, String expectedSting){
        triangle = new Triangle(a, b, c);
        triangle.checkTriangle();
        assertEquals(triangle.getMessage(), expectedSting);
    }

    @Test(dataProvider = "dataProviderGetMessageWithCLessThanZero", dataProviderClass = DataProviderTriangle.class,
            groups = {"Test triangle", "Test triangle check sides"})
    public void testGetMessageWithCLessThanZero(double a, double b, double c, String expectedSting){
        triangle = new Triangle(a, b, c);
        triangle.checkTriangle();
        assertEquals(triangle.getMessage(), expectedSting);
    }

    @Test(dataProvider = "dataProviderGetMessageWithAAndBEqualsZero", dataProviderClass = DataProviderTriangle.class,
            groups = {"Test triangle", "Test triangle check sides"})
    public void testGetMessageWithAAndBEqualsZero(double a, double b, double c, String expectedSting){
        triangle = new Triangle(a, b, c);
        triangle.checkTriangle();
        assertEquals(triangle.getMessage(), expectedSting);
    }

    @Test(dataProvider = "dataProviderGetMessageWithAAndBLessThanZero", dataProviderClass = DataProviderTriangle.class,
            groups = {"Test triangle", "Test triangle check sides"})
    public void testGetMessageWithAAndBLessThanZero(double a, double b, double c, String expectedSting){
        triangle = new Triangle(a, b, c);
        triangle.checkTriangle();
        assertEquals(triangle.getMessage(), expectedSting);
    }

    @Test(dataProvider = "dataProviderGetMessageWithBAndCEqualsZero", dataProviderClass = DataProviderTriangle.class,
            groups = {"Test triangle", "Test triangle check sides"})
    public void testGetMessageWithBAndCEqualsZero(double a, double b, double c, String expectedSting){
        triangle = new Triangle(a, b, c);
        triangle.checkTriangle();
        assertEquals(triangle.getMessage(), expectedSting);
    }

    @Test(dataProvider = "dataProviderGetMessageWithBAndCLessThanZero", dataProviderClass = DataProviderTriangle.class,
            groups = {"Test triangle", "Test triangle check sides"})
    public void testGetMessageWithBAndCLessThanZero(double a, double b, double c, String expectedSting){
        triangle = new Triangle(a, b, c);
        triangle.checkTriangle();
        assertEquals(triangle.getMessage(), expectedSting);
    }

    @Test(dataProvider = "dataProviderGetMessageWithAAndCEqualsZero", dataProviderClass = DataProviderTriangle.class,
            groups = {"Test triangle", "Test triangle check sides"})
    public void testGetMessageWithAAndCEqualsZero(double a, double b, double c, String expectedSting){
        triangle = new Triangle(a, b, c);
        triangle.checkTriangle();
        assertEquals(triangle.getMessage(), expectedSting);
    }

    @Test(dataProvider = "dataProviderGetMessageWithAAndCLessThanZero", dataProviderClass = DataProviderTriangle.class,
            groups = {"Test triangle", "Test triangle check sides"})
    public void testGetMessageWithAAndCLessThanZero(double a, double b, double c, String expectedSting){
        triangle = new Triangle(a, b, c);
        triangle.checkTriangle();
        assertEquals(triangle.getMessage(), expectedSting);
    }

    @Test(groups = {"Test triangle", "Test triangle check sides"})
    public void testGetMessageWithAllZeroNumber(){
        triangle = new Triangle(0, 0, 0);
        triangle.checkTriangle();
        assertEquals(triangle.getMessage(), "a<=0&b<=0&c<=0");
    }

    @Test(dataProvider = "dataProviderGetMessageWithAPlusBLessThanC", dataProviderClass = DataProviderTriangle.class,
            groups = {"Test triangle", "Test triangle check sides"})
    public void testGetMessageWithAPlusBLessThanC(double a, double b, double c, String expectedSting){
        triangle = new Triangle(a, b, c);
        triangle.checkTriangle();
        assertEquals(triangle.getMessage(), expectedSting);
    }


    @Test(dataProvider = "dataProviderGetMessageWithAPlusCLessThanB", dataProviderClass = DataProviderTriangle.class,
            groups = {"Test triangle", "Test triangle check sides"})
    public void testGetMessageWithAPlusCLessThanB(double a, double b, double c, String expectedSting){
        triangle = new Triangle(a, b, c);
        triangle.checkTriangle();
        assertEquals(triangle.getMessage(), expectedSting);
    }


    @Test(dataProvider = "dataProviderGetMessageWithBPlusCLessThanA", dataProviderClass = DataProviderTriangle.class,
            groups = {"Test triangle", "Test triangle check sides"})
    public void testGetMessageWithBPlusCLessThanA(double a, double b, double c, String expectedSting){
        triangle = new Triangle(a, b, c);
        triangle.checkTriangle();
        assertEquals(triangle.getMessage(), expectedSting);
    }

    @Test(dataProvider = "dataProviderDetectEquilateralTriangle", dataProviderClass = DataProviderTriangle.class,
            groups = {"Test triangle", "Test detect triangle"})
    public void testDetectEquilateralTriangle(double a, double b, double c, int expectedNumberTriangle){
        triangle = new Triangle(a, b, c);
        assertEquals(triangle.detectTriangle(), expectedNumberTriangle);
    }


    @Test(dataProvider = "dataProviderDetectIsoscelesTriangle", dataProviderClass = DataProviderTriangle.class,
            groups = {"Test triangle", "Test detect triangle"})
    public void testDetectIsoscelesTriangle(double a, double b, double c, int expectedNumberTriangle){
        triangle = new Triangle(a, b, c);
        assertEquals(triangle.detectTriangle(), expectedNumberTriangle);
    }


    @Test(dataProvider = "dataProviderDetectOrdynaryTriangle", dataProviderClass = DataProviderTriangle.class,
            groups = {"Test triangle", "Test detect triangle"})
    public void testDetectOrdynaryTriangle(double a, double b, double c, int expectedNumberTriangle){
        triangle = new Triangle(a, b, c);
        assertEquals(triangle.detectTriangle(), expectedNumberTriangle);
    }

    @Test(dataProvider = "dataProviderDetectRectangularTriangle", dataProviderClass = DataProviderTriangle.class,
            groups = {"Test triangle", "Test detect triangle"})
    public void testDetectRectangularTriangle(double a, double b, double c, int expectedNumberTriangle){
        triangle = new Triangle(a, b, c);
        assertEquals(triangle.detectTriangle(), expectedNumberTriangle);
    }


    @Test(dataProvider = "dataProviderDetectCombinationOfSignsTriangle", dataProviderClass = DataProviderTriangle.class,
            groups = {"Test triangle", "Test detect triangle"})
    public void testDetectCombinationOfSignsTriangle(double a, double b, double c, int expectedNumberTriangle){
        triangle = new Triangle(a, b, c);
        assertEquals(triangle.detectTriangle(), expectedNumberTriangle);
    }

    @Test(dataProvider = "dataProviderGetSquareTriangle", dataProviderClass = DataProviderTriangle.class,
            groups = {"Test triangle", "Test get square triangle"})
    public void testGetSquareTriangle(double a, double b, double c, double expectedSquareTriangle){
        triangle = new Triangle(a, b, c);
        assertEquals(triangle.getSquare(), expectedSquareTriangle, 0.001);
    }






}
