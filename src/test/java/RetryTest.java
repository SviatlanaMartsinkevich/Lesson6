import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class RetryTest  {

    public int attempt = 1;

    @Test(retryAnalyzer = Retry.class)
    public void flakyTest() {
        if (attempt == 4) {
            Assert.assertTrue(true);
        } else {
            System.out.println(attempt);
            attempt++;
            throw new NullPointerException();
        }
    }
}
