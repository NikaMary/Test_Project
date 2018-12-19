package org.mytests.uiobjects.example.site;

import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import org.mytests.uiobjects.example.entities.User;
import org.mytests.uiobjects.example.site.pages.HomePage;
//import org.mytests.uiobjects.example.site.pages.LoginPage;
import org.mytests.uiobjects.example.site.pages.LoginPageSt;
import org.mytests.uiobjects.example.site.pages.UserPageSt;
import org.mytests.uiobjects.example.site.sections.LoginForm;
import ru.yandex.qatools.allure.annotations.Step;

@JSite("https://www.strava.com")
public class JDIExampleSite extends WebSite {
    public static HomePage homePage;
    public static LoginPageSt loginPageSt;
    public static UserPageSt userPageSt;
    public static LoginForm loginForm;

    //@Css("[id=loginlink]")
   //public static Label loginlink;

    @Step
    public static void login(User user) {
    	//loginlink.click();
        loginForm.loginAs(user);
       
                
    }
}
