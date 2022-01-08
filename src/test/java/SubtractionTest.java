import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractionTest {
    Calculator calc = new Calculator("SubtractionTest");

    @Test(priority = 1)
    public void subTest1() {
        Assert.assertEquals(calc.sub(6, 2), 4);
    }

    @Test(priority = 2, invocationCount = 4)
    public void subTest2() {
        Assert.assertEquals(calc.sub(7, 2), 5);
    }

    @Test(priority = 2, invocationCount = 4, threadPoolSize = 2)
    public void subTest3() {
        Assert.assertEquals(calc.sub(8, 6), 2);
    }

    @Test(priority = 1)
    public void subTest4() {
        System.out.println("This is SubtractionTest");
    }
}
