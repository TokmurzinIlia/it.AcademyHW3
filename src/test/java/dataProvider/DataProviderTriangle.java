package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderTriangle {

    @DataProvider(name = "dataProviderWithTruePositiveNumber")

    public static Object[][] dataProviderWithTruePositiveNumber(){
        return new Object[][] {
                {1, 1 ,1},
                {2, 3, 4},
                {0.8 ,0.5 ,1},
                {3, 4, 5},
                {Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE}
        };
    }


}
