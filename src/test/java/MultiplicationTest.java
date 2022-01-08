import data.StaticProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationTest {

    Calculator calc = new Calculator("MultiplicationTest");

    @Test
    public void multiTest1() {
        Assert.assertEquals(calc.multiplication(5, 3), 15);
    }

    @Test(dataProvider = "dataForMulti", dataProviderClass = StaticProvider.class)
    public void dataProviderMultiTest(int a, int b, int expectedResult) {
        Assert.assertEquals(calc.multiplication(a, b), expectedResult);
    }

    @Test(description = "The test for multiplication")
    public void multiTest3() {
        System.out.println("This is MultiplicationTest");
    }
}
