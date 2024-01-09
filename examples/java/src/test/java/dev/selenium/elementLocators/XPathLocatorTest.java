package dev.selenium.elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocatorTest
{
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a sample webpage
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        // Examples of XPath Selectors
        // 1. By Absolute XPath
        WebElement elementByAbsoluteXPath = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/h1"));

        // 2. By Relative XPath
        WebElement elementByRelativeXPath = driver.findElement(By.xpath("//div[@class='className']"));

        // 3. By Tag Name
        WebElement elementByTagName = driver.findElement(By.xpath("//tagName"));

        // 4. By Attribute
        WebElement elementByAttribute = driver.findElement(By.xpath("//input[@name='username']"));

        // 5. By Contains in Attribute Value
        WebElement elementByContains = driver.findElement(By.xpath("//input[contains(@class, 'partialClass')]"));

        // 6. By Text Content
        WebElement elementByTextContent = driver.findElement(By.xpath("//*[text()='TextValue']"));

        // 7. By Parent-Child Relationship
        WebElement elementByParentChild = driver.findElement(By.xpath("//parentTag/childTag"));

        // 8. By Following Sibling
        WebElement elementByFollowingSibling = driver.findElement(By.xpath("//preceding-sibling::siblingTag"));

        // 9. By Position (Index)
        WebElement elementByPosition = driver.findElement(By.xpath("(//tagName)[2]"));

        // 10. By Logical AND (Multiple Conditions)
        WebElement elementByLogicalAnd = driver.findElement(By.xpath("//input[@name='username' and @type='text']"));

        // 11. By Logical OR (Multiple Conditions)
        WebElement elementByLogicalOr = driver.findElement(By.xpath("//input[@name='username' or @name='password']"));

        // 12. By Element with Specific Text
        WebElement elementByText = driver.findElement(By.xpath("//*[contains(text(), 'text')]"));

        // 13. By Element with Specific Partial Text
        WebElement elementByPartialText = driver.findElement(By.xpath("//*[contains(text(), 'partialText')]"));

        // Close the browser
        driver.quit();
    }
}


