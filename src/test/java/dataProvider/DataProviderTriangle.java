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


    @DataProvider(name = "dataProviderWithFalseNumber")

    public static Object[][] dataProviderWithFalseNumber(){
        return new Object[][] {
                {1, 2 ,3},
                {0, 3, 4},
                {3, 0, 4},
                {3, 4, 0},
                {3, 8, 5},
                {-3, 4, 5},
                {3, -4, 5},
                {3, 4, -5},
                {0.8, 0.8, 1.6},
                {1.6, 0.8, 0.8},
                {0.8, 1.6, 0.8},
                {-0.8, 1.5, 0.8},
                {0.8, -1.5, 0.8},
                {0.8, 1.5, -0.8},
                {-0.8, -1.5, -0.8},
                {Double.MAX_VALUE, -Double.MAX_VALUE, Double.MAX_VALUE},
                {-Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE},
                {Double.MAX_VALUE, Double.MAX_VALUE, -Double.MAX_VALUE},
                {-Double.MAX_VALUE, -Double.MAX_VALUE, -Double.MAX_VALUE}
        };
    }

    @DataProvider(name = "dataProviderGetMessageWithAEqualsZero")

    public static Object[][] dataProviderGetMessageWithAEqualsZero(){
        return new Object[][] {
                {0, 3 ,3, "a<=0"},
                {0, 4 ,5, "a<=0"},
                {0, 3 ,1, "a<=0"},
                {0, 6 ,8, "a<=0"},
                {0, Double.MAX_VALUE ,Double.MAX_VALUE, "a<=0"}

        };
    }


    @DataProvider(name = "dataProviderGetMessageWithALessThanZero")
    public static Object[][] dataProviderGetMessageWithALessThanZero(){
        return new Object[][] {
                {-1, 3 ,3, "a<=0"},
                {-4, 4 ,5, "a<=0"},
                {-25.5, 3 ,1, "a<=0"},
                {-8, 6 ,8, "a<=0"},
                {-Double.MAX_VALUE, Double.MAX_VALUE ,Double.MAX_VALUE, "a<=0"}

        };
    }

    @DataProvider(name = "dataProviderGetMessageWithBEqualsZero")

    public static Object[][] dataProviderGetMessageWithBEqualsZero(){
        return new Object[][] {
                {3, 0 ,3, "b<=0"},
                {4, 0 ,5, "b<=0"},
                {2, 0 ,1, "b<=0"},
                {1, 0 ,1, "b<=0"},
                {Double.MAX_VALUE,  0,Double.MAX_VALUE, "b<=0"}

        };
    }

    @DataProvider(name = "dataProviderGetMessageWithBLessThanZero")

    public static Object[][] dataProviderGetMessageWithBLessThanZero(){
        return new Object[][] {
                {3, -1 ,3, "b<=0"},
                {4, -4 ,5, "b<=0"},
                {2, -25.5 ,1, "b<=0"},
                {1, -8 ,1, "b<=0"},
                {Double.MAX_VALUE,  -Double.MAX_VALUE,Double.MAX_VALUE, "b<=0"}

        };
    }

    @DataProvider(name = "dataProviderGetMessageWithCEqualsZero")

    public static Object[][] dataProviderGetMessageWithCEqualsZero(){
        return new Object[][] {
                {3, 3 ,0, "c<=0"},
                {4, 5 ,0, "c<=0"},
                {2, 1 ,0, "c<=0"},
                {1, 1 ,0, "c<=0"},
                {Double.MAX_VALUE,  Double.MAX_VALUE, 0, "c<=0"}

        };
    }


    @DataProvider(name = "dataProviderGetMessageWithCLessThanZero")

    public static Object[][] dataProviderGetMessageWithCLessThanZero(){
        return new Object[][] {
                {3, 3 ,-1, "c<=0"},
                {4, 5 ,-4, "c<=0"},
                {2, 1 ,-22.5, "c<=0"},
                {1, 1 ,0, "c<=0"},
                {Double.MAX_VALUE,  Double.MAX_VALUE, -Double.MAX_VALUE, "c<=0"}

        };
    }

    @DataProvider(name = "dataProviderGetMessageWithAAndBEqualsZero")

    public static Object[][] dataProviderGetMessageWithAAndBEqualsZero(){
        return new Object[][] {
                {0, 0 , 0.8, "a<=0, b<=0"},
                {0, 0 , 2, "a<=0, b<=0"},
                {0, 0 , 123587, "a<=0, b<=0"},
                {0, 0 , 123.256874569, "a<=0, b<=0"},
                {0,  0, Double.MAX_VALUE, "a<=0, b<=0"}

        };
    }


    @DataProvider(name = "dataProviderGetMessageWithAAndBLessThanZero")

    public static Object[][] dataProviderGetMessageWithAAndBLessThanZero(){
        return new Object[][] {
                {-1, -1 , 0.8, "a<=0, b<=0"},
                {-0.8, -1.6 , 2, "a<=0, b<=0"},
                {-123587, -123587 , 123587, "a<=0, b<=0"},
                {-123.256874569, -123.256874569 , 123.256874569, "a<=0, b<=0"},
                {-Double.MAX_VALUE,  -Double.MAX_VALUE, Double.MAX_VALUE, "a<=0, b<=0"}


        };
    }
    @DataProvider(name = "dataProviderGetMessageWithBAndCEqualsZero")

    public static Object[][] dataProviderGetMessageWithBAndCEqualsZero(){
        return new Object[][] {
                {0.8, 0 , 0, "b<=0, c<=0"},
                {2, 0 , 0, "b<=0, c<=0"},
                {123587, 0 , 0, "b<=0, c<=0"},
                {123.256874569, 0 , 0, "b<=0, c<=0"},
                {Double.MAX_VALUE,  0, 0, "b<=0, c<=0"}

        };
    }


    @DataProvider(name = "dataProviderGetMessageWithBAndCLessThanZero")

    public static Object[][] dataProviderGetMessageWithBAndCLessThanZero(){
        return new Object[][] {
                {0.8, -1, -1, "b<=0, c<=0"},
                {2, -0.8, -1.6 , "b<=0, c<=0"},
                { 123587, -123587, -123587 ,"b<=0, c<=0"},
                { 123.256874569, -123.256874569, -123.256874569 , "b<=0, c<=0"},
                { Double.MAX_VALUE, -Double.MAX_VALUE,  -Double.MAX_VALUE,"b<=0, c<=0"}


        };
    }


    @DataProvider(name = "dataProviderGetMessageWithAAndCEqualsZero")

    public static Object[][] dataProviderGetMessageWithAAndCEqualsZero(){
        return new Object[][] {
                {0, 0.8 , 0, "a<=0, c<=0"},
                {0, 2 , 0, "a<=0, c<=0"},
                {0, 123587 , 0, "a<=0, c<=0"},
                {0, 123.256874569 , 0, "a<=0, c<=0"},
                {0, Double.MAX_VALUE, 0, "a<=0, c<=0"}

        };
    }


    @DataProvider(name = "dataProviderGetMessageWithAAndCLessThanZero")

    public static Object[][] dataProviderGetMessageWithAAndCLessThanZero(){
        return new Object[][] {
                {-1, 0.8, -1, "a<=0, c<=0"},
                {-0.8, 2, -1.6 , "a<=0, c<=0"},
                { -123587, 123587, -123587 ,"a<=0, c<=0"},
                { -123.256874569, 123.256874569, -123.256874569 , "a<=0, c<=0"},
                { -Double.MAX_VALUE, Double.MAX_VALUE,  -Double.MAX_VALUE,"a<=0, c<=0"}


        };
    }

}
