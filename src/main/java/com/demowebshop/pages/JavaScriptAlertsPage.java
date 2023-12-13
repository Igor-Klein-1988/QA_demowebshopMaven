package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class JavaScriptAlertsPage extends BasePage {
    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//a[contains(.,'JavaScript Alerts')]")
    WebElement javaScriptAlertsLink;

    public JavaScriptAlertsPage switchToNextTab(int index) {
        clickWithJSExecuter(javaScriptAlertsLink, 0, 300);
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));

        return this;
    }


    @FindBy(xpath = "//h3")
    WebElement javaScriptAlertsTitle;

    public JavaScriptAlertsPage verifyTabTitle(String text) {
        Assert.assertTrue(shouldHaveText(javaScriptAlertsTitle, text, 15));
        return this;
    }



    @FindBy(xpath = "//ul/li[1]/button")
    WebElement clickForJsAlert;

    public JavaScriptAlertsPage clickForJsAlert() {
        click(clickForJsAlert);
        return new JavaScriptAlertsPage(driver);
    }

    @FindBy(css = "ul li:nth-child(2) button")
    WebElement clickForJsConfirm;

    public JavaScriptAlertsPage clickForJsConfirm() {
        click(clickForJsConfirm);
        return new JavaScriptAlertsPage(driver);
    }

    @FindBy(css = "button[onclick='jsPrompt()']")
    WebElement clickForJsPrompt;

    public JavaScriptAlertsPage clickForJsPrompt() {
        click(clickForJsPrompt);
        return new JavaScriptAlertsPage(driver);
    }
}
