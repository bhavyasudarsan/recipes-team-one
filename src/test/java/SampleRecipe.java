import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleRecipe {
    private static final Logger logger = LoggerFactory.getLogger(SampleRecipe.class);

    @Test
    void setUp(){
        logger.info("sample log");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.tarladalal.com/");
    }
}
