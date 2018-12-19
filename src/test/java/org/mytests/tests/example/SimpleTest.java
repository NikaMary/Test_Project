package org.mytests.tests.example;

import org.mytests.uiobjects.example.entities.User;
import org.testng.annotations.Test;

import static org.mytests.uiobjects.example.site.JDIExampleSite.homePage;
import static org.mytests.uiobjects.example.site.JDIExampleSite.loginPageSt;
import static org.mytests.uiobjects.example.site.JDIExampleSite.userPageSt;
import static org.mytests.uiobjects.example.site.JDIExampleSite.login;

public class SimpleTest extends TestsInit {

    @Test
    public void loginTest() {
        loginPageSt.open();
        login(new User());
       // homePage.checkOpened();
    	userPageSt.open();
    	userPageSt.checkOpened();
    }
}
