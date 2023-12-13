package com.demowebshop.tests;

import com.demowebshop.pages.JavaScriptAlertsPage;
import org.testng.annotations.Test;

public class JavaScriptAlertsTests extends TestBase{
    @Test
    public void newTabTest() {
        new JavaScriptAlertsPage(driver).switchToNextTab(0).verifyTabTitle("JavaScript Alerts");
    }

    @Test
    public void clickForJsAlertTest() {
        new JavaScriptAlertsPage(driver).switchToNextTab(0).clickForJsAlert();
    }

    @Test
    public void clickForJsPromptTest() {
        new JavaScriptAlertsPage(driver).switchToNextTab(0).clickForJsPrompt();
    }

    @Test
    public void clickForJsConfirmTest() {
        new JavaScriptAlertsPage(driver).switchToNextTab(0).clickForJsConfirm();
    }
}
