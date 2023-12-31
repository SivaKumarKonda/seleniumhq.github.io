package dev.selenium.actions_api;

import dev.selenium.BaseChromeTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;

public class ActionsTest extends BaseChromeTest {
    @Test
    public void pause() {
        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

        long start = System.currentTimeMillis();

        WebElement clickable = driver.findElement(By.id("clickable"));
        Actions a = new Actions(driver);
                a.moveToElement(clickable).pause(Duration.ofSeconds(1));
                a.pause(Duration.ofSeconds(1)).pause(Duration.ofSeconds(1));
                a.clickAndHold().pause(Duration.ofSeconds(1));
                a.pause(Duration.ofSeconds(1)).pause(Duration.ofSeconds(1));
                a.sendKeys("abc").pause(Duration.ofSeconds(1));
                a.perform();
                a.sendKeys(clickable,"siva konda").pause(Duration.ofSeconds(1));
                a.moveToElement(clickable).pause(Duration.ofSeconds(1));


        long duration = System.currentTimeMillis() - start;
        Assertions.assertTrue(duration > 2000);
        Assertions.assertTrue(duration < 30000);
    }

    @Test
    public void releasesAll() {
        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

        WebElement clickable = driver.findElement(By.id("clickable"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(clickable)
                .keyDown(Keys.SHIFT)
                .sendKeys("a")
                .perform();

        ((RemoteWebDriver) driver).resetInputState();

        actions.sendKeys("a").perform();
        Assertions.assertEquals("A", String.valueOf(clickable.getAttribute("value").charAt(0)));
        Assertions.assertEquals("a", String.valueOf(clickable.getAttribute("value").charAt(1)));
    }
}
