package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class MultipleWindowsPage extends BasePage {
    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(.,'Multiple Windows')]")
    WebElement multipleWindowsLink;

    public MultipleWindowsPage switchToNextTab(int index) {
        clickWithJSExecuter(multipleWindowsLink, 0, 800);
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));

        return this;
    }

    @FindBy(xpath = "//h3")
    WebElement multipleWindowsTitle;

    public MultipleWindowsPage verifyTabTitle(String text) {
        Assert.assertTrue(shouldHaveText(multipleWindowsTitle, text, 25));
        return this;
    }

    @FindBy(css = "a:nth-child(2)")
    WebElement clickHere;

    public MultipleWindowsPage clickHere() {
        click(clickHere);
        return new MultipleWindowsPage(driver);
    }
}
