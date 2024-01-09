package dev.selenium.elementLocators;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class CSSLocatorTest
{
    @Test
    public void cSSLocatorTest ()
    {

        // Initialize ChromeDriver
        RemoteWebDriver driver = new ChromeDriver();

        // Navigate to a sample webpage
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        // Examples of CSS Selectors
        // 1. By ID
        //WebElement elementById = driver.findElement(By.cssSelector("#elementId"));
        WebElement selementById = driver.findElement(By.cssSelector("#my-text-id"));
        selementById.click();
        Assertions.assertEquals(true, selementById.isEnabled());
        selementById.sendKeys("selementById");
        Assertions.assertEquals("selementById", selementById.getAttribute("value"));
        selementById.clear();

        // 2. By Class Name
        //WebElement elementByClassName = driver.findElement(By.cssSelector(".className"));
        WebElement selementByClassName = driver.findElement(By.cssSelector(".form-control"));
        selementByClassName.sendKeys("selementByClassName");
        Assertions.assertEquals("selementByClassName",
            selementByClassName.getAttribute("value"));
        selementByClassName.clear();
        // 3. By Tag Name
        //WebElement elementByTagName = driver.findElement(By.cssSelector("tagName"));
        WebElement selementByTagName = driver.findElement(By.cssSelector("textarea"));
        selementByTagName.sendKeys("selementByTagName");
        Assertions.assertEquals("selementByTagName", selementByTagName.getAttribute("value"));
        selementByTagName.clear();

        // 4. By Attribute
        //WebElement elementByAttribute = driver.findElement(By.cssSelector("[attributeName='value']"));
        WebElement selementByAttribute = driver.findElement(By.cssSelector(
            "[id='my-text-id']"));
        selementByAttribute.sendKeys("[id='my-text-id']");
        Assertions.assertEquals("[id='my-text-id']",
            selementByAttribute.getAttribute("value"));
        selementByAttribute.clear();

        // 5. By Attribute Prefix
        //WebElement elementByAttributePrefix = driver.findElement(By.cssSelector("[attributeName^='prefix']"));

        // 6. By Attribute Contains
        //WebElement elementByAttributeContains = driver.findElement(By.cssSelector("[attributeName*='value']"));

        // 7. By Attribute Ends With
        //WebElement elementByAttributeEndsWith = driver.findElement(By.cssSelector("[attributeName$='suffix']"));

        // 8. By Descendant
        // WebElement elementByDescendant = driver.findElement(By.cssSelector("ancestorTag descendantTag"));

        // 9. By Child
        //WebElement elementByChild = driver.findElement(By.cssSelector("parentTag > childTag"));

        // 10. By First Child
        //WebElement elementByFirstChild = driver.findElement(By.cssSelector("parentTag > :first-child"));

        // 11. By Last Child
        //WebElement elementByLastChild = driver.findElement(By.cssSelector("parentTag > :last-child"));

        // 12. By Nth Child
        //WebElement elementByNthChild = driver.findElement(By.cssSelector("parentTag > :nth-child(n)"));

        // 13. By Element with Specific Text
        //WebElement elementByText = driver.findElement(By.cssSelector(":contains('text')"));

        // 14. By Visible Text
        //WebElement elementByVisibleText = driver.findElement(By.cssSelector(":containsOwn('text')"));

        // 15. By Attribute Existence
        //WebElement elementByAttributeExistence = driver.findElement(By.cssSelector("[attributeName]"));

        // Close the browser
        driver.quit();
    }
}


