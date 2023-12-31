package dev.selenium.waits;

import dev.selenium.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class WaitsTest extends BaseTest
{
    @Test
    public void fails ()
    {
        startChromeDriver(new ChromeOptions());

        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.findElement(By.id("adder")).click();

//with out lamda expresion
        Executable executable = new Executable()
        {
            @Override
            public void execute () throws Throwable
            {
                driver.findElement(By.id("box0"));
            }
        };
        Assertions.assertThrows(NoSuchElementException.class, executable);

        //lamda expression
        Assertions.assertThrows(
            NoSuchElementException.class,
            () -> driver.findElement(By.id("box0"))
           );

    }

    @Test
    public void sleep ()
    {
        startChromeDriver(new ChromeOptions());

        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.findElement(By.id("adder")).click();

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement added = driver.findElement(By.id("box0"));

        Assertions.assertEquals("redbox", added.getDomAttribute("class"));
        Assertions.assertEquals("box0", added.getDomAttribute("id"));
    }

    @Test
    public void implicit ()
    {
        startChromeDriver(new ChromeOptions());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.findElement(By.id("adder")).click();

        WebElement added = driver.findElement(By.id("box0"));

        Assertions.assertEquals("redbox", added.getDomAttribute("class"));
    }

    @Test
    public void explicit ()
    {
        startChromeDriver(new ChromeOptions());

        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        WebElement revealed = driver.findElement(By.id("revealed"));
        driver.findElement(By.id("reveal")).click();

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        final Boolean until = wait.until(driver -> revealed.isDisplayed());
        final String until1 = wait.until(d -> revealed.getDomProperty("value"));

        revealed.sendKeys("Displayed");
        Assertions.assertEquals("Displayed", revealed.getDomProperty("value"));
    }

    @Test
    public void explicitWithOptions ()
    {
        startChromeDriver(new ChromeOptions());

        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        WebElement revealed = driver.findElement(By.id("revealed"));
        driver.findElement(By.id("reveal")).click();



        Wait<WebDriver> wait =
            new FluentWait<WebDriver>(driver);
      ((FluentWait)wait).withTimeout(Duration.ofSeconds(2));
      ((FluentWait)wait).pollingEvery(Duration.ofMillis(300));
      ((FluentWait)wait).ignoring(ElementNotInteractableException.class);

        wait.until(
            d -> {
                revealed.sendKeys("Displayed");
                return true;
            });

        Assertions.assertEquals("Displayed", revealed.getDomProperty("value"));
    }
}
