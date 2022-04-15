package tests;

import org.testng.annotations.Test;
import pages.NavigationMenu;
import utils.BaseTest;

public class TestNavigator extends BaseTest {

    @Test
    public void navigateExample() throws InterruptedException {
        NavigationMenu navigationMenu = new NavigationMenu(driver);
        navigationMenu.navigateTo(navigationMenu.contactLink);
        Thread.sleep(3000);
        navigationMenu.navigateTo(navigationMenu.shopLink);
        Thread.sleep(3000);
        navigationMenu.navigateTo(navigationMenu.loginLink);

    }

}
