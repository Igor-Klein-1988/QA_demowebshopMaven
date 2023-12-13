package com.demowebshop.tests;

import com.demowebshop.pages.JavaScriptAlertsPage;
import com.demowebshop.pages.MultipleWindowsPage;
import org.testng.annotations.Test;

public class MultipleWindowsTests extends TestBase{
    @Test
    public void newTabTest() {
        new MultipleWindowsPage(driver).switchToNextTab(0).verifyTabTitle("Opening a new window");
    }

    @Test
    public void clickHereTest() {
        new MultipleWindowsPage(driver).switchToNextTab(0).clickHere();
    }
}
