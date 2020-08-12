import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LoadPage {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/jonnyfewkes/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://jonnyfewkes.space/Udacity/NeighborhoodMapProject/");
        driver.manage().window().maximize();

        ConfirmPageLoad(driver);

       // driver.quit();
    }


    public static void ConfirmPageLoad(WebDriver driver)
    {
        WebElement title = driver.findElement(By.cssSelector(".head h1"));
        WebElement firstListItem = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[1]/p"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until((ExpectedConditions.textToBePresentInElement(title, "Unique Restaurant Finder")));
        wait.until((ExpectedConditions.textToBePresentInElement(firstListItem, "Six Sisters")));
        //get rid of the tutorial message
        driver.findElement(By.id("myIcon")).click();
    }



}
