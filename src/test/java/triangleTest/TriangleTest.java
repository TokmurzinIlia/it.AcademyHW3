package triangleTest;


import dataProvider.DataProviderTriangle;
import org.testng.annotations.Test;
import triangle.Triangle;

import static org.testng.AssertJUnit.assertTrue;

public class TriangleTest {


        Triangle triangle;


    @Test(dataProvider = "dataProviderWithTruePositiveNumber", dataProviderClass = DataProviderTriangle.class)
    public void checkTriangleWithTruePositiveNumber(double a, double b, double c){
        triangle = new Triangle(a, b, c);
        assertTrue(triangle.checkTriangle());
    }
}
