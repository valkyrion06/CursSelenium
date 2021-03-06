package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.NavigationMenu;
import utils.BaseTest;
import utils.ImportPropertiesFile;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginTest extends BaseTest {

    @Parameters({"user", "pass"})

    public void loginTest(String username, String password) {
        NavigationMenu navMenu = new NavigationMenu(driver);
        navMenu.navigateTo(navMenu.loginLink);

        LoginPage loginPage =  new LoginPage(driver);
        loginPage.loginInApp(username, password);


    }
    @Test
    public void logInFromFile() throws IOException {
        ImportPropertiesFile importPropertiesFile = new ImportPropertiesFile();
        NavigationMenu navMenu = new NavigationMenu(driver);
        navMenu.navigateTo(navMenu.loginLink);

        LoginPage loginPage =  new LoginPage(driver);
        String password = importPropertiesFile.readPropertiesFile("password");

        String username = importPropertiesFile.readPropertiesFile("username");
        //String password = importPropertiesFile.readPropertiesFile("password");
        //System.out.println(password);
        loginPage.loginInApp(username, password);

    }

}
