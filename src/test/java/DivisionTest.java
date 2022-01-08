import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTest extends BaseTest {
    Calculator calc = new Calculator("DivisionTest");

    @Test
    public void divTest1() {
        Assert.assertEquals(calc.division(6, 2), 3);
    }

    public int a = 36;
    public int b = 10;
    public int attempt = 1;

    @Test(retryAnalyzer = Retry.class)
    public void flakyDivTest() {
        if (calc.division(a, b) == 3.0) {
            Assert.assertTrue(true);
        } else {
            System.out.println("Attempt number: " + attempt + " failed");
            attempt++;
            System.out.println("Please change data");
            b++;
            throw new NullPointerException();
        }
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void divTest2() {
        System.out.println("a / b = " + (a / 0));
    }
}
