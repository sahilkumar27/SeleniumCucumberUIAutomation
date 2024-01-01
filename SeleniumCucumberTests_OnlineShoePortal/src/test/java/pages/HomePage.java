package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {

    public static String hamburger_menu_xpath = "//div[@id='menuToggle']/child::input";
    public static String signIn_link_xpath = "//ul[@id='menu']/a[@href='SignIn.html']/child::li";


    public static void click_hamburger_menu() throws InterruptedException {
        Thread.sleep(2000);
       driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }

    public static void click_signIn_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(signIn_link_xpath)).click();
    }

}