package data;

import org.testng.annotations.DataProvider;

public class StaticProvider {

    @DataProvider (name = "dataForSum")
    public static Object[][] dataForSumFunction() {
        return new Object[][] {
                {-2, -3, -5},
                {0, 0, 0},
                {2, 3, 5}
        };
    }

    @DataProvider (name = "dataForMulti")
    public static Object[][] dataForMultiFunction() {
        return new Object[][] {
                {0, 5, 0},
                {3, 2, 6},
                {-1, 2, -2}
        };
    }
}
